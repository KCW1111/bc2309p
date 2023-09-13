public class DemoArrayLoop {
  public static void main(String[] args){
    int[] nums = new int[4];
    nums[0] = 100;
    nums[1] = 109;
    nums[2] = 1000;
    nums[3] = 1005;
    for (int i=0; i<4; i++){
      System.out.println(nums[i]);    
    }

    //better way

    for (int i=0; i<nums.length; i++){ // nums.length, length is a tool, not a method, length()
      System.out.println(nums[i]);
    }

    //Sum all the vales in an array
    System.out.println("//Sum all the vales in an array");

    int sum = 0;
    for (int i=0; i<nums.length; i++){ // nums.length, length is a tool, not a method, length()
      sum += nums[i];
      System.out.println(sum);
    }

    //Find the max value in the array, and store in the varaible result
    System.out.println("//Find the max value in the array, and store in the varaible result");

    int result = -1;
    for (int i=0; i<nums.length; i++){
      if (nums[i]>result){
        result = nums[i];
      }else{
        continue; // this part is not necessary
      }
    }
    System.out.println("The max value in an array is: " + result);

    //Find the min value in the array, and store in the variable result
    System.out.println("//Find the min value in the array, and store in the variable 'min'");

    int min = nums[0];
    for (int i=0; i<nums.length; i++){
      if (nums[i]<min){
        min = nums[i];
      }
    }
    System.out.println("The min value in an array is: " + min);

    //Find the average value of all the values in the array
    System.out.println("//Find the average value of all the values in the array");

    float average = 0f;
    float sum2 = 0f;
    for (int i = 0; i < nums.length; i++){
      sum2 += nums[i];
    }
    average = sum2 / nums.length; // If division is used, should use double
    System.out.println("The average value of values in an array is: " + average);

    // Print odd numbers in the array, from the tail of the array
    System.out.println("// Print odd numbers in the array, from the tail of the array");

    for (int i = nums.length -1; i>=0; i--){
      if(nums[i]%2 == 1){
        System.out.println(nums[i]);
      }
    }

    int[] arr5 = new int[] {100,99,1005,2000};
    arr5[3] = 3000;
    //arr5[4] = 3001; // it throws exception, this error can only be found in run time, not in compile time
    // The length of the array cannot be changed, but redeclared, that is:
    arr5 = new int[] {1,2,3,4,5};
    // This is legal, because, the arr5 with 5 spaces is a new object, the arr5 with 3 spaces is missing, cannot be resued

    //
    int[] integers = new int[] {100,3,10,5,-100};
    int target = 10;
    // Print the index of value 10
    System.out.println("Print index with value 10");
    for (int i = 0; i<integers.length; i++){
      if (integers[i] == target){
        System.out.println("The index is: " + i);
      }
    }

    //Strings -》equals, charAt, length
    // When found 'o', replace it by z, and print str
    System.out.println("// When found 'o', replace it by z, and print str");
    String str = "hello world";
    char[] characters = str.toCharArray();
    System.out.println(characters);
    for (int i = 0; i<characters.length; i++){
      if (characters[i] == 'o'){
        characters[i] = 'z';
      }
    }
    System.out.println(characters); // This is still characters, not string, so:
    System.out.println(String.valueOf(characters)); // char[]-> String, charater array converts into string
    // String u = String.valueOf(1); // 1, integer type, converts to "1", string type
    //Value of is the a tool of String


    



  














  }
}
