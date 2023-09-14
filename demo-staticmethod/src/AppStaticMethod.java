public class AppStaticMethod {
    public static void main(String[] args) { // static method, JVM -> static method 'main'
    // that is when the run button click, the 'main' method runs

    int result = add(2,3);
    System.out.println(result);
    int result2 = add(101,1000);
    System.out.println(result2);

    int result3 = sum (1,5);
    System.out.println(result3);

        
    }

     // 1st int-> return type
     // add -> method name
     // (int x, int y) -> parameters
    public static int add(int x, int y){
        int results = x + y;
        return results;

    }

    public static int sum(int min, int max){
        int sum = 0;
        for (int i = min; i<=max; i++){
            sum += i;
        }
        return sum;
    }

}
