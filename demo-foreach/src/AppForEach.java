public class AppForEach {
    public static void main(String[] args) {
        int[] arr1 = new int[] {100,101,102,103,104};


        for (int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }

        // for-each
        // **********short cut***********
        for (int num : arr1){
            System.out.println(num);
        }
        //****also avoid miscounting of the looping ********
        // suitable for case that index is not important, just for showing the content of an array

        String[] arr2 = new String[] {"Hello","World","Java","Bootcamp","Exercise"};
        for (String s : arr2){
            System.out.println(s);
        }

        
    }
}
