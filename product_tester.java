package online_shopping;
import java.util.*;
public class product_tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		product p1=new product();
		p1.showinfo();
		String name,brandname;
		int pid;
		double price;
		System.out.println("Enter info. about product\n");
		System.out.println("Product Name:");
		name=sc.next();
		
		System.out.println("Product brand Name:");
		brandname=sc.next();
		
		System.out.println("Product id:");
		pid=sc.nextInt();
		
		System.out.println("Product price:");
		price=sc.nextDouble();
		
		
		product p2=new product(name,brandname,pid,price);
		p2.showinfo();
		
		System.out.println("Getter setter info. about product\n");

		p2.getname(name);
		p2.setbname();
		p2.getbname(brandname);
		p2.setbname();
		p2.getpid(pid);
		p2.setpid();
		p2.getprice(price);
		p2.setprice();
		
		p2.showinfo();
	}

}
