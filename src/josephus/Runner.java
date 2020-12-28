package josephus;

public class Runner {

    public static void main(String[] args) {

        final int[] soldiers = generateArrayOfSoldiers(1_000_000);

        testSolution(new Solution1(), soldiers);
        testSolution(new Solution2(), soldiers);
    }

    private static void testSolution(AbstractSolution solution, int[] soldiers) {
        final int survivor = solution.solveWithTimer(soldiers);
        final long duration = solution.getDurationMilliseconds();
        final String message = String.format("Number of soldiers is %d Solution is: %d It took %d milliseconds", soldiers.length, survivor, duration);
        System.out.println(message);
    }

    /*
    helper method to generate Josephus soldier array 1...numberOfSoldiers
    it has nothing to do with the solution algorithm it self
    */
    private static int[] generateArrayOfSoldiers(int numberOfSoldiers) {
        if (numberOfSoldiers < 1) {
            throw new IllegalStateException("you must play the game with 0 or more soldiers");
        }
        int[] soldiers = new int[numberOfSoldiers];
        for (int i = 0; i < numberOfSoldiers; i++) {
            soldiers[i] = i + 1;
        }
        return soldiers;
    }


}
