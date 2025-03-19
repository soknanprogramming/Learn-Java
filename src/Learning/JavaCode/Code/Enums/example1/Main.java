package Learning.JavaCode.Code.Enums.example1;

public class Main {
    public static void main(String[] args){
        /*
        Enums = (Enumerations) A spacial kind of class that
                represent a fixed set of constants.
                They improve code readability and are easy to maintain
                More efficient with switches when comparing Strings.
         */
        Day day = Day.SUNDAY;
        switch(day){
            case MONDAY,
                 TUESDAY,
                 WEDNESDAY,
                 THURSDAY,
                 FRIDAY -> System.out.println("It is a weekday");
            case SATURDAY, SUNDAY -> System.out.println("It is the weekend");
        }

        System.out.println(day);
        System.out.println(day.getDayNumber());
    }
}
