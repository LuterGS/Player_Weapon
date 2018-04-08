public class Player_2nd extends Player_1st {

    Skill second = null;


    public Player_2nd() {
        super();
    }

    public Player_2nd(Player_1st Player1){
        this();
        this.name = Player1.name;
        this.HP = Player1.HP;
        this.MP = Player1.MP;
        this.level = Player1.level;
        this.HP_max = Player1.HP_max;
        this.MP_max = Player1.MP_max;
        this.exp_max = Player1.exp_max;
    }


}
