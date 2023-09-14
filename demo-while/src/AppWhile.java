public class AppWhile {
    public static void main(String[] args) {
        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // while loop
        int j = 0;
        while (j < 5) {
            System.out.println(j);
            j++; // while loop gives freedom to do on increment condition, such as if..... then do increment
            System.out.println("hello");
        }

        int l = 0;
        int k = 10;
        while (l < 5 && k > 0) {
            System.out.println(l);
            l++;
            k--; // while loop is flexible
            System.out.println("hello");
        }

        // sum 1,2,3.....10
        System.out.println("// sum 1,2,3.....10");
        int i = 1;
        int sum = 0;
        while (i <= 10) {
            sum += i;
            i++;
            System.out.println(sum);
        }

        // sum 1-10, even numbers only
        System.out.println("// sum 1-10, even numbers only");
        i = 2;
        sum = 0;
        while (i <= 10) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
            System.out.println("Sum of even numbers: " + sum);
        }

        // do-while
        int count = 0;
        do {
            System.out.println("count=" + count);
        } while (++count < 5); // count add one first before checking the condition

        // break
        // 1 - 10, odd number and > 6

        count = 1;
        do {
            if (count % 2 == 1 && count > 6) {
                System.out.println(count);
                count++;
            } else {
                break;
            }
        } while (count <= 10);

    }
}
