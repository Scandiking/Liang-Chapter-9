public class Section_9_13 {
    public static Location locateLargeset(double[][] a) {
        int maxRow = 0;
        int maxCol = 0;
        double maxValue = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maxValue) {
                    maxValue = a[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        return new Location(maxRow, maxCol, maxValue);
    }
}
