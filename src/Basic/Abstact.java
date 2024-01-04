package Basic;
abstract class Bank{	
abstract void rateofinterest();
void print()
{
System.out.println("Concrete method");
}
}
class SBI extends Bank
{
void rateofinterest () {
System. out. println("Rate of interest is 12% ");
}
}
class AXIS extends Bank{
void rateofinterest () {
System.out.println("Rate of interest is 15% ");
}
}
public class Abstact {

	public static void main(String[] args) {
		SBI sbi= new SBI();
		AXIS axis= new AXIS(); 
		sbi.rateofinterest();
		axis.rateofinterest();
		sbi.print();
	}
}