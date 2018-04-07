import java.util.Random;

public class Attack implements Skill {

    private Random random = new Random();
    private String[] Skillname = new String[3];
    private int[] Atk_num = new int[3];
    private int[] Def_num = new int[3];

    public Attack(){

        this.Skillname[0] = "회전베기";
        this.Skillname[0] = "참격";
        this.Skillname[0] = "밀어차기";
        Atk_num[0] = 6 + random.nextInt(2);
        Atk_num[1] = 8 + random.nextInt(2);
        Atk_num[2] = 5 + random.nextInt(2);
        Def_num[0] = 2 + random.nextInt(2);
        Def_num[1] = 0 + random.nextInt(2);
        Def_num[2] = 3 + random.nextInt(2);
    }



    public void use_skill(int num){

        String skill_name = null;

        if(num == 1){
            skill_name = this.Skillname[0];
        }else if(num == 2){
            skill_name = this.Skillname[1];
        }else if(num == 3){
            skill_name = this.Skillname[2];
        }
        print_skilluse(skill_name, num);

    }
}
