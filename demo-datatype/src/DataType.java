public class DataType{
    public static void main(String arg[]){
        //read the code from right to left
        String box = "Hello World Me!!!"; //Assign value "Hello World" to a variable box, assignment
        System.out.println(box);//Print a variable
        System.out.println("box"); // Print the String Value: box

        String str; // Declaration
        str = "abc"; // Assign value "abc" to a variable str
        System.out.println(str); // abc


        //Primitives (one kind of data type, 8 types)
        int x = 1;
        int salary = 1000;
        x = 10; //reassignment

        System.out.println(x); //10

        x = x + 2; //Always read from right to left
        // 10 + 2, assign 12 back to variable x

        System.out.println(x); //12

        x = x - 8;
        System.out.println(x); // 4, as 12 - 8 and assign it back to x

        salary = salary + 4;
        System.out.println(salary);

        int z = salary / 2;
        System.out.println(z);

        int k = z * 5;
        System.out.println(k);

        int sum = x + salary + z + k;
        System.out.println(sum);

        int result = sum + 10 / 2; 

        System.out.println(result);


        // self + 1
        int j = 0;
        j = j + 1; // 1st approach
        j += 1; // 2nd approach
        j++; // 3rd approach
        ++j; // 4th approach, very differnt from the 3rd approach, but here has the same effect

        System.out.println(j); //4

        String s  = "hello";
        s = s + " world.";
        System.out.println(s);

        String str1 = "abc";
        String str2 = "xyz";
        String e = str1 + str2;
        System.out.println(e);
        System.out.println("e=" + e);

        //int -> Integer
        //int a = 0.3; // cannot assign decimal to int variable

        double d = 0.3;
        d = 3.1415;
        System.out.println(d); // 3.1415
        // using double to do arithmeatic opeartion may have problem

        d = d + 0.3;
        System.out.println(d);

        d = d + 0.3 - 0.1 * 2;
        System.out.println(d);

        double d2 = 3; // assign int to variable d2, then convert int to double
        System.out.println(d2);

        //boolean (true OR false)
        boolean a = true;
        System.out.println(a); // true
        boolean isLeft = false;
        System.out.println(isLeft); // false

        //String w = true; //cannot assign true/false to String variable
        // boolean doesn't support arithematic opeartions

        boolean isMale = true;

        // char
        char t = 'a'; // ***using SINGLE quote.
        // char t = 'ab'; is Not ok, can have 1 character only
        // char t = ''; is Not ok, cannot be empty, must have one and only one character

        char o = '$';
        System.out.println(o);

        //byte
        byte b =1; // Within -128 to 127
        // byte b2 = -129; // out of range
        // byte b3 = 128; // out of range

        //b = b + 10; // byte, after operations, there will be conversion.

        // short
        short sh = 128;
        // short sh2 = -40000; // not okay, out of range
        // short sh3 = 40000; // not okay, out of range
        int r2 = sh + 100;
        System.out.println("r2=" + r2);

        //long
        long l1 = 10000;
        l1 += 20000; //l1 = l1 + 20000;
        System.out.println(l1); // 30000


        l1 -= 5000; // l1 = l1 - 5000;
        System.out.println(l1);

        l1 *= 2;
        System.out.println(l1); // 50000

        l1 /= 10; // l1 = l1 / 10;
        System.out.println(l1); // 5000


        // String Supports +-
        String k2 = "abc";
        k2 += " bcd";
        System.out.println(k2);

        //float
        int i = 1; //in Java, when there is an '1', default it is an integer
        double d4 = 3.0; // in Java, where there is a '3.0', default it is double 
        double d5 = 3.0d; // Explicitly assign a double value to a varialbe
        //float f = 3.0; // This is not okay, as it is 3.0, Java take that as double, which you are assigning a double to float
        float f = 3.0f; // As programmer explicitly assigning 3.0 as float, so assigning float value to float variable, it is ok
        //*** Java is a strong type language, that is why programmer need to make sure what kind of value is going to assign what kind of variable

        // byte, short , int, long -> all of them handle Integer
        byte b3 =3;
        short s3 = 4;
        int i3 = 5; // default int value
        long l4 = 5; // (upcast), you can ignore today
        long l3 = 5L; // Assign long value 5 to a long variable, this way recommended, only Long can explicitly casting

        














    }
}