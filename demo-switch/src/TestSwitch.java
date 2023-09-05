public class TestSwitch {
    public static void main(String[] args) {
        int score = 90;
        char grade = ' ';
        switch(score){
            case 90: //match
                grade = 'A'; //execute, but switch will not break, you need to break explicitly
                //System.out.println("case 90");
                break;
            case 80:
                grade = 'B';
                //System.out.println("case 80");
                break;
            case 70:
                grade = 'C';
                //System.out.println("case 70");
                break;
            case 60:
                grade = 'D';
                //System.out.println("case 60");
                break;
            default:
                grade = 'F';
                //System.out.println("case default");
        }
        System.out.println("The grade is " + grade);

        // Alternative, if-else
        if (score >=90){
            grade = 'A';
        }else if (score >= 80){
            grade = 'B';
        }else if (score >=70){
            grade = 'C';
        }else if (score >=60){
            grade = 'D';
        }else {
            grade = 'F';
        }
    }
}
