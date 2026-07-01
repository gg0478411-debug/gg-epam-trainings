public class SeasonsHomework2 {

    public static void main (String[] args)

    {


        int[] months = {1, 3, 6, 9, 12};
        for (int i = 0; i < months.length; i++) {
            int month = months[i];
            if (month == 1) {
                System.out.println("January");
            } else if (month == 3) {
                System.out.println("March");
            } else if (month == 6) {
                System.out.println("June");
            } else if (month == 9) {
                System.out.println("September");
            } else if (month == 12) {
                System.out.println("December");
            }
        }
    }
}
