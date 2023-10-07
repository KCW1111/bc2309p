package exercise;

public class Subject {
  
  private String description;
  private int score; // without private someone could bypass setter to control the instance variables

  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public char getGrade(){ // using switch, only suitable for limited possibilities, but marks gives many possibilities
    if (this.score>90)
      return 'A';
    else if (this.score >=80)
      return 'B';
    else if (this.score >=70)
      return 'C';
    else if (this.score >=60)
      return 'D';
    else
      return 'F';
    
}
  
}
