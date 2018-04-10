import java.util.Random;

public class Defense2 {

    private Random random = new Random();


    private String[] Skillname = new String[1];
    private int[] Atk_num = new int[1];
    private int[] Def_num = new int[1];



    @Override
    public void show_skill() {
        int a;

        for (a = 0; a < 3; a++) {
            System.out.printf("스킬 1 : %s, 공격력 : %d, 방어력 : %d\n", this.Skillname[a], this.Atk_num[a], this.Def_num[a]);
        }
    }

    public Defense2(){

        System.out.println("스킬 Defense#2 생성, 값은 랜덤으로 생성됩니다.");
        this.Skillname[0] = "신의 은총";


        //처음 생성할 때 Setting.
    }

    public int DivineFavor(int PlayerDef) {

        int afterDef;

        System.out.println("놈들은 뭐에 단단해졌는지 모를겁니다.");
        afterDef = PlayerDef * (1+random.nextInt(2));

        return afterDef;

    }//랜덤으로 기존 방어력의 n배 증가
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
