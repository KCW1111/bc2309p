public class LC2833 {
  public static int furthestDistanceFromOrigin(String moves){
    // count L R _

    int lCount = 0;
    int rCount = 0;
    int ucCount = 0;

    for (int i=0; i<moves.length(); i++){
      if (moves.charAt(i)=='L')
        lCount += 1;
      else if (moves.charAt(i)=='R')
        rCount += 1;
      else
        ucCount++;
    }

    return rCount < lCount ? lCount - rCount + ucCount: rCount - lCount + ucCount;
  }

  public static void main(String[] args) {
    String moves = "L_RL__R";

    int result = furthestDistanceFromOrigin(moves);
    System.out.println(result);
  }
}
