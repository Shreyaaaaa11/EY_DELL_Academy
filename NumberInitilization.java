package PackageA;

public class NumberInitilization {
int number1;
static int number2;
static {
	System.out.println("Static Initializer");
	number2 = 100;
}
NumberInitilization(){
	number1 = 78;
}
public static void main(String[] args) {
	System.out.println("Main Method");
	System.out.println("The value of number2 is" + number2);
	NumberInitilization obj = new NumberInitilization();
	System.out.println("The value of number1 is" + obj.number1);
}

}
