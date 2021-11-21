package Assignment17;
import java.util.*;

public class Assignment17 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter thee 1st number");
		int a=s.nextInt();
	
		
		//1st problem
		
		
		
		if(a>0 && a<=9) {
			System.out.println("1 digit number number");
			
		}else if(a>=10 && a<=99) {
			System.out.println("2 digit number number");
			
		}else if(a>=100 && a<=999) {
			System.out.println("3 digit number number");
		}else {
			System.out.println("big   number");
		}
		
		
		//3rd problem
	
		System.out.println("Enter the year");
		int g=s.nextInt();
	
	
		if(g==1) {
			System.out.println("English, Maths, Science");
			
			
		}
		System.out.println("Enter the branch name");
		String d=s.next();
		
		if(d=="ECE") {
			if(g==2) {
				System.out.println("Mp,LST");
			
			}else if(g==3) {
				System.out.println("FLD,Micro electronics");
				
			}else {
				System.out.println("ES,  Image processing");
			}
			
			
		}	
		else if(d=="CSE") {
			
			if(g==2) {
				System.out.println("OS,java,Data str");
			
			}else if(g==3) {
				System.out.println("CO,multimedia");
				
			}else {
				System.out.println("DCN, mutimedia");
			}
			
			
		}
		else {
			if(g==2) {
				System.out.println("Drawing,MN");
			
			}else if(g==3) {
				System.out.println("ICE,MV");
				
			}else {
				System.out.println("PT,Tremal engg");
			}
			
			
		}

}
