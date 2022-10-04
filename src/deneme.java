
public class deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char karakter = 'A'; // Tek harf tanımlanır

		boolean dogruMu = true; // doğru yanlış tanımlanır

		// en büyük sayı hangisi

		int sayi1 = 24;
		int sayi2 = 22;
		int sayi3 = 19;

		if (sayi1 > sayi2 && sayi1 > sayi3) {
			System.out.println(sayi1);
		} else if (sayi2 > sayi1 && sayi1 > sayi3) {
			System.out.println(sayi2);
		} else {
			System.out.println(sayi3);
		}

		// switch ile not puanlama

		char grade1 = 'A';

		switch (grade1) {
		case 'A': // case = durum
			System.out.println("mükemmel : geçtiniz");
			break;
		case 'B':
			System.out.println("iyi : geçtiniz");
			break;
		case 'C':
			System.out.println("fena değil : geçtiniz");
			break;
		case 'F':
			System.out.println("kaldınız");
			break;
		default:
			System.out.println("yanlış not girdiniz");
		}

		// if ile not puanlama
		char grade2 = 'A';
		// && = and || = or
		if (grade2 == 'A') {
			System.out.println("mükemmel : geçtiniz");

		} else if (grade2 == 'B' || grade2 == 'C') {
			System.out.println("iyi : geçtiniz");
		} else if (grade2 == 'F') {
			System.out.println("Kaldınız");
		} else {
			System.out.println("yanlış not girdiniz");
		}

		// for döngüsü

		for (int i = 1; i < 10; i++) { // i+=2 yazarsak ikişer ikişer artar
			System.out.println(i);
		}
		// while döngüsü
		int i = 2;
		while (i < 10) {
			System.out.println(i);
			i += 3;
		}
		// for döngüsüne örnek
		String[] ogrenciler = { "Ahmet", "Veli", "Ayşe" };

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
		System.out.println("--------");

		// Stringleri öğreniyoruz

		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		System.out.println("Eleman sayısı: " + mesaj.length());
		System.out.println("5. eleman: " + mesaj.charAt(4));
		System.out.println(mesaj.concat("Yaşasın!")); // concat = birleştirmek
		System.out.println(mesaj.startsWith("B")); // boolean koddur
		System.out.println(mesaj.endsWith("k")); // boolean koddur

		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0); // 5. karakter dahil değil (0dan başlar yazmaya) - sondaki 0 arraye 0dan
												// yazmaya başlaması için
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("n"));
		System.out.println(mesaj.lastIndexOf("o"));
		System.out.println("------------------");

		System.out.println(mesaj.replace(' ', '-')); // replace = değiştirmek
		System.out.println(mesaj.substring(8));
		System.out.println(mesaj.substring(2, 4));
		System.out.println("-----------");
		for (String kelime : mesaj.split(" ")) { // split = ayırmak
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase()); // tüm harfleri küçültür
		System.out.println(mesaj.toUpperCase()); // tüm harfleri büyültür
		System.out.println(mesaj.trim()); // başta ve sonda boşluk varsa kaldırır

		// Sayı asal mı??
		int number = 129;
		boolean isPrime = true;

		if (number == 1) {
			System.out.println("Sayı asal değildir");
			return; // return if çalıştıktan sonra aşağısını çalıştırmaz
		}
		if (number < 1) {
			System.out.println("Geçersiz sayı");
			return;
		}
		for (int j = 2; j < number; j++) {
			if (number % j == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("Sayı asaldır");
		} else {
			System.out.println("Sayı asal değildir");
		}
		// Harf kalın ünlü mü ince ünlü mü
		char harf = 'P';
		switch (harf) {
		case 'E':
		case 'Ü':
		case 'İ':
		case 'Ö':
			System.out.println("Harf ince ünlüdür");
			break;
		case 'A':
		case 'U':
		case 'I':
		case 'O':
			System.out.println("Harf kalın ünlüdür");
			break;
		default:
			System.out.println("Harf ünlü değildir");
		}
		// Sayı mükemmel sayı mı

		int number2 = 29;
		int bolenler = 0;

		for (int k = 1; k < number2; k++) {
			if (number2 % k == 0) {
				bolenler = bolenler + k;
			}
		}
		if (bolenler == number2) {
			System.out.println("Sayı mükemmel sayıdır");
		} else {
			System.out.println("Sayı mükemmel sayı değildir");
		}
		// arkadaş sayılar
		int number3 = 220;
		int number4 = 284;
		int total1 = 0;
		int total2 = 0;
		for (int t = 1; t < number3; t++) {
			if (number3 % t == 0) {
				total1 = total1 + t;
			}
		}
		for (int n = 1; n < number4; n++) {
			if (number4 % n == 0) {
				total2 = total2 + n;
			}
		}
		if (total1 == number4 && total2 == number3) {
			System.out.println("sayılar arkadaştır");
		} else {
			System.out.println("sayılar arkadaş değildir");
		}

	}
}
