public class App {
    public static void main(String[] args) throws Exception {
        //Primitives - byte, short, int, long, float, double, char, boolean, they are just for storing values, and only arithmatic operations on them
        //String
        // Wrapper Class - Byte, Short, Integer, Long, Float, Double, Character, Boolean
        // Byte - byte, father - son
        // No such thing, float -> Double, they are totally irrelvant
        // But float -> Float -> Double, it is legal
        short s1 = 10;
        int i1 = s1; // upcast
        Integer i11 = i1; // auto-box
        // short -> int -> Integer
        int i2 = i11; // unbox

        // Integer i12 = s1; // cannot direct assign short variable to Integer directly
        Integer i12 = (int) s1; // short (cast)-> int (auto-box)-> Integer, autoboxing

        boolean b1 = true;
        Boolean b11 = b1; //auto-box

        char c1 = 'u';
        Character c11 = c1; //auto-box

        Float f11 = 9.3f; // auto-box, 9.3f is a float value

        Integer i13 = 100; // auto-box, 100 is a int value

        Long l11 = 5L; // auto-box, 5L is long value

        // Wrapper Class has null value (that is default value)
        // Primitives has default value, e.g. int default value 0, double -> 0.0, boolean -> false
        // char -> '\u0000'

        Integer i15 = 4;
        System.out.println(i15);
        i15 = null;
        System.out.println(i15);

        Integer i16 = 8; // new Integer(8), new an Integer object, Java is behind calling "new Integer(8)"
        Integer i17 = new Integer(8);
        System.out.println(i16.equals(i17)); // Wrapper class comparison, need equals to compare, do not use '=='
        // the output will be true
        System.out.println(i16 == 8); // Comparing Integer and int, Integer i16 will be unboxed

        System.out.println(i16.compareTo(8)); // 0, means equal
        System.out.println(i16.compareTo(9)); // -1, means less than
        System.out.println(i16.compareTo(7)); // 1, means larger than

    }
}
