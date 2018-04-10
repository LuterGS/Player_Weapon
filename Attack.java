import java.util.Random;

public class Attack implements Skill {
//공격형 스킬셋, 속성에 따른 수치 부여 필요

    private Random random = new Random();

    private String[] Skillname = new String[3];
    private int[] Atk_num = new int[3];
    private int[] Def_num = new int[3];
    //스킬 종류 3개, 개당 공격\방어 수치 각각 1개씩 가짐

    public Attack(){

        System.out.println("스킬 Attack 생성, 값은 랜덤으로 생성됩니다.");
        this.Skillname[0] = "회전베기";
        this.Skillname[1] = "참격";
        this.Skillname[2] = "밀어차기";

        this.Atk_num[0] = 6 + random.nextInt(3);
        this.Atk_num[1] = 8 + random.nextInt(3);
        this.Atk_num[2] = 5 + random.nextInt(3);

        this.Def_num[0] = 2 + random.nextInt(3);
        this.Def_num[1] = random.nextInt(3);
        this.Def_num[2] = 3 + random.nextInt(3);
        //처음 생성할 때 Setting.
    }


    @Override
    public void show_skill() {

        int a;

        for (a = 0; a < 3; a++) {
            System.out.printf("스킬 1 : %s, 공격력 : %d, 방어력 : %d\n", this.Skillname[a], this.Atk_num[a], this.Def_num[a]);
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
