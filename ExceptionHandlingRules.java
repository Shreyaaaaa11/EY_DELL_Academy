package Class3;
import java.sql.SQLException;
class Parent{
	void show() throws SQLException{
		System.out.println("Parent Class Method");
	}
}
public class ExceptionHnadlingRules extends Parent{
	void show()throws Exception{
		System.out.println("Child Class Method");
	}
	public static void main(String[] args) {
}
}
