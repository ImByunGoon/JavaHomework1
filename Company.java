package carCompany;

public class Company {

	public void accounting(Car[] cars){
		int sum=0;
		for(Car car:cars){
			
			System.out.println(car.price);
			sum+=car.price*car.supply;
			
		}
		System.out.println(sum);
	}
}
