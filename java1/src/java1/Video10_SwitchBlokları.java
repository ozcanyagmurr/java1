package java1;

public class Video10_SwitchBlokları {

	public static void main(String[] args) {
		char grade ='F';
		
		switch(grade) {
		case 'A':
			System.out.println("Mükemmel: Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok güzel: Geçtiniz");
			break;
		case 'C':
			System.out.println("Fena değil: Geçtiniz");
			break;
		case 'D':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'F':
			System.out.println("Malesef : Kaldınız");
		    break;	
		default : System.out.println("Geçersiz harf girdiniz");
		}
		
		
		}
		
		

}
