/**
 * Solution for the Josephus Problem: https://en.wikipedia.org/wiki/Josephus_problem
 */
public class Solution1 extends AbstractSolution {

    public int solve(int numberOfSoldiers) {
        int[] soldiers = generateArrayOfSoldiers(numberOfSoldiers);

        while (soldiers.length > 1) {
            int[] tempArray = null;
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
