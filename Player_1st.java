public class Player_1st implements Skill {

    private String name;
    private int HP;
    private int MP;
    private int level;
    private int exp;
    private int HP_max;
    private int MP_max;
    private int level_max = 30;
    private int exp_max;
    Skill first = null;

    public Player_1st(String name){
        this.name = name;
        this.HP = 100;
        this.MP = 100;
        this.level = 1;
        this.HP_max = 100;
        this.MP_max = 100;
        this.exp_max = 1000;
    }

    public void Level_up(){
        this.exp_max += 50 * this.level;
        this.HP_max += 10 * this.level;
        this.MP_max += 8 * this.level;
        this.level++;
        this.exp = 0;
        this.HP = this.HP_max;
        this.MP = this.MP_max;
    }


    public void Change_Skill(Object Skill){

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



}