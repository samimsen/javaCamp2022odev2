package inheritanceDemo;

public class Main {
	public static void main(String[] args) {
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		AskerKrediManager askerKrediManager = new AskerKrediManager();
		KrediUI krediUI = new KrediUI();
		krediUI.krediHesapla(ogretmenKrediManager);
		krediUI.krediHesapla(askerKrediManager);
	}
}
