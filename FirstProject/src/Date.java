public class Date {
    //Exercise question 2.2
    public static void main(String[] args) {
        showDate("European");
    }
    public static void showDate(String dateFormat)
    {
        int date = 8;
        int year = 2019;
        String day = "Sunday";
        String month = "September";

        if (dateFormat == "European")
        {
            System.out.println("European Format: ");
            System.out.println(day + " " + date + " " + month + " " + year);
        }
        else if (dateFormat == "American")
        {
            System.out.println("American Format: ");
            System.out.println(day + ", " + month + " " + date + ", " + year);
        }
    }
}

