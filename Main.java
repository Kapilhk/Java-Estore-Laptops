import java.lang.reflect.InvocationTargetException;
import java.util.*;
class Main 
{
	static String cartchoice=null;
	  static int cartno=0;
	static int select;
 public static void main(String arg[]) throws InvocationTargetException, InterruptedException
 {
	cart user=new cart();
	Scanner sc=new Scanner(System.in);
	System.out.println("");
    System.out.println("\t\t \t\t \t\t \t\t \t  WELCOME");
   System.out.println("");
	match m=new match();
	while(true){ try{
    while(true){
        
        select=m.compare();
        if(select==1)
        {
        	continue;
        }
       
       System.out.println("Enter 'y' to add to cart  or 'n' to Return➡ ");
       String y=sc.next();
       if(y.equalsIgnoreCase("y"))
       {
		  boolean b=user.addchoice(m.orderid);
		  if(b)
			  cartno++;
      	  m.stocksub();
       }
       if(cartno!=0)
       {   
    	   
    	   while(cartchoice!="c"&&cartchoice!="a")
    	   {
    	   System.out.println("Enter 'c' to go to cart or 'a' to add another item.");
    	   cartchoice=sc.next();
    	   if(cartchoice.equalsIgnoreCase("c")||cartchoice.equalsIgnoreCase("a"))
    	   {
    		   break;
    	   }
    	   else
    	   {
    		   System.out.println("Invalid choice");
    	   }
    	   }
    	   
       }
       if(cartno!=0&&cartchoice.equalsIgnoreCase("c"))
	   {
		   break;
	   }
       if(cartno!=0&&cartchoice.equalsIgnoreCase("a"))
       {
    	   continue;
       }
    }
    if(cartchoice.equalsIgnoreCase("c"))
    {
    	try{
    	user.gotocart();
    	}
    	catch(Exception e){}
    }
	break;}
	catch(InputMismatchException e){
		System.out.println("Input Error!! Try again");
	}
  }
 }
}