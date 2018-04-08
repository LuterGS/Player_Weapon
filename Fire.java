import java.util.Random;

public class Fire implements Property {
//무기 불속성, 현재 속성 수치만 구현되어있고 동작은 구현되어있지 않은 상태

    private Random random = new Random();
    private int[] Percentage = new int[3];
    //0번방이 Fire, 1번방이 Ice, 2번방이 Dark의 백분율을 의미함

    public Fire(){

        int temp = random.nextInt(9) + 1;
        this.Percentage[0] = random.nextInt(40) + 60;
        this.Percentage[1] = (100 - this.Percentage[0]) * temp;
        this.Percentage[2] = 100 - (this.Percentage[0] + this.Percentage[1]);
    }


}
