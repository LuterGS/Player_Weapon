import java.util.Random;

public class Main {

    public static void main(String[] args){

        int select;
        Random random = new Random();

        Player_1st Warrior = new Player_1st("강지원");

        while(true) {
            select = random.nextInt(100);

            if(select >= 0 && select <= 29){
                //전투

            }else if(select >= 30 && select <= 39){
                //무기 얻기
                Warrior.get_Weapon();
            }else if(select >= 40 && select <= 79){
                //행동 없음
                System.out.println("아무것도 일어나지 않았다");
            }else if(select >= 80 && select <= 89){
                //스킬 교체상인 meet
                Events.met_skillchanger((Player_3rd) Warrior);
            }else if(select >= 90 && select <= 99){
                //HP, MP FULL
                Events.met_crystal(Warrior);
            }

            //체력 0
            if(Warrior.HP == 0){
                System.out.println("체력 0, 게임 오버");
                //게임 오버
            }else if(Warrior.level == 30){
                System.out.println("30렙 달성, 게임 승리");
                //게임 승리
            }
        }
    }
}
