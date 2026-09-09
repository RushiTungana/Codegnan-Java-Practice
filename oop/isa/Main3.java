package comm.oop.isa;

import java.util.Scanner;
final class Book{
  private final String category;
  public Book(String category){
    this.category=category;
  }
  public String getType(){
    if("Novel".equalsIgnoreCase(category)){
      return "Story";
    } else if("Comic".equalsIgnoreCase(category)){
      return "Funny";
    }
    return "";
  }
}
public class Main3{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    if(sc.hasNextLine()){
      String category=sc.nextLine().trim();
    Book book=new Book(category);
      System.out.println(book.getType());
      }
    sc.close();
  }
}