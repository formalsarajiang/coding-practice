public class Bins {
    /**
     * totalWastedSpace: This function takes an array of integers, representing
     * the number of items in each shipment, and a bin size, and computes the
     * total wasted space across all shipments.
     *
     * Arguments:
     *   shipments: an array of integers
     *   binSize: the capacity of each bin (all bins have the same capacity)
     *
     * Returns: The total wasted space across all shipments.
     **/
    public static int totalWastedSpace(int[] shipments, int binSize) {
        int out = 0;
        for (int num : shipments) {
            out = out + (binSize - (num % binSize));
        }
        return out;
    }

    public static void main (String[] args) {
        int [] ship = {47};
        System.out.println(totalWastedSpace(ship, 10));
    }
}
