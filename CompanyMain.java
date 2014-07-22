package carCompany;

public class CompanyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company next = new Company();

		
		Car[] cars = new Car[3];
		cars[0]=new Sonata(3000,3);
		cars[1]=new Grandeur(4000,2);
		cars[2]=new Genesis(5000,1);
		
		next.accounting(cars);
	}

}
