public interface Skill {

    double[] Skill_1(Player_1st player1, Monster monster, double Damage[]);
    double[] Skill_2(Player_1st player1, Monster monster, double Damage[]);
    double[] Skill_3(Player_1st player1, Monster monster, double Damage[]);

    void show_skill();
    String return_name(int num);
    //스킬 사용 인터페이스 메소드. 단순 출력만 구현

}
