public abstract class AbstractSolution {

    /*
    helper method to generate Josephus soldier array 1...numberOfSoldiers
    it has nothing to do with the solution algorithm it self
     */
    protected int[] generateArrayOfSoldiers(int numberOfSoldiers) {
        if (numberOfSoldiers < 1) {
            throw new IllegalStateException("you must play the game with 0 or more soldiers");
        }
        int[] soldiers = new int[numberOfSoldiers];
        for (int i = 0; i < numberOfSoldiers; i++) {
            soldiers[i] = i + 1;
        }
        return soldiers;
    }

    //implement this to solve Josephus problem with your algorithm
    public abstract int solve(int numberOfSoldiers);
}
