package bukodyazilmadanogrenilmez;

import java.util.Scanner;

public class fordonguusalma {

	public static void main(String[] args) {
		int n,k;
		int total =1;
		Scanner scan = new Scanner(System.in);
		System.out.print("ussu alinacak sayiyi giriniz: ");
		n = scan.nextInt();
		System.out.print("us olacak sayiyi giriniz: ");
		k = scan.nextInt();
		
		for(int i=1; i<=k; i++) {
			total*=n;
		}
		
		System.out.println("sonuc = " + total);

	}

}
