
public class Motor {
	
	private String isim;
	private int beygirgücü;
	
	public Motor() {
		
		isim="honda";
		beygirgücü=135;
		System.out.println(isim+" isimli ve "+ beygirgücü+" beygir güçlü motor oluşturuldu");
	}
	
	public void calıştır() {
		System.out.println("motor");
	}
	
	public void durdur() {
		System.out.println("motor durdudruldu");
	}

}

class araba {
	private Motor arabamotoru;
	private String renk;
	private String marka;
	private int üretimyılı;
	

	
	 
	public araba() {
		arabamotoru= new Motor();
		renk="kırmızı";
		marka="toyota";
		üretimyılı=2009;
		System.out.println(renk+" renkli "+ üretimyılı+ " model "+ marka+ " marka araba oluşturuldu");
	}
	
	public void hareketegec() {
		
		System.out.println("araba harekete geçiyor");
	}
	
	public void durmayabaşla() {
		System.out.println("araba durmaya başladı");
	}
}
