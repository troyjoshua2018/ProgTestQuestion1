public class Main {

    public static void main(String[] args) {

        // Single-dimensional array for city labels
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};

        // Two-dimensional array for console sales
        // Columns: [PS5, XBOX, SWITCH]
        int[][] totals = {
                {1000, 2000, 3000},
                {2000, 3000, 4000},
                {1500, 1100, 1200}
        };

        // Two-dimensional array for accident data
        // Columns: [Fatal Accidents, Non-Fatal Accidents]
        int[][] accidentData = {
                {10, 20},
                {15, 25},
                {8, 12}
        };

        int[] cityTotals = new int[3];

        // 1. Output Main Gaming Report
        System.out.println("----------------------------------------------------------------");
        System.out.println("                    GAMING CONSOLE REPORT");
        System.out.println("----------------------------------------------------------------");
        System.out.printf("%-20s%-12s%-12s%-12s%n",
                "CITY", "PS5", "XBOX", "SWITCH");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s%-12d%-12d%-12d%n",
                    cities[i],
                    totals[i][0],
                    totals[i][1],
                    totals[i][2]);
        }

        // 2. Output Road Accident Report
        System.out.println("\n----------------------------------------------------------------");
        System.out.println("               ROAD ACCIDENT TOTALS FOR EACH CITY");
        System.out.println("----------------------------------------------------------------");
        System.out.printf("%-20s%-20s%-20s%n",
                "CITY", "FATAL", "NON-FATAL");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s%-20d%-20d%n",
                    cities[i],
                    accidentData[i][0],
                    accidentData[i][1]);
        }

        // 3. Calculate accident totals and determine city with most accidents
        int maxAccidents = -1;
        String cityWithMost = "";

        System.out.println("\n----------------------------------------------------------------");
        System.out.println("                 TOTAL ACCIDENTS PER CITY");
        System.out.println("----------------------------------------------------------------");

        for (int i = 0; i < cities.length; i++) {

            cityTotals[i] = accidentData[i][0] + accidentData[i][1];

            System.out.printf("%-20s%-20d%n",
                    cities[i],
                    cityTotals[i]);

            // Track city with highest accident total
            if (cityTotals[i] > maxAccidents) {
                maxAccidents = cityTotals[i];
                cityWithMost = cities[i];
            }
        }

        // 4. Output City with Maximum Accidents
        System.out.println("\n----------------------------------------------------------------");
        System.out.println("CITY WITH THE MOST VEHICLE ACCIDENTS: " + cityWithMost);
        System.out.println("TOTAL ACCIDENTS: " + maxAccidents);
        System.out.println("----------------------------------------------------------------");
    }
}
