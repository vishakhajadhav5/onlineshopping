package online_shopping;

public class product {
	private String name,brandname;
	private int pid;
	private double price;
	
	product()
	{
		name="School Bag";
		brandname="Fastrack";
		pid=1996;
		price=1800;
	}
	
	void getname(String name)
	{
		this.name=name;
		
	}
	String setname()
	{
		return name;
	}
	
	
	void getbname(String brandname)
	{
		this.brandname=brandname;
		
	}
	String setbname()
	{
		return brandname;
	}

	
	void getpid(int pid)
	{
		this.pid=pid;
		
	}
	int setpid()
	{
		return pid;
	}
	
	void getprice(double price)
	{
		this.price=price;
		
	}
	double setprice()
	{
		return price;
	}
	
	product(String name, String brandname, int pid, double price)
	{
		System.out.println("Parameterised constructor");
		this.name=name;
		this.brandname=brandname;
		this.pid=pid;
		this.price=price;
	}
	
	void showinfo()
	{
		System.out.println("..................infomation about product...................\n");
		System.out.println("Name of product:"+name+"\n brand name:"+brandname+"\n product id:"+pid+"\n price:"+price);
	}
	
	
	
	
	
}
