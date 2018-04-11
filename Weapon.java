import java.util.Random;

class Weapon{

    private Random random = new Random();
    private String name;
    private int ATK, DEF, TIER;
    private Object weapon_property = null;

    //Weapon 기본 생성자
    public Weapon(int TIER){
        this.TIER = TIER++;
        this.ATK = ((random.nextInt(15) + 25) + (this.TIER * 5));
        this.DEF = ((random.nextInt(15) + 25) + (this.TIER * 5));


        if(this.ATK > this.DEF){
            this.name = Events.set_name("무기");
        }else if(this.ATK < this.DEF){
            this.name = Events.set_name("방어구");
        }else if(this.ATK == this.DEF){
            this.ATK++;
            this.name = Events.set_name("무기");
        }
    }

    public String get_name(){
        return this.name;
    }

    public int getValue(int num){
        if(num == 0){
            return this.ATK;
        }else if(num == 1) {
            return this.DEF;
        }else if(num == 2){
            return this.TIER;
        }else{
            return 0;
        }
    }
    //getter 확장 구현, 일일히 구현하는 것보다 번호를 이용해 한번에 여러 Value를 return 하게 함
}
