public class Car
{
	String name;
	String color;
	String brand;
	double tCapacity, dCovered;
	
	public Car(String name,String color,String brand,double tCapacity,double dCovered)
	{	
		this.name = name;
		this.color = color;
		this.brand = brand;
		this.tCapacity = tCapacity;
		this.dCovered = dCovered;
	}
	
	public void printCarDetails()
	{	
		System.out.println(name + " " + color + " " + brand);
	}
	
	public void changeColor(String newColor)
	{
		this.color = newColor;
	}
	public double calcMileage()
	{
		double Mileage = (dCovered/tCapacity);
		return Mileage;
	}
}
	
