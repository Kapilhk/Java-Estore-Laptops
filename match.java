import java.util.*;
public class match extends models{
	int cartno;
	match() {
	}
	int orderid;
int compare()
{
	int count1=0;
	int count2=0;
	int count3=0;
	Scanner sc2=new Scanner(System.in);
	choice ch=new choice();
	int f=ch.select();
	if(f==2)
	{ 
		System.out.println("\t\t\tModel   \t\tProcessor\tRam\tHDD\t   Graphics Card\tScreen size     \tPrice      \tStock Avl.");
		for(int i=0;i<20;i++)
		{
		if((super.l[i].price)<=(ch.budgetmax)&&(super.l[i].price)>=(ch.budgetmin))
			{
			System.out.println("Item Id:- "+i);
			count1++;
			super.l[i].display();
			System.out.println("");
			}
		}
		if(count1==0)
			{
			System.out.println("Sorry!! No Matching Laptop Found. ");
			}
		System.out.println("");
		System.out.println("");
		while(true)
		{
			System.out.println("Enter Item Id to display model or Enter 'n' to search again:");
			String or=sc2.next();
			if((or.charAt(0)<'0')||(or.charAt(0)>'9'))
				orderid=999;
			else
				{
				orderid=Integer.parseInt(or);
				}
			
			if(orderid>=20 && orderid!=999)
	    {
	    	System.out.println("Invalid choice. Please try again.");
	    	continue;
	    }
			else
				break;
		}
	}
	if(f==1)
	{
		System.out.println("\t\t\tModel   \t\tProcessor\tRam\tHDD\t   Graphics Card\tScreen size     \tPrice      \tStock Avl.");
		for(int i=0;i<20;i++)
		{
			count2=0;
			if(ch.ram<=super.l[i].ram)
				count2++;
			if(ch.gc<=super.l[i].gc)
				count2++;
			if(ch.hd<=super.l[i].hdd)
				count2++;
			if(count2==3)
			{
				if(ch.pro.equalsIgnoreCase(super.l[i].processor))
				{
				System.out.println("Item Id:- "+i);
				count3++;
				super.l[i].display();
				System.out.println("");
			    }
			}
		}
		if(count3==0)
		{
			System.out.println("");
			System.out.println("Sorry!! No Matching Laptop Found. ");
		}
	System.out.println("");
	System.out.println("");
	while(true){
	System.out.println("Enter Item Id to display model or Enter 'n' to search again:");
	String or=sc2.next();
	if(or.equalsIgnoreCase("n"))
		{
		orderid=999;
		break;
		}
	else
		orderid=Integer.parseInt(or);
    if(orderid>=20 && orderid!=999)
    {
    	System.out.println("Invalid choice. Please try again.");
    	continue;
	}
    else
    	break;
	}
	}
if(orderid==999)
	return(1);
else
	return((super.l[orderid].price));
}
void stocksub()
{
	l[orderid].stock--;
}
}