public class CarMain
{
	public static void main(String[] args)
	{
		Car City = new Car("City","Black","Honda",10,250);
		City.changeColor("blue");
		City.printCarDetails();
		double mileage = City.calcMileage();
		System.out.print(mileage);
	}
} 
