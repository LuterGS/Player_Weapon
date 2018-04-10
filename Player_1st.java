import java.util.Scanner;

public class Player_1st{
//1차 플레이어 정보

    protected Scanner scan = new Scanner(System.in);
    protected String name;
    protected int HP;
    protected int ATK;
    protected int DEF;
    protected int level;
    protected int exp;
    protected int HP_max;
    protected final int level_max = 30;
    protected int exp_max;
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
    }
    //기본 생성자, 1렙때 생성하면 이렇게 됨

    protected void level_up(){
        this.exp_max += 50 * this.level;
        this.HP_max += 10 * this.level;
        this.ATK += 5 * this.level;
        this.DEF += 5 * this.DEF;
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
    public void get_Weapon(int Tier) {

        this.MyWeapon = new Weapon();
        System.out.println("무기 획득");
        System.out.println("무기 이름은 " + this.MyWeapon.get_name());
        System.out.printf("공걱력 : %d, 방어력 : %d\n",
                this.MyWeapon.getValue(1),this.MyWeapon.getValue(2));
    }

    //플레이어(this)가 몬스터(monster)를 공격하는 메서드
    public void attackMonster(Monster monster){

        String skillSet = this.first.getClass().getName();
        // 현재 스킬셋이 Attack인지 Defense인지
        int select;
        Attack attack = new Attack();
        Defense defense = new Defense();

        System.out.println("몬스터를 공격합니다");

        System.out.printf("현재 스킬셋은 %s입니다\n",skillSet);
        this.first.show_skill(); // 스킬셋의 스킬 목록을 출력해주는 함수

        System.out.println("사용할 스킬 숫자를 입력해주세요: ");
        select = scan.nextInt();

        if(skillSet == "Attack"){
            switch (select){
                case 1:
                    false_Swipe();
                    break;
                case 2:
                    double_Edge();
                    break;
                case 3:
                    sword_Dance();
                    break;
            }
        }else{
            switch (select){
                case 1:
                    runAway();
                    break;
                case 2:
                    Harden();
                    break;
                case 3:
                    defensive_wall();
                    break;
            }
        }






        //this.HP -= (this.DEF - monster.ARK);

    }



}
