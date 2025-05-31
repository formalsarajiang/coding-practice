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
        return shipemnts[0] % binSize + shipemnts[1] % binSize + shipemnts[2] % binSize + shipemnts[3] % binSize;
    }

    public static void main (String[] args) {
        int [] ship = {10, 20, 30, 40};
        System.out.println(totalWastedSpace(ship, 50));
    }
}
