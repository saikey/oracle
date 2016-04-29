import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Shopping_cart {
	public static void main(String[] args)throws Exception {
		int i=0,x,op,sum=0,m=0;
		String con="";
		int a[]=new int[10];
		int n[]=new int[10];
		String s[]={"USPA SLIM-FIT(RS.2000)","AXE PERFUME(RS.200)",
		"SHIRT-ARROW(RS.1000)","BELT-LEATHER(RS.300)","SHOE-PUMA(RS.1500)"};
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		do
		{
			System.out.println("Select items from the list:\n");
			System.out.println("1.USPA SLIM-FIT\tRS.2000\n");
			System.out.println("2.AXE PERFUME\tRS.200");
			System.out.println("3.SHIRT-ARROW\tRS.1000");
			System.out.println("4.BELT-LEATHER\tRS.300");
			System.out.println("5.SHOE-PUMA\tRS.1500");
			System.out.println("\nselect the item number:");
			x=Integer.parseInt(br.readLine());
		if(x<1||x>5)continue;
		a[i]=x;
		System.out.println("enter quantity:");
		n[i]=Integer.parseInt(br.readLine());
		i++;

		System.out.println("Add more Items?(y,n):");

		con=br.readLine();


		} while(con.equals("y"
				+ ""));

		m=i; // number of items


		System.out.println("\n 1. Check out \n 2. Cancel the order \n");

		System.out.println("Enter option:");

		op=Integer.parseInt(br.readLine());


		if(op==1)

		{

		System.out.println("==========================================");

		System.out.println("\nItem\tQuantity");

		System.out.println("==========================================");


		for(i=0;i<=5;i++)
		{

		if(a[i]==1)

		sum=sum+n[i]*2000;

		else if(a[i]==2)

		sum=sum+n[i]*200;

		else if(a[i]==3)

		sum=sum+n[i]*1000;

		else if(a[i]==4)

		sum=sum+n[i]*300;
		
		else if(a[i]==5)

		sum=sum+n[i]*1500;



		System.out.println("\n"+s[a[i]]+"\t"+n[i]);

		}

		System.out.println("==========================================");

		System.out.println("\nTotal Bill:"+sum);

		System.out.println("==========================================");

		}
		
		}
		}
