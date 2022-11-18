//Q 9 wap to print average of  given five subjects marks of student and check if average >=40 print Pass else print fail
import java.util.Scanner;
public class average {
	public static void main(String[] args) {
		int ENG,MATH,SCI,HIS,GEO;
		System.out.println("Enter your ENG subject marks");
		Scanner s= new Scanner(System.in);
		ENG=s.nextInt();
		System.out.println("Enter your MATH subject marks");
		Scanner t= new Scanner(System.in);
		MATH=t.nextInt();
		System.out.println("Enter your SCI subject marks");
		Scanner u= new Scanner(System.in);
		SCI=u.nextInt();
		System.out.println("Enter your HIS subject marks");
		Scanner v= new Scanner(System.in);
		HIS=v.nextInt();
		System.out.println("Enter your GEO subject marks");
		Scanner w= new Scanner(System.in);
		GEO=w.nextInt();
		
		double sum = ENG+MATH+SCI+HIS+GEO ;
		System.out.println("Your total marks is ="+sum);

		double avg = sum/5.0;
		System.out.println("Your average marks is ="+avg);

		if(avg>=40)
		{
			System.out.println("Congratulations you are pass ....");
		}
		else
		{
			System.out.println("Sorry!!! You are failed....");
		}
	}
	}
