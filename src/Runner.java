public class Runner {

    public static void main(String[] args) {

        AbstractSolution s1 = new Solution1();
        System.out.println(s1.solve(14));

        AbstractSolution s2 = new Solution2();
        System.out.println(s2.solve(14));
    }



}
