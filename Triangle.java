package patika;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the digit number : ");
		int n = input.nextInt();
	    
		for ( int i = 0 ; i <= 6;  i ++ ) { 
		
		  for ( int k = 1 ; k <= (n - i); k++  ) {
		 System.out.print(" ");
	}
		for ( int j = 1 ;  j <= (2*i +1) ; j++ ) {
			System.out.print("*");
		
		}
		System.out.println(" ");  
		  
		}
		  for (int i = n - 1; i >= 1 ; i--) {
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= 2*i  ; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }}
               
	
	}
	

