import java.util.Random;

public class Attack_2 implements Skill{

    private Random random = new Random();

    private String[] Skillname = new String[3];
    private int[] Atk_num = new int[3];
    private int[] Def_num = new int[3];
    private int[] posibility = new int [3];

    public Attack_2(){

        System.out.println("스킬 Attack 생성, 값은 랜덤으로 생성됩니다.");
        this.Skillname[0] = "럭키펀치";

    }

    public void lucky_Punch(Player_1st player1, Monster monster){

        //1~5배만큼의 공격력으로 공격

        System.out.println("럭키 펀치!");
        this.posibility[0] = random.nextInt(4) +1;
        player1.ATK = player1.ATK * this.posibility[0];
    }

    @Override
    public void show_skill() {

        int a;

        for (a = 0; a < 1; a++) {
            System.out.printf("스킬 %d : %s, 공격력 : %d, 방어력 : %d\n", a, this.Skillname[a], this.Atk_num[a], this.Def_num[a]);
        }
    }

    @Override
    public int return_atk(int num) {
        return this.Atk_num[num-1];
    }

    @Override
    public int return_def(int num) {
        return this.Def_num[num-1];
    }

    @Override
    public String return_name(int num) {
        return this.Skillname[num-1];
    }
}
