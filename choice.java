import java.util.*;
public class choice {
	public int f,hd,ram,gc,budgetmin,budgetmax;
	public String pro;
	int select(){
		Scanner sc1=new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter 1 to select by Minimum Requirements or enter 2 to select by Price-");
        String f1=sc1.next();
        if(f1.equals("1")||f1.equals("2"))
          {
        	f= Integer.parseInt(f1);
        	break;
          }
        else
        	System.out.println("Invalid Input.");
		}
        if(f==1){
	        System.out.println("Please Enter appropriate choices for your Requirements");
	        while(true){
	        System.out.println("A) Select Processor :(i7,i5 or i3) :-");
	        System.out.println("");
	        String p=sc1.next();
	        if(p.equalsIgnoreCase("i3")||p.equalsIgnoreCase("i5")||p.equalsIgnoreCase("i7"))
	        {
	        	pro=p;
	        	break;
	        }
	        else
	        	System.out.println("Invalid input..");
	        }
	        System.out.println("");
	        while(true){
	        System.out.println("B) Enter RAM required (2,4,6,8) GB :-");
	        System.out.println("");
	        int r=sc1.nextInt();
	        if(r==2||r==4||r==6||r==8)
	        {
	        	ram=r;
	        	break;
	        }
	        else
	        	System.out.println("Invalid input..");
	        }
	        System.out.println("");
	        while(true){
	        System.out.println("C) Graphics Card Required (1,2,4,6,8) GB :-");
	        System.out.println("");
	        int g=sc1.nextInt();
	        if(g==1||g==2||g==4||g==6||g==8)
	        {
	        	gc=g;
	        	break;
	        }
	        else
	        	System.out.println("Invalid input..");
	        }
	        System.out.println("");
	        while(true){
	        System.out.println("D) Select Hard disk:- (256,512,1024) GB :-");
	        System.out.println("");
	        int h=sc1.nextInt();
	        if(h==256||h==512||h==1024)
	        {
	        	hd=h;
	        	break;
	        }
	        else
	        	System.out.println("Invalid input..");
	        }
	        
	        System.out.println("");
        }
        else if(f==2)
        {
        	 System.out.println("Enter your Price range(min & max):");
        	 budgetmin=sc1.nextInt();
        	 budgetmax=sc1.nextInt();
        }
	return(f);
	}        
}
