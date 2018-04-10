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

    public Boolean RunAway() {

        String result = "success";

            System.out.println("제발 따라오지마라 ㅠㅠㅠㅠㅠㅠ");
            int randomNum = random.nextInt(100);
            if(randomNum > 80 ) return true;
            else return false;

    } // 도망의 성공여부만 리턴합니다.

    public int Harden(int PlayerDef) {
        System.out.println("바위처럼 단단하게~~");
        int result =  PlayerDef * 2;
        return result;

    } //그냥 상승하는 방어력만 리턴합니다.

    public int defensive_wall(int PlayerAtk,int PlayerHP,int EnemyATK,int EnemyHP) {

        System.out.println("니 공격은 소용없다");

        PlayerHP += EnemyATK;//상대 공격력만큼 체력회복



    } // 회복되는 량만 리턴합니다.


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

