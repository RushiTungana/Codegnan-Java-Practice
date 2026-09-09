package comm.oop.isa;
import java.util.*;
class Text{
	String getText() {
		return "Hello";
	}
}
class Email extends Text{
	String getText(String suffix) {
		return super.getText()+" "+suffix;
		
	}
}
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String suffix=sc.nextLine();
		Email e = new Email();
		System.out.println(e.getText(suffix));
		

	}

}
