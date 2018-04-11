import java.util.Random;
import java.util.Scanner;

public class Events {

    private static Random random = new Random();
    private static Scanner scan = new Scanner(System.in);

    //무기구, 방어구 이름 Database
    private static String[] 무기 = { //41개
            "간장",
            "막야",
            "갈라틴",
            "공포",
            "나겔링",
            "다인슬라어프",
            "담로",
            "레바테인",
            "모노호시자오",
            "아론다이트",
            "쌍룡검",
            "자웅일대검",
            "엑스칼리버",
            "청룡검",
            "칼리번",
            "헌원검",
            "롱기누스의 창",
            "방천화극",
            "청룡언월도",
            "화첨창",
            "사신의 낫",
            "반고부",
            "금전",
            "수다르사나",
            "아스트라",
            "오호",
            "타흘룸",
            "페일노트",
            "하늘의 활",
            "영광금귀신기노",
            "천근활",
            "케라우노스",
            "이오케이라",
            "안드바리나우트",
            "드라우프니르",
            "브리싱가멘",
            "백우선",
            "여의보주",
            "카두케우스",
            "영광의 손",
            "코로나 페레아"
    };

    private static String[] 방어구 = { //19개
            "카바나",
            "쿤달라",
            "핀의 유산",
            "카라카와",
            "두반",
            "아이기스",
            "앙칼라",
            "오한",
            "프리드웬",
            "저주받은 방패",
            "퀴네에",
            "힐데그림",
            "메긴기요로드",
            "야른그레이프르",
            "천사옥대",
            "녹스",
            "태양폭풍",
            "미스틸테인",
            "잠시드의 잔"
    };

    private static String[] 몬스터_이름 = {  //39
            "교인",
            "삼족오",
            "염파",
            "두억시니",
            "삼두일족응",
            "어둑시니",
            "장사장천",
            "지하국대적",
            "기린",
            "백악",
            "승황",
            "최강다람쥐",
            "크샬다오라",
            "제노지바",
            "네르기간테",
            "오니",
            "캇파",
            "아쿨트",
            "강지원",
            "간다르바",
            "아수라",
            "팔부신중",
            "레비아탄",
            "베헤모스",
            "오안네스",
            "훔바바",
            "도도가마루",
            "리빙아머",
            "만티코어",
            "볼퍼팅어",
            "와이번",
            "아팡크",
            "해기스",
            "흡혈귀",
            "히포그리프",
            "니드호그",
            "오르문간드",
            "람쥐썬더",
            "흐룽그니르"
    };

    //장비 이름 설정 함수(Type에 따른 무기/방어구 Load
    public static String set_name(String type){

        if(type.equals("무기")){
            return 무기[random.nextInt(40)];
        }else if(type.equals("방어구")) {
            return 방어구[random.nextInt(18)];
        }else if(type.equals("몬스터")){
            return 몬스터_이름[random.nextInt(38)];
        }else{
            return null;
        }
    }

    //HP 채워줌
    public static void fullFillHP(Player_1st player1){
        System.out.println("HP를 전부 충전합니다");
        player1.HP = player1.HP_max;
    }

    //스킬셋 교환
    public static Player_1st change_skillset(Player_1st player1){

        int select;
        System.out.printf("스킬상인을 만났습니다! 현재 스킬셋을 바꾸려면 1, 지나치시려면 0을 입력해주세요 :");
        select = scan.nextInt(2);
        if(select == 0){

        }else if(select == 1){
            System.out.printf("공격형 스킬셋으로의 변경은 0, 방어형 스킬셋으로의 변경은 1을 눌러주세요.");
            select = scan.nextInt(2);
            if(select == 0){
                player1.change_skill("Attack");
            }else if(select == 1){
                player1.change_skill("Defense");
            }
        }
        return player1;
    }

    //전투
    public static Player_1st combat(Player_1st player1){

        Monster MON = new Monster(player1.level);
        MON.getInfo();

        while(true) {


            //몬스터 선빵후 플레이어 공격
            double[] player_value = player1.MyTurn(MON);
            double[] monster_value = MON.get_info();

            if(player_value[0] == -9999 && player_value[1] == -9999){
                break;
            }

            System.out.printf("현재 턴에서의 %s의 체력 : %.1f 공격력 : %.1f, 방어력 : %.1f\n", player1.getName(), player1.getHP(), player_value[0], player_value[1]);
            System.out.printf("현재 턴에서의 %s의 체력 : %.1f 공격력 : %.1f, 방어력 : %.1f\n", MON.getName(), MON.get_HP(), monster_value[0], monster_value[1]);

            player1.attacked(monster_value[0] - player_value[1]);
            MON.attacked(player_value[0] - monster_value[1]);

            if(player1.HP <= 0){
                break;
            }else if (MON.get_HP() <= 0) {
                break;
            }
        }
        return player1;

    }




}


