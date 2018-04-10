import java.util.Scanner;

public class Player_1st{
//1차 플레이어 정보

    protected Scanner scan = new Scanner(System.in);
    protected String name;
    protected int HP;
    protected int ATK;
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
        this.level = 1;
        this.HP_max = 100;
        this.exp_max = 1000;
    }
    //기본 생성자, 1렙때 생성하면 이렇게 됨

    protected void level_up(){
        this.exp_max += 50 * this.level;
        this.HP_max += 10 * this.level;
        this.ATK += 5 * this.level;
        this.level++;
        this.exp = 0;
        this.HP = this.HP_max;-
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


}
