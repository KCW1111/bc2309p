package exercise;

// Summary (5-Oct)
// static variable
// default empty constructor
// static method can call static vriable
// instance method can call static variable
// can static method call instance variable??? Why???
// instance method can call instance variable (getter, setter)
// what is meaning of "no setter"?
// what is private?


public class Exam {

  // Access Modifier: public , private, protected, package-private (default)
  // public -> class, attribute, method, constructor
  // private -> attribute, method, constructor
  // protected -> attribute, method, constructor
  // package-private -> class, attribute, method, constructor
  
  private Subject[] subjects;

  private static int size = 1; // as the first subject is add by creating exam, or in the Exam constructor use size++ too.

  static final String x = "hello"; // final, in compile time, compulary of value assignment, such as:
  static final int noOfdayOfAWeek = 7;

  public static int getNoOfDayOfWeek(){ // for simplicity, use static method to aceess static variables
    return noOfdayOfAWeek;
  }


  public Exam(Subject subject){
    this.subjects = new Subject[10];
    this.subjects[0] = subject;

  }

  public void addSubject(Subject subject){
for (int i = 0; i<this.subjects.length; i++){
      if(subjects[i] == null){
        subjects[i] = subject;
        Exam.size++; // only size is ok, no need to use Exam.size
        break; // can be 'return', return will leave the fuction but break just stop the loop
      }
    }
  }

  public Subject[] getSubjects(){
    return this.subjects;
  }

  public double average(){
    double average = 0;
    double total = 0;
    int counter = 0;
    for (int i = 0; i<this.getSubjects().length; i++){
      if (this.getSubjects()[i] != null){
        total += this.getSubjects()[i].getScore();
        counter++;
      }
    }
    //average = total/counter;
    average = total/Exam.size;
    return average;

  }
  
  public static void main(String[] args) {
    // instance method to calculate the average score of the exam

    

    Subject subject1 = new Subject();
    subject1.setDescription("Chinese");
    subject1.setScore(90);
    Exam exam = new Exam(subject1);
    


    Subject subject2 = new Subject();
    subject2.setDescription("English");
    subject2.setScore(80);
    exam.addSubject(subject2);

    System.out.println("The average score is:" + exam.average());

    System.out.println("Static method, Exam.getNoOfDayOfWeek()=" + Exam.getNoOfDayOfWeek());

    





    



  }
}
