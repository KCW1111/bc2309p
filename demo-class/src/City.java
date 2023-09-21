public class City {

  int population;
  long latitude;
  long longituge;
  int area;
  String countryName;

  public void setArea(int area) {
    this.area = area;
  }
  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }public void setLatitude(long latitude) {
    this.latitude = latitude;
  }public void setLongituge(long longituge) {
    this.longituge = longituge;
  }public void setPopulation(int population) {
    this.population = population;
  }
  public int getArea() {
    return area;
  }public String getCountryName() {
    return countryName;
  }public long getLatitude() {
    return latitude;
  }public long getLongituge() {
    return longituge;
  }public int getPopulation() {
    return population;
  }

  public String isLarge(){
    if (this.area > 10000) // in km square
      return "This city is large.";
    return "This city is small.";
  }

  public String isHongKong(){
    if (this.latitude == 22 && this.longituge == 114)
      return "This city is likely Hong Kong.";
    return "This cit is not likely Hong Kong";
  }
  public static void main(String[] args) {
    City ABC = new City();
    ABC.area = 1000000;
    System.out.println(ABC.isLarge());
    ABC.latitude = 22;
    ABC.longituge = 114;
    System.out.println(ABC.isHongKong());
  }
}
