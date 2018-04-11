import java.util.Random;

public class Defense2 implements Skill{

    private Random random = new Random();


    private String[] Skillname = new String[1];

    public Defense2(){

        System.out.println("스킬 Defense#2 생성, 값은 랜덤으로 생성됩니다.");
        this.Skillname[0] = "신의 은총";


        //처음 생성할 때 Setting.
    }

    //Defense_1_skill
    @Override
    public double[] Skill_1(Player_1st player1, Monster monster, double AD[]) {

        System.out.println("놈들은 뭐에 단단해졌는지 모를겁니다.");
        AD[1] = AD[1] * (1+random.nextInt(2));
        return AD;
    }

    //Defense_2_skill
    @Override
    public double[] Skill_2(Player_1st player1, Monster monster, double AD[]) {

        System.out.println("스킬 2");
        return AD;
    }

    @Override
    public double[] Skill_3(Player_1st player1, Monster monster, double AD[]) {

        System.out.println("스킬 3");
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
