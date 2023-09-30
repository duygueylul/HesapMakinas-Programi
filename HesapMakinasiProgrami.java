package proje_4;


import java.util.Scanner;
public class HesapMakinasiProgrami {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int s1, s2, secim;
	System.out.println("Birinci sayıyı giriniz: ");
	s1 = scan.nextInt();
	System.out.println("İkinci sayıyı giriniz: ");
	s2 = scan.nextInt();
	
	System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
	System.out.println("1- Toplama\n 2-Çıkarma\n 3-Çarpma\n 4-Bölme\n");
	System.out.println("Seçiminiz: ");
	secim = scan.nextInt();
	
	
	if(secim == 1) {
		System.out.println("Toplama: " + (s1 + s2));	
	}
	else if(secim == 2){
		System.out.println("Çıkarma: " + (s1 - s2));
	}
	else if(secim == 3){
		System.out.println("Çarpma: " + (s1 * s2));
	}
	else if(secim == 4) {
		if(s2 == 0) {
			System.out.println("İkinci sayı 0'a eşittir ve sonuç belirsizdir. ");
		}
		else {
			System.out.println("Bölme: " + (s1 / s2));
		}
		
	}
	else {
		System.out.println("Geçersiz bir işlem girdiniz tekrar deneyiniz!!!");
	}
	}

}
