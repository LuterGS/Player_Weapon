import java.util.Random;

public class Ice implements Property {
//Fire와 마찬가지, 수치만 구현되어있고 동작은 구현되어있지 않음

    private Random random = new Random();
    private int[] Percentage = new int[3];
    //0번방이 Fire, 1번방이 Ice, 2번방이 Dark의 백분율을 의미함

    public Ice(){

        int temp = random.nextInt(9) + 1;
        this.Percentage[1] = random.nextInt(40) + 60;
        this.Percentage[0] = (100 - this.Percentage[1]) * temp;
        this.Percentage[2] = 100 - (this.Percentage[0] + this.Percentage[1]);
    }
}
