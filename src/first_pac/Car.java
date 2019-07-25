package first_pac;

class Vehicle
{
	int engine;
	
	Vehicle(int engine)
	{
		this.engine=engine;
	}
}

public class Car extends Vehicle {
	
	
	
	
	String type;
	Car(int engine,String type)
	{
		super(engine);
		this.type=type;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car c=new Car(100,"ac");
		
			
		
		System.out.println(c.engine+" "+c.type);

	}

}
