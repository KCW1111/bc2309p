import java.util.Comparator;

public class SortByStringDesc implements Comparator<String> {

  @Override
  public int compare(String x, String y){
    return y.compareTo(x) > 0 ? 1 : -1;
  }
  
}
