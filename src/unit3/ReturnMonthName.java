package unit3;

public class ReturnMonthName {
    public static String monthName2(int month) {
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Error invalid month.";
        };
    }

    public static String monthName(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Error invalid month.";
        }
    }

    public static void main(String[] args) {
        //args[0] = "11";
        if (args.length != 0) {
            int month = Integer.parseInt(args[0]);
            System.out.println(monthName(month));
        }
        else
            System.out.println("Error: No argument passed.");
    }


}
