import java.util.Random;

public class Attack implements Skill {
//공격형 스킬셋, 속성에 따른 수치 부여 필요

    private Random random = new Random();

    private String[] Skillname = new String[3];
    private int[] Atk_num = new int[3];
    private int[] Def_num = new int[3];
    private int[] posibility = new int [3];
    //스킬 종류 3개, 개당 공격\방어 수치 각각 1개씩 가짐

    public Attack(){

        System.out.println("스킬 Attack 생성, 값은 랜덤으로 생성됩니다.");
        this.Skillname[0] = "칼등치기";
        this.Skillname[1] = "이판사판 태클";
        this.Skillname[2] = "칼춤";
    }

    //칼등치기 메소드
    public void false_Swipe(Player_1st player1, Monster monster){

        //false_Swipe == 칼등치기
        //확률에 따라 성공,실패 갈림
        //성공 -> 1배 공격력, 상대 공격력만큼 회복(딜 받고 그만큼 회복이라 쌤쌤 ㅎ)

        this.posibility[0] = random.nextInt(4);


        if (this.posibility[0] > 2){
            System.out.println("칼등치기 성공!");
            player1.HP += (player1.DEF-monster.ATK);
        }else{
            //칼등치기에 실패하면 플레이어는 그대로 공격받음
            System.out.println("칼등치기 실패!");
            monster.attackPlayer(player1);
        }
    }

    //이판사판태클 메소드
    public void double_Edge(Player_1st player1, Monster monster){

        //double_Edge == 이판사판태클
        //3배 데미지
        //랜덤 수치만큼 자신의 체력 감소

        this.posibility[0] = random.nextInt(5);

        System.out.println("이판사판태클로 공격합니다");

        player1.HP -= this.posibility[0];
        player1.ATK = 3 * player1.ATK;
        monster.HP -= (monster.DEF -player1.ATK);

        monster.attackPlayer(player1);

    }

    //칼춤 메소드
    public void sword_Dance(Player_1st player1){

        //sword_Dance == 칼춤
        //칼춤 시전시 일정 수치만큼 pAttack 증가

        this.posibility[0] = random.nextInt(5);
        player1.ATK = player1.ATK +this.posibility[0];

        monster.attackPlayer(player1);


    }

    @Override
    public void show_skill() {

        int a;

        for (a = 0; a < 3; a++) {
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
