
public class KalıtımsızÖrnek {

	public static void main(String[] args) {
		personel mudur= new personel("ahmet", 123456, -8);
		//System.out.println(mudur.getYaş());
		//System.out.println(mudur);
		öğrenci emre= new öğrenci("emre", 12, 23758, 6500);
		System.out.println(emre);
	}

}

class personel{
	private String isim;
	private long tckimlik;
	private int yaş;
	
	public personel() {
		isim="henüz atanmadı";
		tckimlik=0;
		yaş=18;
	}
	
	public personel(String isim, long tckimlik, int yaş) {
		
		this.isim = isim;
		this.tckimlik = tckimlik;
	    setYaş(yaş);
	}

	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public long getTckimlik() {
		return tckimlik;
	}
	public void setTckimlik(long tckimlik) {
		this.tckimlik = tckimlik;
	}
	public int getYaş() {
		return yaş;
	}
	public void setYaş(int yaş) {
		if(yaş>=18)
		this.yaş = yaş;
		else 
			this.yaş=18;	
	}
	@Override
	public String toString() {
		return isim+" "+tckimlik+" "+yaş;
	}
	
	
}

class öğrenci{
	private String isim;
	private int yaş;
	private long tckimlikno;
	private int okulno;
	
	public öğrenci() {
		isim="henüz atanmadı";
		tckimlikno=0;
		yaş=18;
		okulno=5000;
	}
	public öğrenci(String isim, int yaş, long tckimlikno, int okulno) {
		this.isim = isim;
	    setYaş(yaş);
		this.tckimlikno = tckimlikno;
		this.okulno = okulno;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getYaş() {
		return yaş;
	}
	public void setYaş(int yaş) {
		if(yaş>=7)
		this.yaş = yaş;
		else this.yaş=7;
	}
	public long getTckimlikno() {
		return tckimlikno;
	}
	public void setTckimlikno(long tckimlikno) {
		this.tckimlikno = tckimlikno;
	}
	public int getOkulno() {
		return okulno;
	}
	public void setOkulno(int okulno) {
		this.okulno = okulno;
	}
	@Override
	public String toString() {
		return "öğrenci ismi "+ isim+" TC kimlik no "+tckimlikno+" öğrencinin yaşı "+yaş+" öğrencinin okul no "+ okulno;
	}
	
	
}
