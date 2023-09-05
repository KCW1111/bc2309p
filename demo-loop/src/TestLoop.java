public class TestLoop {
    public static void main(String[] args) {
        int x = 2;

        //loop -> for loop, while, do-while
        // for (counter ; continue criteria ; update)
        // Step 1: int i = 0;
        // Step 2: check if i < 7
        // Step 3: x = x * 2;
        // Step 4: i++; -> i become 1
        // Step 5: chheck if i < 7
        // Step 6: x = x * 2;
        // Step 7: i++; i become 2
        // ...
        // Step n: i++; -> i become 6
        // Step n+1: check if i < 7
        // Step n+2: x = x * 2;
        // Step n+3: i++; -> become 7
        // Step n+4: check if i < 7 -> false -L exit loop
        for (int i = 0; i < 7; i++){ // remember, must start if 0, continue criteria must be '<', always, no '<=', it is because if you want to loop 7 times, you start with 0, then naturally in continue criteria can be a 7 there
            System.out.println("i=" + i);
            x = x * 2;
            System.out.println("x=" + x);
        }
        System.out.println(x); //256
    }
}
