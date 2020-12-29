package josephus;

public abstract class AbstractSolution {

    private long durationMilliseconds;

    //implement this to solve Josephus problem with your algorithm
    protected abstract int solve(int[] soldiers);

    //wraps the timer around the solve method and sets the execution duration
    public int solveWithTimer(int[] soldiers) {
        final long millisecondsBefore = System.currentTimeMillis();
        final int solution = solve(soldiers);
        durationMilliseconds = System.currentTimeMillis() - millisecondsBefore;
        return solution;
    }

    public long getDurationMilliseconds() {
        return durationMilliseconds;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
