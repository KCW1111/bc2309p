import java.util.ArrayList;

public class School {
  
  private ArrayList<Student> students; // last week, Student[] students, not useful

  public School(){
    this.students = new ArrayList<>(); // when new School(), this executes, there is at least an ArrayList object in heap
  }

  public ArrayList<Student> getStudents(){
    return this.students;
  }

  public boolean addStudent(Student student){
    return this.students.add(student);
  }

  @Override
  public String toString(){
    return this.students.toString();
  }

  public static void main(String[] args) {
    School school = new School(); // refer to empty constructor above, without creating new ArrayList<>(), it throws runtime error
    school.addStudent(new Student(15,"Mary"));
    school.addStudent(new Student(16,"Sam"));
    System.out.println(school.toString());

    
  }


}
