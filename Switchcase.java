package Pro.src;
/*
 * @Author Pritam khan
 */
/*
  Write a java class to accept five string name & if the name is SAYAN it should 
  print switch case is very easy for sayan before solving this problem plz 
  remember switch case can accept interger & char value

 */
import java.util.Scanner;

public class Switchcase {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print ("Enter the name:");
		String name=sc.nextLine();
		sc.close(); 
		
		switch(name){
		case "sayan":System.out.println("switch case is easy for sayan"); 
		break;
		case "pritam":System.out.println("switch case is easy for pritam"); 
		break;
		case "arnab":System.out.println("switch case is easy for arnab");
		break;
		case "sourav":System.out.println("switch case is for sourav");
		break;
		case "raj":System.out.println("switch case is easy for raj");
		break;
		default:System.out.println("name not match");
		}
	}
}

