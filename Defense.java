import java.util.Random;

public class Defense implements Skill {

    private Random random = new Random();

    private String[] Skillname = new String[3];
    private int[] Atk_num = new int[3];
    private int[] Def_num = new int[3];



    @Override
    public void show_skill() {
        int a;

        for (a = 0; a < 3; a++) {
            System.out.printf("스킬 1 : %s, 공격력 : %d, 방어력 : %d\n", this.Skillname[a], this.Atk_num[a], this.Def_num[a]);
        }
    }

    public Defense(){

        System.out.println("스킬 Defence 생성, 값은 랜덤으로 생성됩니다.");
        this.Skillname[0] = "도망";
        this.Skillname[1] = "단단해지기";
        this.Skillname[2] = "방벽";

        //처음 생성할 때 Setting.
    }

    public void RunAway(Player_1st player1,Monster monster) {

            System.out.println("제발 따라오지마라 ㅠㅠㅠㅠㅠㅠ");

            int randomNum = random.nextInt(100);

            if(randomNum > 80 ){
                System.out.println("도망에 성공했다아아");
                return;
            }else{
                System.out.println("어딜 도망가");
                monster.attackPlayer(player1);
            }

    }

    public void Harden(Player_1st player1, Monster monster) {

        System.out.println("바위처럼 단단하게~~");

        player1.DEF *= 2;

        monster.attackPlayer(player1);


    }

    public void defensive_wall(Player_1st player1, Monster monster) {

        monster.attackPlayer(player1);

        System.out.println("니 공격은 소용없다");
        player1.HP += monster.ATK;

    }


    @Override
    public int return_atk(int num) {
        return 0;
    }


    @Override
    public int return_def(int num) {
        return 0;
    }

    @Override
    public String return_name(int num) {
        return null;
    }
}

