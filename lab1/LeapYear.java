/* A leap year is either:
    1. divisible by 400 or
    2. divisible by 4 and not by 100
    ******************* this line is added from master branch ********************
        */
// class name should match with file name
class LeapYear{

    public static void main(String[] args) {
        int year = 2000;
        String year_string = Integer.toString(year);
        String suffix = " is a leap year.";
        if (year % 400 == 0) {
            System.out.println(year_string + suffix);
        }
        else if (year % 100 != 0 && year % 4 == 0) {
            System.out.println(year_string + suffix);
        }
    }


}
