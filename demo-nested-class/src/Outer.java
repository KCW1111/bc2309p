public class Outer {

    private String name1;

    private static int value = -20;

    public Outer(String name){
        this.name1 = name;
    }

    public void display(){
        System.out.println("This is outer display. And my name is: " + this.name1);
    }

    public class InnerClass{

        private String name3;

        public InnerClass(String name3){
            this.name3 = name3;
        }

        public void display(){
            System.out.println("outer name1 = " + name1 + " , inner name3 = " + name3);
        }
    }

    public static class NestedClass{ // this class can be private

        private String name2;
        
        public NestedClass(String name){
        this.name2 = name;
        }

        public void display(){
            // System.out.println(this.name2 + " " + this.name1);
            // Outer class and static nested class are not talking

            System.out.println(this.name2 + " " + Outer.value);
        }
    }

}
