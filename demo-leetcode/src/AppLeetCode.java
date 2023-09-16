public class AppLeetCode {
    public static void main(String[] args) {
        int num = 6969;

        int stop = 0;
        String numString = String.valueOf(num);
        System.out.println(numString);
        char[] numChar = numString.toCharArray();
        //int[] changedNumber = new int[]{numString.length()};

        //char[] characters = str.toCharArray();

        for (int i = 0; i<numString.length(); i++){
            if (stop<1){
            //System.out.println(numChar[i]);
            if (numChar[i]=='6'){
                numChar[i]='9';
                stop++;
            }
            continue;
        }
        break;
    }

        System.out.println(numChar);
        
        
    }
}