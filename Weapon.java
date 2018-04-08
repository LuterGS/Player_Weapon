import java.util.Random;

class Weapon implements Property {

    private Random random = new Random();
    private String name;
    private int ATK, DEF, Tier;
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

    private void set_property(){

        int num = random.nextInt(2);
        if (num == 0) {
            weapon_property = new Fire();
        }else if(num == 1) {
            weapon_property = new Ice();
        }else if(num == 2){
            weapon_property = new Dark();
        }
    }

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
}
