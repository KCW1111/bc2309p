import java.util.Arrays;

public class DemoArray {
    public static void main(String[] args) throws Exception {
        int i1 = 100;
        int i2 = 105;
        int i3 = 108;

        // array
        int[] array; // declaration
        // array = new int[]; this one will be illegal, as Java doesn't know how many consecutive memory spaces should be allocated 
        // for this integer array, so, below is the legal declaration
        array = new int[3]; // initialization

        int[] arr = new int[3]; // declaration and initialization at the same time
        // assign values to array
        // arr[-1] = 99; no such index, they only from 0,1,2 -> index of the array
        arr[0] = 100;
        arr[1] = 105;
        arr[2] = 108;
        // arr[3] = 110; // run-time error

        arr[1] = 106;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        int o = arr[0]; // arr[0] -> int
        System.out.println(o);

        // arr[1] = 3L; // cannot assign long value to int variable

        //declare int array with size 6, assign values and print them out
        System.out.println("//declare int array with size 6, assign values and print them out");
        int[] arr2 = new int[6];
        arr2[0] = 100;
        arr2[1] = 101;
        arr2[2] = 102;
        arr2[3] = 103;
        arr2[4] = 104;
        arr2[5] = 105;

        for (int i=0; i<6; i++){
            System.out.println(arr2[i]);
        }

        //declare char array with size 4, assign values, and print them out
        System.out.println("//declare char array with size 4, assign values and print them out");
        char[] arr3 = new char[4];
        arr3[0] = 97;
        arr3[1] = 98;
        arr3[2] = 99;
        arr3[3] = 100;

        for (int i=0; i<4; i++){
            System.out.println(arr3[i]);
        }

        //declare boolean array with size 5, assign values, and print them out
        System.out.println("//declare boolean array with size 5, assign values, and print them out");
        boolean[] arr4 = new boolean[5];
        arr4[0] = true;
        arr4[1] = false;
        arr4[2] = true;
        arr4[3] = false;
        arr4[4] = true;

        for (int i=0; i<5; i++){
            System.out.println(arr4[i]);
        }

        int[] arr5 = new int[] {1,2,3,4,5};
        //Swap elements of index 1 and index 3
        int[] arrTemp = new int[1];
        arrTemp[0] = arr5[0];
        arr5[0] = arr5[2];
        arr5[2] = arrTemp[0];
        for (int i = 0; i<arr5.length; i++){
            System.out.println(arr5[i]);

        }

        //Demo
        int box = -1;
        for (int i = 0; i < arr5.length; i++){
            if (i == 1){
                //swap
                box = arr5[i];
                arr5[i] = arr5[i + 2];
                arr5[i+2] = box;
            }
        }
        System.out.println(arr5); // [I@7344699f, a memory reference
        System.out.println(Arrays.toString(arr5)); //[3, 4, 1, 2, 5]

        // arr5: Swap min and max value
        arr5 = new int[] {1,2,3,4,5};
        System.out.println("// arr5: Swap min and max value");
        int min = arr5[0];
        int max = arr5[0];
        int minIndex = -1;
        int maxIndex = -1;
        int indexBox = -1;
        int valueBox = -1;
        for (int i = 1; i<arr5.length; i++){
            if (arr5[i]<=min){
                min = arr5[i];
                minIndex = i;
                System.out.println("The min index is: " + minIndex);
            }else{
                minIndex = 0;
            }
        }
        
        for (int i = 1; i<arr5.length; i++){
            if (arr5[i]>=max){
                max = arr5[i];
                maxIndex = i;
                System.out.println("The max index is: " + maxIndex);
            }else{
                maxIndex = 0;
            }
        }
        System.out.println("Min is: " + min);
        System.out.println("Max is: " + max);

        indexBox = minIndex;
        arr5[minIndex] = arr5[maxIndex];
        arr5[maxIndex] = arr5[indexBox];

        System.out.println("The arr5 after min max swapping is: " + Arrays.toString(arr5));



        // move max value to the tail of the array
        System.out.println("// move max value to the tail of the array");
        arr5 = new int[] {5,4,3,2,1};
        maxIndex = -1;
        max = -1;
        box = -1;
        for (int i = 0; i<arr5.length; i++){
            if (arr5[i]>=max){
                max = arr5[i];
                maxIndex = i;
                System.out.println("The max index now: " + maxIndex);
                System.out.println("Max value now is: " + max);
            }
        }
        
        for (int i = 1; i<arr5.length; i++){
            arr5[i-1] = arr5[i];
        }
        arr5[arr5.length-1] = max;
        System.out.println(Arrays.toString(arr5));

        //Reverse the string
        //Answer: hello -> olleh
        String str = "123456";
        int indexHalf = -1;
        char[] characters = str.toCharArray();
        if (characters.length % 2 == 1){
            indexHalf = characters.length / 2;
            System.out.println(indexHalf);
            for (int i = 1; i<=indexHalf; i++){
                char boxTemp = '0';
                boxTemp = characters[indexHalf+i];
                characters[indexHalf+i] = characters[indexHalf-i];
                characters[indexHalf-i] = boxTemp;

            }
            System.out.println(characters);


        }else{
            indexHalf = characters.length / 2;
            System.out.println(indexHalf);
            for (int i = 0; i<indexHalf; i++){
                char boxTemp = '0';
                boxTemp = characters[indexHalf+i];
                characters[indexHalf+i] = characters[indexHalf-i-1];
                characters[indexHalf-i-1] = boxTemp;

            }
            System.out.println(characters);

        }








    }
}
