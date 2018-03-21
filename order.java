import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class order{
	int del;
	long pin;
	void orde(double totalcartprice,int user)throws IOException{
	 File r = new File("order"+(user)+"details.txt");
	FileWriter pw= new FileWriter(r);
	 String name,add1,add2;;
	 long pincode;
	 int x;
	Scanner sc=new Scanner(System.in);
	while(true){

	System.out.println("Enter area pincode to check availability and Delivery Charges: ");
	long pin=sc.nextLong();
	if(pin>=100000&&pin<=999999){
		pincode=pin;
	if(pincode>=400000&&pincode<=400099)
	{
		System.out.println("Free Delivery in 3 working days!");
		del=0;
	}
	else
	{
		System.out.println("Delivery in 7 working days! Delivery charges Rs. 350 added to total.");
		totalcartprice=totalcartprice+350;
		del=1;
	} break;
	}
	else
		System.out.println("Invalid pincode.");
	}
	System.out.println("Enter name: ");
	name=sc.next();
	System.out.println("Enter Address line 1: ");
	add1=sc.next();
	System.out.println("Enter Address line 2: ");
	add2=sc.next();
	while(true){
	System.out.println("Select mode of payment: ");
	System.out.println("1.Cash on Delivery \t 2.Credit/Debit Card");
	try{
	int c=sc.nextInt();
		x=c;
		break;
	}
	catch(InputMismatchException e){
		System.out.println("Invalid Input!");
		continue;
	}
}
		 Mode m=new Mode(totalcartprice,x,del,user);	  
		 Date date = new Date();
		 pw.append(date.toString()+"\n");
		 pw.append("Total=Rs."+totalcartprice+"\t Name:"+name+"\t Pincode:"+pincode+"\tAddress:"+add1+","+add2+"\t Mode of payment:"+x);
		 pw.flush();
		 pw.close();
}
}