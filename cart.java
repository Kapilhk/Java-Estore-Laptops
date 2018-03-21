import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class cart extends models {
	int i=0;
	int tem;
	int counter=0;
	int choices[]=new int[50];{
		choices[0]=999;
	i++;	
	}
	boolean addchoice(int id)
	{
		 if((l[id].stock)==0)
	        {
	        	System.out.println("Sorry, Selected product is Out of Stock!");
	        	System.out.println("Please try agian-");
	        	return false;
	        }
		 else{
		choices[i]=id;
		i++;
		l[id].deductstock();
		counter++;
		return true;
		 }
	}
	
	void delchoice(int id)
	{
		int j;
		for(j=1;j<=i-1;j++)
			if(choices[j]==id)
				{
					choices[j]=999;
					counter--;
					System.out.println("Item Deleted.");
					return;
				}
			if(j==i-1)
				System.out.println("Item not found in cart");
	}

	void display()
	{
		int disp=0;
		if(counter!=0)
			for(int j=1;j<=i-1;j++)
				if(choices[j]!=999)
				{
					if(disp==0)
					System.out.println("\t\t\tModel   \t\tProcessor\tRam\tHDD\t   Graphics Card\tScreen size     \tPrice ");
					System.out.println("Item Id:- "+choices[j]);
					super.l[choices[j]].displaywtst();
					System.out.println("");
					disp++;
				}
		if(counter==0)
		{
			System.out.println("");
			System.out.println("No items in Cart !!");
		}
	}
	double total()
	{
		double temp=0;
		if(counter!=0)
			for(int j=1;j<=i-1;j++)
				if(choices[j]!=999)
				{
					temp=temp+super.l[choices[j]].price;
				}
		return(temp);
	}
	void gotocart() throws IOException
	{   
		int ch=0;
		while(ch!=3){ try{
		Scanner sc=new Scanner(System.in);
		while(ch!=3){
		System.out.println("Enter choice:");
		System.out.println("1.View all items in cart \t\t 2.Delete a item");
		System.out.println("3.Go to purchase         \t\t 4.View total cart price.");
		ch=sc.nextInt();
		if(ch==1)
		{
			this.display();
		}
		else if(ch==2)
		{
			System.out.println("Enter id of item to be removed:");
			tem=sc.nextInt();
			delchoice(tem);
		}
		else if(ch==4)
		{
			System.out.println("\n Total Cart price is Rs."+this.total());
		}
		else if(ch==3)
		{
			if(counter!=0)
		{
			Random generator = new Random(); 
			int user = generator.nextInt(1000) + 1;
			double totalcartprice=this.total();
			for(int j=1;j<=i-1;j++)
				if(choices[j]!=999)
				{
					 File r = new File("order"+user+".txt");
						FileWriter pw= new FileWriter(r);
						pw.append("\n Item id: \t"+choices[j]);
						 pw.flush();
						 pw.close();
				}
			order o=new order();
			o.orde(totalcartprice,user);
			break;
		}
			else{
				System.out.println("No item in Cart!");
			    }
		}}
		}
		catch(InputMismatchException e){}
		}
}
}
