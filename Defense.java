import java.util.Random;

public class Defense implements Skill {

    private Random random = new Random();

    private String[] Skillname = new String[3];

    public Defense(){

        System.out.println("스킬 Defence 생성.");
        this.Skillname[0] = "도망";
        this.Skillname[1] = "단단해지기";
        this.Skillname[2] = "방벽";

        //처음 생성할 때 Setting.
    }

    //도망 메소드 - 일정 확률로 도망, 도망 성공시 전투 종료, 아닐시 그냥 맞음
    @Override
    public double[] Skill_1(Player_1st player1,Monster monster, double AD[]) {

            System.out.println("제발 따라오지마라 ㅠㅠㅠㅠㅠㅠ");

            int randomNum = random.nextInt(100);

            if(randomNum > 80 ){
                System.out.println("도망에 성공했다아아");
                AD[0] = -9999;
                AD[1] = -9999;
            }else{
                System.out.println("어딜 도망가");
                AD[0] = 0;
            }

            return AD;

    }

    //단단해지기 - 방어력 2배
    @Override
    public double[] Skill_2(Player_1st player1, Monster monster, double AD[]) {

        System.out.println("바위처럼 단단하게~~");
        AD[1] *= 2;

        return AD;
    }

    //방벽 - 상대의 공격력만큼 체력 회복
    @Override
    public double[] Skill_3(Player_1st player1, Monster monster, double AD[]) {

        System.out.printf("니 공격은 소용없다! 체력 %f만큼 회복\n", monster.get_ATK());
        player1.HP += monster.get_ATK();
        return AD;
    }

    @Override
    public void show_skill() {
        int a;

        for (a = 0; a < 3; a++) {
            System.out.printf("스킬 %d : %s,\n", a, this.Skillname[a]);
        }
    }

    @Override
    public String return_name(int num) {
        return null;
    }
}

