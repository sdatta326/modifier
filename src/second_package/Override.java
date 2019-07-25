package second_package;

class Superclass
{
	public void display()
	{
		System.out.println("parent class method");
	}
}

public class Override extends Superclass {
	
	public void display()
	{
		super.display();
		System.out.println("child class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Override s1=new Override();
		
		s1.display();
	}

}
