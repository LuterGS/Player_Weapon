import java.util.Random;

public class Monster {

    private Random random = new Random();
    private String name, type;
    private int HP, ATK, DEF;

    public Monster(int player_level){

        int type_int = random.nextInt(2);

        if(type_int == 0){
            this.type = "Fire";
        }else if(type_int == 1){
            this.type = "Ice";
        }else{
            this.type = "Dark";
        }
        this.name = Events.set_name("몬스터");

        this.HP = 100 + (player_level * (50 + random.nextInt(20) - 10));
        this.ATK = 30 + (player_level * (10 + random.nextInt(4) - 2));
        this.DEF = 20 + (player_level * (10 + random.nextInt(4) - 2));
    }

    //몬스터(this)가 플레이어(player)를 공격하는 메서드
    public void attackPlayer(Player_1st player){
        System.out.println("플레이어를 공격합니다.");
        System.out.printf("ATK: %d, DEF: %d로 공격\n", this.ATK, this.DEF);

        int damage = player.DEF - this.ATK;
        player.HP -= damage;
    }
}
