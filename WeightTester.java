class Weight {
    private int[] data;

    // Constructor
    public Weight(int[] init) {
        // Make data the same length
        // as the array referenced by init.
        data = new int[init.length];

        // Copy values from the
        // input data to data.
        for (int j = 0; j < init.length; j++) {
            data[j] = init[j];
        }
    }

    // Print
    public String toString() {
        if (data.length == 0) {
            return "";
        }

        String result = String.valueOf(data[0]);
        for (int i = 1; i < data.length; i++) {
            result += ", " + data[i];
        }
        return result;
    }
}

public class WeightTester {
    public static void main(String[] args) {
        int[] values = {98, 99, 98, 99, 100, 101, 102, 100, 104, 105, 105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                105, 105, 104, 104, 103, 102, 102, 101, 100, 102};
        Weight june = new Weight(values);
        System.out.println(june);
    }
}