package Class3;
import java.io.IOException;
public class ThrowKeyword {
public static void main(String[] args) {
	sampleMethod();
	System.out.println("Rest of code....");
}
static void sampleMethod() {
	try {
		throw new IOException("Device error");
		}catch (IOException e) {
			System.out.println("Exception Handled");
		}
}
}
