package josephus;

/**
 * Solution for the Josephus Problem: https://en.wikipedia.org/wiki/Josephus_problem
 */
public class Solution1 extends AbstractSolution {

    @Override
    protected int solve(int[] soldiers) {
        while (soldiers.length > 1) {
            int[] tempArray;
            int tempIndex = 0;
            if (soldiers.length % 2 == 0) {
                tempArray = new int[soldiers.length / 2];
                for (int i = 0; i < soldiers.length; i += 2) {
                    tempArray[tempIndex++] = soldiers[i];
                }
            } else {
                tempArray = new int[(soldiers.length - 1) / 2];
                for (int i = 2; i < soldiers.length; i += 2) {
                    tempArray[tempIndex++] = soldiers[i];
                }
            }
            soldiers = tempArray;
        }
        return soldiers[0];
    }
}
