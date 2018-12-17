package java2;
import java.util.*;
public class Detyra_1 {

	public static void main(String[] args) 
	{
		
		
			int notaKnk, notaPoo, notaPi;
			double notaMesatare;
			Scanner input=new Scanner(System.in);
			//futja e te dhenave nga tastiera
			//c++
			//cin>>notaKnk
			System.out.println("Programi per llogaritjen e notes mesatare");
			System.out.println("=========================================");
			System.out.print("Nota ne lenden POO :");
		    notaPoo=input.nextInt();
		    System.out.print("Nota ne lenden KNK");
		    notaKnk=input.nextInt();
		    System.out.print("Nota ne lenden PI");
		    notaPi=input.nextInt();
		    notaMesatare=(notaKnk+notaPoo+notaPi)/3.0;
		    System.out.println("==========================================");
		    System.out.println("Nota Mesatare:"+notaMesatare);
		    
			input.close();

		   
		      
		}
	}


