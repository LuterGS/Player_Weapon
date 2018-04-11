import java.util.Random;

class Weapon{

    private Random random = new Random();
    private String name;
    protected int ATK, DEF, Tier;
    private Object weapon_property = null;

    public Weapon(){
    }

    public Weapon(int Tier){
        this.Tier = Tier;
        this.ATK = (random.nextInt(15) + 25) + (this.Tier * 5);
        this.DEF = (random.nextInt(15) + 25) + (this.Tier * 5);
        set_property();

        if(this.ATK > this.DEF){
            this.name = Events.set_name("무기");
        }else if(this.ATK < this.DEF){
            this.name = Events.set_name("방어구");
        }else if(this.ATK == this.DEF){
            this.ATK++;
            this.name = Events.set_name("무기");
        }
    }
    //Weapon 기본 생성자

    private void set_property(){

        int num = random.nextInt(3);
        if (num == 0) {
            weapon_property = new Fire();
        }else if(num == 1) {
            weapon_property = new Ice();
        }else if(num == 2){
            weapon_property = new Dark();
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
        else if(num == 3){
            return this.Tier;
        }else{
            return 0;
        }
    }
    //getter 확장 구현, 일일히 구현하는 것보다 번호를 이용해 한번에 여러 Value를 return 하게 함
}
