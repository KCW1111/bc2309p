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

    }
}
