package methods;

public class Main {

	public static void main(String[] args) {
		SayiBulmaca();
	}

	public static void SayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 9, 0 };
		int aranacak = 1;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			mesajVer(aranacak);
		} else {
			System.out.println("Sayý mevcut deðildir: " + aranacak);
		}

	}

	public static void mesajVer(int aranacak) {
		System.out.println("Sayý mevcuttur: " + aranacak);

	}

}
