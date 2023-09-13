public class DemoConversion {
    public static void main(String[] args) {
        // Primitives
        // Upcast (promotion)
        // byte -> short -> int -> long (Integer)
        byte b = 10;
        short s = b; // upcast: from byte to short
        // in compile time (at the moment of writing program), 10 is okay to be byte or short
        // but when the program runs, it is possible b can be out-ranged after operations
        // then it violates short's range
        // byte b2 = s; , is illegal, this is downcast
        int a = 20;
        long l = a;

        // float -> double
        float f = 10.323f;
        double d = f; // upcast

        // char -> int
        char c = 'a';
        int w = c; // upcast
        // w is storing ASCII after upcasting, i.e. 97

        System.out.println(w);

        // char c2 = w; , which is invalid, the same reason applies, 
        // in compile time is okay, 97 can be converted back to character, 
        // but it is possible the integer goes up to 60000, out-ranged char's range

        // Downcast

        short s3 = 10;
        // This is illegal -> byte b3 = s3; but with downcasting:
        byte b3 = (byte) s3;
        System.out.println(b3); // 10

        short s4 = 30000;
        byte b4 = (byte) s4;
        System.out.println(b4); // 48!? A Java behaviour (Overflow):48, i.e. overflow and start counting again from -128, until it reaches 48

        short s5 = 128;
        byte b5 = (byte) s5;
        System.out.println(b5); //-128, as overflow at 127, and count again from -128

        double d5 = 10.234d;
        float f5 = (float) d5;
        System.out.println(f5);

        short s6 = 32767;
        s6++;
        System.out.println(s6); // -32768

        // Overflow case, initial D arcade game

        // int -> char (0-65535)
        int i6 = 99; // 'c'
        char c6 = (char) i6;
        System.out.println(c6); // 'c'

        char c8 = 'A'; // 65
        char c9 = 'a'; // 97

        if (c8>c9){ // conversion: char -> int, by Java
            System.out.println("c8 > c9 in ascii");
        }else{
            System.out.println("c9 >= c8 in ascii");
        }

        byte b9 = 100;
        short s9 = 101;
        if (s9 > b9){ // conversion: byte -> short
            System.out.println("s9 > b9");
        }






    }
}
