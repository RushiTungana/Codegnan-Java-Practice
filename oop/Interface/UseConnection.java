package comm.oop.Interface;
interface Connection{
	void getCommand(String command);
}
class Manager{
	private static class Statement implements Connection{
		@Override
		public void getCommand(String command) {
			System.out.println("Statement permits only static command");
			System.out.println(command);
		}
	}
	private static class PrepareStatement implements Connection{
		@Override
		public void getCommand(String command) {
			System.out.println("Prepared statements permits both static, dynamic commands");
			System.out.println(command);
		}	
	}
	private static class CallStatement implements Connection{
		@Override
		public void getCommand(String command) {
			// TODO Auto-generated method stub
			System.out.println("Callable statement permits static , dynamic commands");
			System.out.println(command);
		}	
	}
	static Connection getConnection(String statement) {
	if(statement.equalsIgnoreCase("Statement")) {
		return new Statement();
	}else if(statement.equalsIgnoreCase("Prepared")) {
		return new PrepareStatement();
	}else if(statement.equalsIgnoreCase("Callable")) {
		return new CallStatement();
	}
	return null;
	}
}
public class UseConnection {
	public static void main(String[] args) {
		Connection c = Manager.getConnection("Statement");
		execute(c,"get shiva id: 5");//static
		c=Manager.getConnection("Prepared");
		execute(c,"get name: ? with id: ?");//Palceholders
		c=Manager.getConnection("Callable");
		execute(c, "get procedure call(userDetails)");//call in procedure
	}
	private static void execute(Connection c, String command) {
		// TODO Auto-generated method stub
		c.getCommand(command);
		
	}

}
