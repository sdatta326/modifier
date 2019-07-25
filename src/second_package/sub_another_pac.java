package second_package;

import first_pac.*;

class M
{
	Sub obj1=new Sub();
	
	void show()
	{
		System.out.println("public"+" "+obj1.l);
	}
}

/*class B extends Sub
{
Sub obj1=new Sub();
	
	void show2()
	{
		System.out.println("public"+" "+obj1.k);
	}	
}*/

public class sub_another_pac extends Sub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub obj2=new Sub();
		
		sub_another_pac nn=new sub_another_pac();
		
		
			System.out.println("protected"+" "+nn.k);
		
		

	}

}
