public interface Skillset {
//A, B, C 가 각각의 특징을 띄도록 구현

    //텍스트를 바꾼다

    int skill_A(String name, int a);

    int skill_B(String name, int a);

    int skill_C(String name, int a);

    default void skill_show(String name1, String name2, String name3){
        System.out.println("스킬 1. 이름 : " + name1);
        System.out.println("스킬 2. 이름 : " + name2);
        System.out.println("스킬 3. 이름 : " + name3);
    }

}


