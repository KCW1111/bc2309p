public class StringBuilderTest {
  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder(); // constructor
    stringBuilder.append("hello"); // stringBuilder is obj ref
    // append() is a method
    stringBuilder.append("wolrd");
    System.out.println(stringBuilder.toString());

    stringBuilder.append(" ").append("something").toString();
    // s = ?
    System.out.println(stringBuilder.toString());
    System.out.println(stringBuilder.append(" ").append("something").toString());

    // 1-10, even number, by using StringBuilder
    // result -> "246810"
    StringBuilder sb = new StringBuilder(); //sb is pointing at an empty string
    for (int i = 1; i<11; i++){
      if (i%2 == 0)
        sb.append(i); // using s3 += String.valueOf(i) is slow, as '+' needs to new String
    }

    sb.insert(3, "Java");
    System.out.println(sb);

    





















  }
}
