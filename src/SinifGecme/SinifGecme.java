package SinifGecme;

import java.util.Scanner;

import javax.swing.text.Position.Bias;

public class SinifGecme {

	public static void main(String[] args) {
		int mat, fizik, kimya, biyoloji,ingilizce;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Matematik notunuz: ");
		mat = input.nextInt();
		
		System.out.print("Fizik notunuz: ");
		fizik = input.nextInt();
		
		System.out.print("Kimya notunuz: ");
		kimya = input.nextInt();
		
		System.out.print("Biyoloji notunuz: ");
		biyoloji = input.nextInt();
		
		System.out.print("Ingilizce notunuz: ");
		ingilizce = input.nextInt();
		
		
		double avarage = (mat + fizik + kimya + biyoloji + ingilizce) / 5;
		
		if (avarage <= 55) {
			System.out.println("Sinifta kaldiniz");
		} else {
			System.out.println("sinifi gectiniz");
		}
		System.out.println("ortalamaniz: " + avarage);





	}

}
