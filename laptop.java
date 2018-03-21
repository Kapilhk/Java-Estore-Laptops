public class laptop {
		  String s;
		  String processor,model;
		  public int stock,price,screensize,ram,hdd,gc,pro;

		laptop(int rami,String pro,int graphiccard,int harddisk,String modeli,int pricei,int screensizei,int st)
		{
		  ram=rami;
		  processor=pro;
		  gc=graphiccard;
		  hdd=harddisk;
		  model=modeli;
		  price=pricei;
		  stock=st;
		  screensize=screensizei;  
		}
		void display()
		   {
			if(stock>=1)
				s="Available";
			else 
				s="Out of Stock";
			   System.out.println("\t\t\t"+model+"\t\t"+processor+"\t\t"+ram+"\t"+hdd+"        \t"+gc+"\t     \t"+screensize+"\t\t\t"+price+"     \t"+s);
		   }
	  

	   void displaywtst()
	   {
		   System.out.println("\t\t\t"+model+"\t\t"+processor+"\t\t"+ram+"\t"+hdd+"        \t"+gc+"\t     \t"+screensize+"\t\t\t"+price+"     \t");
	   }
	   void deductstock()
	   {
		   stock--;
	   }
	   
}
