package comm.oop.exceptions;
import java.util.*;

class InvalidPinException extends Exception{
	public InvalidPinException(String message) {
		super(message);
	}
}
public class CustomeException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		while(i<3) {
			try {
				int pin = sc.nextInt();
				if(pin<1000||pin>9999) {
					throw new InvalidPinException("InvalidPinException");
				}
				System.out.println("Right pin");
				break;
			}catch(InvalidPinException e){
				System.out.println(e.getMessage());
				i++;
				if(i==3) {
					System.out.println("Account disable");
					break;
				}
			}
		}
		// TODO Auto-generated method stub

	}

}
