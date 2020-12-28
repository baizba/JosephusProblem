package josephus;

/**
 * Solution for the Josephus Problem: https://en.wikipedia.org/wiki/Josephus_problem
 */
public class Solution2 extends AbstractSolution {

    protected int solve(int[] soldiers) {
        //start at the beginning of soldier array
        int index = 0;

        //store the number of how many soldiers are killed
        int killedSoldiersCount = 0;

        //here we store the soldier who performed the last kill (this will be result)
        int lastKiller = soldiers[index];

        /*
        This is the switch that tells us if the last available soldier was a killer.
        We can only kill the current soldier if the previous one is a killer (and not dead or first alive after dead)
         */
        boolean killSwitch = true;

        while (killedSoldiersCount < soldiers.length - 1) {
            //get the current soldier
            int currentSoldier = soldiers[index];

            //only work with live soldiers (dead are marked with 0)
            if (currentSoldier != 0) {

                //if current soldier is killer mark him as the last killer, switch the killer flag to false
                if (killSwitch) {
                    lastKiller = currentSoldier;
                    killSwitch = false;
                } else {
                    //if current soldier is not a killer increase the dead soldier count, switch the killer flag and mark him as dead
                    killedSoldiersCount++;
                    killSwitch = true;
                    soldiers[index] = 0;
                }
            }

            index++;
            if (index == soldiers.length) {
                index = 0;
            }
        }

        return lastKiller;
    }
}
