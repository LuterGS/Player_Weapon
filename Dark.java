public class Dark implements Property {

    private Random random = new Random();
    private int[] Percentage = new int[3];
    //0번방이 Fire, 1번방이 Ice, 2번방이 Dark의 백분율을 의미함

    public Dark(){

        int temp = random.nextInt(9) + 1;
        this.Percentage[2] = random.nextInt(40) + 60;
        this.Percentage[1] = (100 - this.Percentage[2]) * temp;
        this.Percentage[0] = 100 - (this.Percentage[1] + this.Percentage[2]);
    }

}
