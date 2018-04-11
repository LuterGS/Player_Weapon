import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        int select;
        Random random = new Random();
        Player_1st Warrior = new Player_1st("강지원");

        while(true){

            select = random.nextInt(100);
            if(select >= 0 && select < 50){
                //전투
                Warrior = Events.combat(Warrior);
                if(Warrior.getHP() <= 0){
                    System.out.println("게임 패배!");
                    break;
                }else{
                    Warrior.exp_up();
                    Warrior.check_level_up();
                }
            }else if(select >= 50 && select < 70){
                //아무 일도 일어나지 않음
                System.out.println("아무 일도 일어나지 않았습니다");
            }else if(select >= 70 && select < 80){
                //스킬셋 교환
                Warrior = Events.change_skillset(Warrior);
            }else if(select >= 80 && select < 90){
                //무기 줍기
                Warrior.get_Weapon();
            }else if(select >= 90 && select < 100) {
                //HP 모두회복
                Events.fullFillHP(Warrior);
            }

            if(Warrior.HP == 0){
                System.out.println("게임 패배!");
                break;
            }else if(Warrior.level == Warrior.level_max){
                System.out.println("게임 승리!");
                break;
            }

            System.out.printf("한 턴이 끝났습니다. 2초 뒤 다음 턴이 진행됩니다.\n");
            Thread.sleep(2000);
        }
        System.out.println("게임이 종료됩니다.");
    }
}
