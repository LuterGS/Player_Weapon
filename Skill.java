public interface Skill {

    default void print_skilluse(String name, int num){
        System.out.println(num + "번째 스킬 " + name + " 시전");
    }

}
