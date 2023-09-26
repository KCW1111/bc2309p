import java.time.LocalDate;

public class LocalDateTest {

  int year;
  int month;
  int day;

  // constructor
  public LocalDateTest(int year, int month, int day){
    this.year = year;
    this.month = month;
    this.day = day;

  }

  public static LocalDateTest of(int year, int month, int day){
    return new LocalDateTest(year, month, day);
  }
  public static void main(String[] args) {
    LocalDate date = LocalDate.of(2023,12,31);
    System.out.println(date.getMonth());
    System.out.println(date.getDayOfWeek());

    LocalDate date2 = LocalDate.of(2024,2,27);
    System.out.println(date2.isAfter(date));



    LocalDate date3 = LocalDate.of(2024,1,27);
    //System.out.println(date3.isBetween(date, date2));
  }


/* 
  public boolean isBetween (LocalDate day1, LocalDate day2){
    boolean result = false;
    
    if (day2.isAfter(day1)){
      if (this.isAfter(day1) && this.isBefore(day2)){
        result = true;
      }else{
        result = false;
      }
    }
    return result;
  }
*/
  
}
