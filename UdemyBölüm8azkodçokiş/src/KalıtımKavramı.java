

public class KalıtımKavramı {

	public static void main(String[] args) {
		Diktorgen d1= new Diktorgen(10, 20);
		d1.özellikyazdır();
		
		Geometrikşekil d2= new Geometrikşekil(5, 10);
		System.out.println(d2);
		
	}

}

class Geometrikşekil{
	
	private int en;
	private int boy;
	
	public Geometrikşekil(int en, int boy) {
		this.boy=boy;
		this.en=en;
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
		System.out.println("alan "+ getBoy()*getEn());
	}
	
	public void cevrehesapla() {
		System.out.println("cevre: "+ ((getBoy()+getEn())*2));
	}	
	@Override
	public String toString() {
		return "en: "+en+" boy: "+boy;
	}
	
}

  class Diktorgen extends Geometrikşekil{

	public Diktorgen(int en, int boy) {
		super(en, boy);
		setBoy(boy);
		setEn(en);
	}
	
	public void özellikyazdır() {
		System.out.println("geometrik şeklin eni "+ getEn()+" geometrik şeklin boyu "+ getBoy() );
		alanhesapla();
		cevrehesapla();
	}
	  
  }

