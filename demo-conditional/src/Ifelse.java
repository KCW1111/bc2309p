public class Ifelse {
    public static void main(String[] args) {
        int x = 100;
        if (x > 50) {
            System.out.println("x > 50");
        }

        x = 40;
        if (x < 40) {
            System.out.println("x < 40");
        } else { // x>=40
            System.out.println("x >= 40");
        }

        x = 80;
        if (x !=80 ){
            System.out.println("x is not equals 80");
        } else if (x < 80) {
            System.out.println("x is smaller than 80");
        } else if (x >= 80){
            System.out.println("x is larger than or equals to 80");
        }

        int y =10;
        if (y == 9){ //y > 9
            System.out.println("y < 9");
        }else {
            System.out.println("y > 9");
        }

        //boolean
        boolean isMale = false;
        if (isMale){
            System.out.println("I am Male");
        }else{
            System.out.println("I am Female");
        }

        //Char
        char grade = 'A';
        if (grade == 'B'){
            System.out.println("it is B");
        }else if (grade =='C'|| grade == 'A'){
            System.out.println("It is C or A");
        }else{
            System.out.println("bye");
        }

        // check if a number is an even number
        int num = 10;
        if (num % 2 ==0){
            System.out.println("it is an even number. num=" + num);
        }

        // check if a number is an odd number
        int num2 = 9;
        if (num2 % 2 ==1){
            System.out.println("it is an odd number. num=" + num2);
        }else {
            System.out.println("it is an even number. num=" + num2);
        }

    }
}


