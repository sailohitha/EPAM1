package EPAM2.TASK;

import java.util.Scanner;

public class Main_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of Chocolates==");
		int no_of_choc=sc.nextInt();
		System.out.println("Number of Sweet==");
		int no_of_sweet=sc.nextInt();
		int[] choc=new int[no_of_choc];
		int[] sweet=new int[no_of_sweet];
		for(int i=0;i<no_of_choc;i++)
		{
			System.out.println("Enter the weight of "+(i+1)+" chococlate");
			choc[i]=sc.nextInt();
		}
		Chocolate c1=new Chocolate();
		int chocweight=c1.total_weight(choc, no_of_choc);
		for(int i=0;i<no_of_sweet;i++)
		{
			System.out.println("Enter the weight of "+(i+1)+" sweet");
			sweet[i]=sc.nextInt();
		}
		Sweet s1=new Sweet();
		int sweetweight=c1.total_weight(sweet, no_of_sweet);
		System.out.print("Enter the lowest weight range of candy:");
		int low=sc.nextInt();
		System.out.print("Enter the highest range of the candy:");
		int high=sc.nextInt();
		int num_of_chococandy=c1.num_of_candy(low,high,choc,no_of_choc);
		int num_of_sweetcandy=s1.num_of_candy(low,high,sweet,no_of_sweet);
		int total_candy=num_of_chococandy+num_of_sweetcandy;
		if(total_candy>=1)
			System.out.print("***Congratulations you recieved "+total_candy+" candy***");
		else
			System.out.print("You recieved "+total_candy+" candy");
		
		
	}

}

