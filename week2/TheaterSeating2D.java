public class TheaterSeating2D {
    public static void main(String[] args) {
        // 1. Declare and initialize the 2D array for the theater
        int[][] theater = new int[5][8]; // 5 rows, 8 columns

        // 2. Book the seat at row 2, column 5
        theater[2][5] = 1;

        // 3. Book the seat at row 0, column 0
        theater[0][0] = 1;

        //header
        System.out.println("""
                Theater Seating 
                (0 = Avlable, 1 = Booked)
                """);

        // 4. Use nested loops to print the seating chart

        for (int i = 0; i < theater.length; i++) {
            for (int j = 0; j < theater[i].length; j++) {
                System.out.print(theater[i][j] + " ");
            }
            System.out.println();
        }

        // 5. Count and print the total number of booked seats

        int bookedCount = 0;
        for (int i = 0; i < theater.length; i++) {
            for (int j = 0; j < theater[i].length; j++) {
                if (theater[i][j] == 1) {
                    bookedCount++;
                }
            }
        }
        System.out.println("Total booked seats: " + bookedCount);
    }
}
