
public class Kalıtım {

	public static void main(String[] args) {
		/*
		Diktörgen d1= new Diktörgen(10, 20);
		d1.özellikyazdır();
		System.out.println(d1);
		
		GeometrikŞekil d2= new GeometrikŞekil(20,30);
		System.out.println(d2);
		*/
		kare k1= new kare(4);
		k1.alanhesapla();
		k1.cevrehesapla();
		
	}

}

class GeometrikŞekil{
	private int en;
	private int boy;
	
	public GeometrikŞekil(int en, int boy) {
		this.boy=boy;
		this.en=en;
		System.out.println("geometrik şekil oluşturuluyor");
		
	}
	public GeometrikŞekil(){
		System.out.println("geometrik şekil oluşturuluyor");
	}

	public int getEn() {
		return en;
	}

	public void setEn(int en) {
		this.en = en;
	}

	public int getBoy() {
		return boy;
	}

	public void setBoy(int boy) {
		this.boy = boy;
	}
	
	public void alanhesapla() {
		System.out.println("alan: "+ getBoy()*getEn());
	}
	
	public void cevrehesapla() {
		System.out.println("çevre: "+ (getBoy()+getEn())*2);
	}
	@Override
	public String toString() {
		return "en: " +en+ " boy: "+ boy;
		
	}
}

class Diktörgen extends GeometrikŞekil{
	
	public Diktörgen(int en, int boy) {
		setBoy(boy);
		setEn(en);
		System.out.println("diktörgen oluşturuluyor");
	}
	
	public Diktörgen(int en) {
		setEn(en);
		System.out.println("diktörgen oluşturuluyor");
	}
	
	public void özellikyazdır() {
		System.out.println("en "+ getEn() + " boy "+ getBoy());
		alanhesapla();
		cevrehesapla();
	}
	
}

class kare extends Diktörgen{

	public kare(int en) {
		super(en);
		setBoy(en);
		System.out.println("kare oluşturuluyor");
	}

	
	
}
