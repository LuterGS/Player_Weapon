import java.util.Random;

public class Attack_2 implements Skill{

    private Random random = new Random();

    private String[] Skillname = new String[3];

    public Attack_2(){

        System.out.println("스킬 Attack 생성, 값은 랜덤으로 생성됩니다.");
        this.Skillname[0] = "럭키펀치";

    }

    //럭키펀치
    @Override
    public double[] Skill_1(Player_1st player1, Monster monster, double AD[]) {

        //1~5배만큼의 공격력으로 공격

        System.out.println("럭키 펀치!");
        int gop_damage = random.nextInt(4) +1;
        AD[0] *= gop_damage;
        return AD;
    }

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
        return this.Skillname[num-1];
    }
}
