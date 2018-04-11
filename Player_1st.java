import java.util.Scanner;

public class Player_1st{
//1차 플레이어 정보

    protected Scanner scan = new Scanner(System.in);
    protected String name;
    protected double HP, ATK, DEF;
    protected int HP_max, exp, exp_max, level;
    protected final int level_max = 30;
    //이름, HP, MP, Level, exp 구현.

    protected Skill first = null;
    protected Weapon MyWeapon = null;
    //스킬셋 하나와, 무기 하나


    Player_1st(String name){
        this();
        this.name = name;
    }

    Player_1st() {
        this.HP = 100;
        this.ATK = 50;
        this.DEF = 50;
        this.level = 1;
        this.HP_max = 100;
        this.exp_max = 1000;

        this.MyWeapon = new Weapon(0);
        System.out.println("무기 획득, 무기 이름은 " + this.MyWeapon.get_name());
        System.out.printf("공걱력 : %d, 방어력 : %d\n", this.MyWeapon.getValue(1),this.MyWeapon.getValue(2));

        change_skill("Attack");
    }
    //기본 생성자, 1렙때 생성하면 이렇게 됨

    public String getName(){
        return this.name;
    }

    public double getHP(){
        return this.HP;
    }

    protected void level_up(){
        this.exp_max += 100 * this.level;
        this.HP_max += 10 * this.level;
        this.ATK += 5 * this.level;
        this.DEF += 5 * this.level;
        this.level++;
        this.exp = 0;
        this.HP = this.HP_max;
    }
    //레벨업 시 변경되는 점을 구현한 메소드. 추가 필요


    //스킬셋 바꾸는 메소드
    public void change_skill(String type){

        if(type.equals("Attack")){
            this.first = new Attack();
            System.out.println("스킬셋 Attack 으로 변경");
        }
        else if(type.equals("Defense")){
            this.first = new Defense();
            System.out.println("스킬셋 Defense 으로 변경");
        }
    }

    //무기 얻는 메소드
    public void get_Weapon() {

        int Tier = this.MyWeapon.getValue(3) + 1;
        this.MyWeapon = new Weapon(Tier);
        System.out.println("무기 획득, 무기 이름은 " + this.MyWeapon.get_name());
        System.out.printf("공걱력 : %d, 방어력 : %d, 티어 : %d\n", this.MyWeapon.getValue(0),this.MyWeapon.getValue(1), this.MyWeapon.getValue(2));
    }

    //플레이어(this)가 몬스터(monster)를 공격하는 메서드
    //모든 공격들은 플레이어의 선공으로 시작된다고 생각하며 메서드 작성
    public double[] MyTurn(Monster monster){

        int select;
        double value[] = {this.ATK, this.DEF};
        double output[] = new double[2];
        //2개형 return, 첫번째는 공격력, 두번째는 방어력;

        System.out.println("몬스터를 공격합니다");

        if(this.first instanceof Attack){
            System.out.println("현재 스킬셋은 Attack 입니다");
        }else if(this.first instanceof Defense){
            System.out.println("현재 스킬셋은 Defense 입니다");
        }

        this.first.show_skill(); // 스킬셋의 스킬 목록을 출력해주는 함수

        System.out.println("사용할 스킬 숫자를 입력해주세요: ");
        select = scan.nextInt();

        switch (select){
            case 0:
                output = this.first.Skill_1(this, monster, value);
                break;
            case 1:
                output = this.first.Skill_2(this, monster, value);
                break;
            case 2:
                output = this.first.Skill_3(this, monster, value);
                break;
        }
        return output;
    }

    public void attacked(double Damage){

        if(Damage < 0){
            System.out.printf("%s의 방어력이 높습니다! 데미지를 1만 받습니다. ", this.name);
            Damage = 1;
        }else{
            System.out.printf("%s(이/가) 공격을 받았습니다! 받은 데미지 : %.1f, ", this.name, Damage);
        }
        System.out.printf("체력 %.1f에서 ", this.HP);
        this.HP -= Damage;
        System.out.printf("%.1f로 감소.\n", this.HP);
    }



}
