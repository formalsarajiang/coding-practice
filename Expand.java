import java.util.ArrayList;
import java.util.List;

public class Expand {
    /*
     * Creates a list of integers from a lower bound to an upper bound,
     * inclusive on both sides, excluding any value that is a divisor
     * of a value in the list of values to skip.
     * 
     * Inputs:
     *     lb: lower bound
     *     up: upper bound
     *     skip: list of multiples to skip
     * 
     * Returns: List of integers from lb to ub (inclusive) 
     * except for any integer that is a divisor of a value in skip.
     */
    public static List<Integer> expand(int lb, int ub, List<Integer> skip) {
        assert lb >= 2;
        assert lb <= ub;

        // TODO: Implement this function.
        return new ArrayList<>();
    }
}
