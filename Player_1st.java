public class Player_1st implements Skill {

    protected String name;
    protected int HP;
    protected int MP;
    protected int level;
    protected int exp;
    protected int HP_max;
    protected int MP_max;
    protected int level_max = 30;
    protected int exp_max;

    protected Skill first = null;
    protected Weapon MyWeapon = null;

    Player_1st(String name){
        this();
    }

    Player_1st() {
        this.name = name;
        this.HP = 100;
        this.MP = 100;
        this.level = 1;
        this.HP_max = 100;
        this.MP_max = 100;
        this.exp_max = 1000;
    }

    private void level_up(){
        this.exp_max += 50 * this.level;
        this.HP_max += 10 * this.level;
        this.MP_max += 8 * this.level;
        this.level++;
        this.exp = 0;
        this.HP = this.HP_max;
        this.MP = this.MP_max;
    }


    public void change_skill(Object Skill){

        if(Skill instanceof Attack){
            this.first = (Attack) Skill;
            System.out.println("스킬셋 Attack 으로 변경");
        }
        else if(Skill instanceof Defense){
            this.first = (Defense) Skill;
            System.out.println("스킬셋 Defense 으로 변경");
        }
        else if(Skill instanceof Utility){
            this.first = (Utility) Skill;
            System.out.println("스킬셋 Utility 으로 변경");
        }
    }

    public void get_Weapon(int Tier) {

        this.MyWeapon = new Weapon(Tier);
        System.out.println("무기 획득");
        System.out.println("무기 이름은 " + this.MyWeapon.get_name());
        System.out.printf("공걱력 : %d, 방어력 : %d, Tier: %d\n", this.MyWeapon.getValue(1),this.MyWeapon.getValue(2),this.MyWeapon.getValue(3));
    };


}
