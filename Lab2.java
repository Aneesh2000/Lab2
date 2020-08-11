import java.util.*;
import java.lang.*;
Class Lab2{
	public static void float divide(int a,int b){
		System.out.println("Division is" + (a/b));
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st value");
		int x = sc.nextInt();
		System.out.println("enter 2nd value");
		int y = sc.nextInt();
		divide(x,y);

		Addition addition = new Addition();
		addition.add(x,y);
		
		Multiply multi = new Multiply();
		multi.mul(x,y);

		Substraction sub = new Substraction();
		sub.sub(x,y);

		
	}
}