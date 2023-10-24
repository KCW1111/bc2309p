public class Demo2DArray {

  public static void print(int[] arr1d){
    for (int i =0; i<arr1d.length; i++){
      if (i!=arr1d.length-1)
        System.out.print(arr1d[i]+",");
      else
        System.out.print(arr1d[i]+"\n");
    }
  }

  public static void print(int[][] arr2d){
    for (int i = 0; i< arr2d.length; i++){
      //j -> col
      int counter = 0;
      for (int j = 0; j< arr2d[0].length; j++){
        if (counter != 2){
        //System.out.println("i= " + i + " j= " + j + ", val= " + arr2d[i][j]);
          System.out.print(arr2d[i][j] + ",");
          counter++;
        }
        else
          System.out.print(arr2d[i][j]);
      }
      System.out.println("");
    }
  }

  public static void print(String[] arr1d){
    for (int i =0; i<arr1d.length; i++){
      if (i!=arr1d.length-1)
        System.out.print(arr1d[i]+",");
      else
        System.out.print(arr1d[i]+"\n");
    }
  }

  public static void main(String[] args) {
    //declare 2D array
    int [][] arr2d = new int[3][3];
    int [][] arr2d2 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
    int [][] arr2d3 = {{1,3,10},{2,4,6},{11,13,17}};

    // i-> row
    for (int i = 0; i< arr2d2.length; i++){
      //j -> col
      for (int j = 0; j< arr2d2[0].length; j++){
        System.out.println("i=" + i + "j=" + j + ", val=" + arr2d2[i][j]);
      }
    }

    // assign 1,3,4,5,9 .. (odd number) to arr2d
    int val = 1;
    for (int i =0; i<arr2d.length; i++){
      for (int j=0; j<arr2d[0].length; j++){
        arr2d[i][j] = val;
        val +=2; 
      }
    }

    Demo2DArray.print(arr2d);


    // assign 2,4,6 .. (even number) to even2d
    int [][] even2d = new int [3][3];
    int val2 = 2;
    for (int i =0; i<even2d.length; i++){
      for (int j=0; j<even2d[0].length; j++){
        even2d[i][j] = val2;
        val2 +=2; 
      }
    }

    Demo2DArray.print(even2d);

    // product of arr2d and even2d ( i.e. 1x2, 3x4, 5x6....)
    // assumption: arr2d.elnth == even2d.elnth, arr2d[0].length
    // output resutl to another array


    int [][] cross2d = new int [3][3];
    for (int i =0; i<even2d.length; i++){
      for (int j=0; j<even2d[0].length; j++){
        cross2d[i][j] = arr2d[i][j] * even2d[i][j];
      }
  }

  //Demo2DArray.print(cross2d);
  print(cross2d);


  // arr2d, it is 3x3
  // convert 2d array to 1d array
  // 1,3,10; 2,4,6; 11,13,17 -> (1+2+11) .....

 int[] convert1d = new int [3];
 for (int i =0; i<arr2d3.length; i++){
  int temp = 0;
      for (int j=0; j<arr2d3[0].length; j++){
        temp += arr2d3[j][i];
      }

      convert1d [i] = temp;
    }

  
  print(convert1d);


  int[] convert1d2 = new int [3];
 for (int i =0; i<arr2d.length; i++){
  int temp = 0;
      for (int j=0; j<arr2d[0].length; j++){
        temp += arr2d[j][i];
      }

      convert1d [i] = temp;
    }

  
  print(convert1d);



  char[][] arr9 = new char [][]{{'h','e','l','l','o'},{'J','o','h','n'}};

  String[] combined = new String [arr9.length];
  for (int i = 0; i<arr9.length; i++){
    combined[i] = "";
    for (int j = 0; j<arr9[i].length; j++){
      combined[i] += arr9[i][j]; // String + Char -> String
      //System.out.println(combined[i]);
    }
  }
  print(combined);
  //System.out.println(combined[1]);







}
}
