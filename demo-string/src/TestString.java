public class TestString {
    public static void main(String[] args) {
        String str = "abc";
        if ("abc".equals(str)){ // str.equals("abc") is not good way, as equals()->method, String can use methods
            System.out.println("it is abc");
        }
        if("abc".length() == 3){
            System.out.println("length = 3");
        }
        if(str.length() == 3){
            System.out.println("length = 3");
        }

        // str -> "abc", string can read the content through index
        // 'a' at position [0]
        // 'b' at position [1]
        // 'c' at position [2]
        if (str.charAt(0) == 'a'){
            System.out.println("chatAt 0 in String str is a");
        }

        if (str.charAt(1) == 'b' || str.length() < 3){
            System.out.println("OK");
        }

        float f1 = 100.3f;
        long l1 = 1000l;
        //long l1 = 220000000; it is not valid, as 220000000 here is default integer, that is why put 'l' at the end is needed
        long l2 = 2200000000l;
        double d1 = 1.0; //1.0d
        byte b1 = 127;
        short b2 = 32000; // assign short 32000 to short, Java converts int 32000 to short 32000, then assign short 32000 to s1
        short s1 = 32000; 

        
    }
}
