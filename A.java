public class A implements Skillset {
//A의 이름을 바꿔야 함


    private String name1 = "";
    private int name1_alpha;

    private String name2 = "";
    private int name2_alpha;

    private String name3 = "";
    private int name3_alpha;

    @Override
    public int skill_A(String name, int a) {
        System.out.println(/*스킬 출력*/);
        return a * this.name1_alpha;
    }


    @Override
    public int skill_B(String name, int a) {

        return a;
    }

    @Override
    public int skill_C(String name, int a) {

        return a;
    }
}
