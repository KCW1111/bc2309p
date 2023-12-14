import java.util.Optional;

public class DemoOptional{
  public static void main(String[] args) {
    String s = null;

    Optional<String> os = Optional.ofNullable(null);
    Optional<String> os2 = Optional.empty();

    if(os.isPresent()){
      System.out.println(os.get());
    }else{
      System.out.println("os's string is a null value");
    }

    os.ifPresent(e->{
      System.out.println(e);
    }); 

    os2.ifPresent(e->{ //os2 is not null, but os2's value is null
      System.out.println(e);
    });

    Optional<String> os3 = Optional.ofNullable("John");
    os3.ifPresent(e->{
      System.out.println(e);
    }); 

    // ofNullable() vs of()
    // Optional<Integer> oi = Optional.of(null); // of() cannot put null, //java.lang.NullPointerException
    // if(oi.isPresent()){
    //   System.out.println(oi);
    // }

  }
}