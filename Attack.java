import java.util.Random;

public class Attack implements Skill {
//공격형 스킬셋, 속성에 따른 수치 부여 필요

    private Random random = new Random();

    private String[] Skillname = new String[3];
    //스킬 종류 3개, 개당 공격\방어 수치 각각 1개씩 가짐

    public Attack(){

        System.out.println("스킬 Attack 생성");
        this.Skillname[0] = "칼등치기";
        this.Skillname[1] = "이판사판 태클";
        this.Skillname[2] = "칼춤";
    }

    //칼등치기 메소드
    @Override
    public double[] Skill_1(Player_1st player1, Monster monster, double AD[]){

        //false_Swipe == 칼등치기
        //확률에 따라 성공,실패 갈림
        //성공 -> 2배 공격력, 상대 공격력만큼 회복

        int posibility = random.nextInt(4);


        if (posibility > 2){
            System.out.println("칼등치기 성공!");
            AD[0] *= 2;
            player1.HP += (player1.DEF-monster.get_ATK());

        }else{
            //칼등치기에 실패하면 플레이어는 그대로 공격받음
            System.out.println("칼등치기 실패!");
            AD[0] = 0;
        }

        return AD;
    }

    //이판사판태클 메소드
    @Override
    public double[] Skill_2(Player_1st player1, Monster monster, double AD[]){

        //double_Edge == 이판사판태클
        //3배 데미지
        //랜덤 수치만큼 자신의 체력 감소
        double player_damage = random.nextInt(25) + 26;

        System.out.println("이판사판태클로 공격합니다");
        AD[0] *= 3;

        System.out.printf("체력이 %f 에서", player1.HP);
        player1.HP *= 1 - (player_damage * 0.01);
        System.out.printf(" %.1f로 감소했습니다. 총 %.1f퍼센트 감소.\n", player1.HP, player_damage);

        return AD;
    }

    //칼춤 메소드
    @Override
    public double[] Skill_3(Player_1st player1, Monster monster, double AD[]){

        //sword_Dance == 칼춤
        //칼춤 시전시 일정 수치만큼 pAttack 증가

        double attack_plus = random.nextInt(40) + 31;
        AD[0] *= 1 + (attack_plus * 0.01);

        return AD;
    }

    @Override
    public void show_skill() {

        System.out.printf("첫번째 스킬 : %s, 효과 : 스킬 성공시 데미지 2배, 상대 공격력만큼 회복. 실패시 공격 못함\n", this.Skillname[0]);
        System.out.printf("두번째 스킬 : %s, 효과 : 무조건 데미지 3배, 랜덤 수치만큼 자신의 체력 감소\n", this.Skillname[1]);
        System.out.printf("세번째 스킬 : %s, 효과 : 이번 한 턴에 랜덤한 수치만큼 공격력 증가\n", this.Skillname[2]);

    }

    @Override
    public String return_name(int num) {
        return this.Skillname[num-1];
    }
}
