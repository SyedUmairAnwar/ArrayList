import java.util.*;
public class Mock {
	 static ArrayList<Integer> evenar = new ArrayList<Integer>(); 
	 static ArrayList<Integer> oddar = new ArrayList<Integer>(); 
	 static ArrayList<Integer> primear = new ArrayList<Integer>(); 
	public static void main(String[] args) {
		Mock m1=new Mock();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number you want to comtinew");
		int num=sc.nextInt();
		for (int i=1;i<=num;i++) {
			m1.prime(i);
		 if(i%2==0) {
			 m1.even(i);
		 }
		 else m1.odd(i);
	}
		System.out.println("the even numbers are" + evenar);
		System.out.println("the odd numbers are" + oddar);
		System.out.println("the prime numbers are" + primear);
		sc.close();
	}	
	public void even(int i) {
		evenar.add(i);
	}
	public void odd(int i) {
		oddar.add(i);
	}
	public void prime(int i)
	{
		int count=0;
		for(int j=1;j<i;j++) {
			if(i%j==0) {
				count++;
			}
		}
		if (count==1&&i!=1) {
			primear.add(i);
			count=0;
		}
	}
}
