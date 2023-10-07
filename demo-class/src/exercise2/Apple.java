package exercise2;

public class Apple {
  protected String name;
  Cat cat = new Cat(); // although Cat.java is package-private, but Apple.java share the same package (folder) with Cat.java, so it works.
}
