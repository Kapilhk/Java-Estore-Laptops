import java.util.Scanner;

class Mode
{
	Mode(double lastp,int c,int del,int user){
		String b;
Scanner sc=new Scanner(System.in);
switch(c)
{
	case 1:
		break;
    case 2:
   System.out.println("Enter the bank name ");
   b=sc.next();
   System.out.println("Enter y if u want pay in montly instalments and if not then press any key");
   String s=sc.next();
   if(s.equals("y"))
   {
	   if(lastp>=25000)
	   {
	     System.out.println("Emi option available");
	     System.out.println("Downpayment for the model u have choosen is Rs.10000");
	     System.out.println("Enter the no. of emi's u want i.e. 6 or 9 or 12");
	     int m=sc.nextInt();
	     if(m==6)
	     {
	     int e;
	     lastp=(lastp+lastp*0.06);
	     e=(int) (lastp-10000);
	     e=e/6;
	     System.out.println("Your monthly installment for "+m+" months is:"+e);
	     }
	     else if(m==9)
	     {
	     lastp=(lastp+lastp*0.07);
	     int e;
	     e=(int) (lastp-10000);
	     e=e/6;
	     System.out.println("Your monthly installment for "+m+" months is:"+e);
	     }
	     else if(m==12)
	     {
	     lastp=lastp+lastp*0.08;
	     int e;
	     e=(int) (lastp-10000);
	     e=e/6;
	     System.out.println("Your monthly installment for "+m+" months is:"+e);
	     }
	     break;
	   }
	   else
	   {
	     System.out.println("Emi option not available for models below Rs.25000");
	          break;
	   }
   }
}
	System.out.println("Your order id :"+user);
   if(del==0)
   System.out.println("Complete the payment on Delivery.You will receieve your order in next 3-4 working days");
   else
	   System.out.println("Complete the payment on Delivery.You will receieve your order in next 7 working days");
}
}