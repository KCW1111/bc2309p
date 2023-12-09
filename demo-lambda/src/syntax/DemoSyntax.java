package syntax;

import java.util.Random;

public class DemoSyntax {
  public static StringBuilder main(String[] args) {
    SupplyInteger randomOddNumber = ()->{
      int times = new Random().nextInt(10);
      return 1 + times * 2;
    };

    System.out.println(randomOddNumber.supply());

    //in this way, no need to use 2 classes to complete
    SupplyString howAreYou = () -> {
      int x = 10;
      if (x>=10){
        howAreYou = () -> {
          return "hello";
        };
      }else{
        howAreYou = () -> {
          return "goodbye";
        };
      }
      return "hello";
    };

    System.out.println(howAreYou.supply());

    String[] source = new String[]{"abc","def","ijk"};
    ConcatFunction formula;
    if (source.length < 10){
      formula = (arr) -> {
        String r = "";
        for (String s : arr){
          r = r.concat(s); //as concat returns new object
        }
        return r;
      };
    }else{
      formula = (arr) -> {
        StringBuilder sb = new StringBuilder();
        for (String s : arr){
          sb.append(s);
        }
        return sb.toString();
      };
    }

    System.out.println(formula.concat(source));


    CharFunction cf = (s,i) -> {
      return s.charAt(i); // auto-box: char-> Character
    };
    System.out.println(cf.charFunction("Hello",1)); //e


    ConcatFunction ccf = (arr) -> {
      StringBuilder sb = new StringBuilder();
      for (String s: arr){
        sb.append(s); // remember append returns an address, but need not to use an variable to assign to
      }
      return sb.toString();
    };

    System.out.println(ccf.concat(new String[]{"abc","def","ijk"}));
  }
}
