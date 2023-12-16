public class DemoSwitch {
    public static void main(String[] args) throws Exception {
        System.out.println(get(Weekday.WEDNESDAY));
        System.out.println(get2(Weekday.WEDNESDAY));
    }

    public static String get(Weekday weekday){
        //switch
        String day = "";
        switch (weekday) {
            case MONDAY:
                day="This is Monday!";
                break;
            case TUESDAY:
                day="This is Tuesday!";
                break;
            case WEDNESDAY:
                day="This is Wednesday!";
                break;
            case THURSDAY:
                day="This is Thursday!";
                break;
            case FRIDAY:
                day="This is Friday!";
                break;      
            default:
                break;
        }
        return day;

    }

    //Similar to Lambda Expression
    public static String get2(Weekday weekday){
        return switch (weekday){
            case MONDAY -> "Monday";
            case TUESDAY -> "Tuesday";
            case WEDNESDAY -> "Wednesday";
            case THURSDAY -> "Thursday";
            case FRIDAY -> "Friday";
        };

    }

    //yield
    // public static String get3(Weekday weekday){
    //     return switch (weekday){

    //     }
    // }
}
