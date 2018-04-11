import java.util.Random;

public class Monster {

    private Random random = new Random();
    private String name, type;
    private double HP, ATK, DEF;

    public Monster(int player_level){

        int type_int = random.nextInt(2);

        if(type_int == 0){
            this.type = "Fire";
        }else if(type_int == 1){
            this.type = "Ice";
        }else{
            this.type = "Dark";
        }
        this.name = Events.set_name("몬스터");

        this.HP = 100 + (player_level * (50 + random.nextInt(20) - 10));
        this.ATK = 30 + (player_level * (10 + random.nextInt(4) - 2));
        this.DEF = 20 + (player_level * (10 + random.nextInt(4) - 2));
    }

    public String getName(){
        return this.name;
    }

    public double getHP(){
        return this.HP;
    }

    public void getInfo(){

        System.out.printf("몬스터 이름은 %s, 체력 : %.1f, 공격력 : %.1f, 방어력 %.1f\n", this.name, this.HP, this.ATK, this.DEF);
    }

    public void get_curinfo(){
        System.out.printf("현재 몬스터의 체력 : %.1f, 공격력 : %.1f, 방어력 %.1f\n", this.HP, this.ATK, this.DEF);
    }

    public double[] get_info(){

        double[] value = new double[2];
        value[0] = this.ATK;
        value[1] = this.DEF;
        return value;
    }

    public void attacked(double Damage){

        if(Damage < 0){
            System.out.printf("%s의 방어력이 높습니다! 데미지를 1만 받습니다. ", this.name);
            Damage = 1;
        }else{
            System.out.printf("%s(이/가) 공격을 받았습니다! 받은 데미지 : %.1f, ", this.name, Damage);
        }
        System.out.printf("체력 %.1f에서 ", this.HP);
        this.HP -= Damage;
        System.out.printf("%.1f로 감소.\n", this.HP);
    }

    public double get_HP(){
        return this.HP;
    }

    public double get_ATK(){
        return this.ATK;
    }




}
