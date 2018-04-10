import java.util.Random;

class Weapon{

    private Random random = new Random();
    private String name;
    protected int ATK, DEF;
    private Object weapon_property = null;

    public Weapon(){
        this.ATK = (random.nextInt(15) + 25));
        this.DEF = (random.nextInt(15) + 25));

        if(this.ATK > this.DEF){
            this.name = Events.set_name("무기");
        }else if(this.ATK < this.DEF){
            this.name = Events.set_name("방어구");
        }else if(this.ATK == this.DEF){
            this.ATK++;
            this.name = Events.set_name("무기");
        }
    }


    //Weapon 속성 생성 메소드, Weapon 생성자에서 기본 설정됨
    public String get_name(){
        return this.name;
    }

    public int getValue(int num){
        if(num == 1){
            return this.ATK;
        }
        else if(num == 2){
            return this.DEF;
        }
        else{
            return 0;
        }
    }

}
