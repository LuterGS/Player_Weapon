public interface Skill {

    default void print_skilluse(String name, int num){
        System.out.println(num + "번째 스킬 " + name + " 시전");
    }
    //스킬 사용 인터페이스 메소드. 단순 출력만 구현

}
