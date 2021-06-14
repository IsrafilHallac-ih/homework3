package homework3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int math,physics, chemistry, turkish, history, music;
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Math Note : ");
		math=inp.nextInt();
		
		System.out.println("Physics Note : ");
		physics=inp.nextInt();
		
		System.out.println("Chemistry Note : ");
		chemistry=inp.nextInt();
		
		System.out.println("Turkish Note : ");
		turkish=inp.nextInt();
		
		System.out.println("History Note : ");
		history=inp.nextInt();
		
		System.out.println("Music Note : ");
		music=inp.nextInt();
		
		int total=(math+physics+chemistry+turkish+history+music);
				double result=total/6;
				System.out.println("Ortalamanýz :" +result);
				
			String	passinggrade=result>=60 ?  "Geçti":"Kaldý"; 
				System.out.println("Geçme Durumunuz :" + passinggrade);
		

	}

}
