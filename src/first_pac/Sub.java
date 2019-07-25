package first_pac;

public class Sub
{
	private int i=10;
	int j=20;
	protected int k=30;
	public int l=40;
	
	public void show()
	{
		System.out.println("private"+" "+i);
	}




	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub obj1=new Sub();
		System.out.println("default"+" "+obj1.j);
		

	}

}
