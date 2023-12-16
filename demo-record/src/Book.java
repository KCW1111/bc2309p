public record Book(String bookName, String author) {

    public static final int NUM = 10;
    public static String bookstore = "ABC";
    public Book{ // modify the all-args constructor, ** Constructor no overwrite
        if(bookName == null || author == null){
            throw new IllegalArgumentException();
        }


    }
    //public static int 

  //public void get() {}
  //public void set() {}

  // All attributes has been "final"
  // public void setBookaname(String bookName){
  //     this.bookName = bookName;
  //   }

  public static int add(int x, int y){
    return x + y;
  }

  public void publish(){
    System.out.println(this.author + " " + this.bookName);
  }
}
