
public class Kalıtımlıörnek2 {

	public static void main(String[] args) {
		person mudur= new person("ahmet", 3456, 12345, "mudur");
		System.out.println(mudur);
		
		öğrenci1 ayşe= new öğrenci1("ayşe", 3456, 14, 9402);
		System.out.println(ayşe);
		
		mezunöğrenci d1= new mezunöğrenci("ali", 3673, 24, 7865, "ankara");
		System.out.println(d1);
		
	}

}

class kişi{
	private String isim;
	private long tckimlik;
	private int yaş;
	
    public kişi() {
		isim="henüz atanmadı";
		tckimlik=0;
		yaş=18;
	}
	
	public kişi(String isim, long tckimlik, int yaş) {
		
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

/**
 * @author sefaakyuz
 *
 */
class person extends kişi{
	 private String pozisyon;
	 
    
	public person(String isim, long tckimlik, int yaş, String pozisyon) {
		//setIsim(isim);
		//setTckimlik(tckimlik);
		//setYaş(yaş);
		super(isim, tckimlik, yaş);
		this.pozisyon = pozisyon;
	}

	public String getPozisyon() {
		return pozisyon;
	}

	public void setPozisyon(String pozisyon) {
		this.pozisyon = pozisyon;
	}
	
	@Override
	public String toString() {
		return "isim:"+getIsim()+" TC kimlik no:"+getTckimlik()+" yaş:"+getYaş()+ " pozisyon:"+getPozisyon();
	}	 
}

class öğrenci1 extends kişi{
	
	private int öğrencino;
	
	

	public öğrenci1(String isim, long tckimlik, int yaş, int öğrencino ) {
		//setIsim(isim);
		//setTckimlik(tckimlik);
		//setYaş(yaş);
		super(isim, tckimlik, yaş);
		this.öğrencino=öğrencino;
		
	}

	public int getÖğrencino() {
		return öğrencino;
	}

	public void setÖğrencino(int öğrencino) {
		this.öğrencino = öğrencino;
	}
	
	@Override
	public String toString() {
		return "isim:"+ getIsim()+" tc kimlik:"+getTckimlik()+" yaş:"+getYaş()+" öğrenci no:"+getÖğrencino();
	}
}

class mezunöğrenci extends öğrenci1{
	private String çalışmayeri;

	public String getÇalışmayeri() {
		return çalışmayeri;
	}

	public void setÇalışmayeri(String çalışmayeri) {
		this.çalışmayeri = çalışmayeri;
	}

	public mezunöğrenci(String isim, long tckimlik, int yaş, int öğrencino, String çalışmayeri) {
		super(isim, tckimlik, yaş, öğrencino);
		this.çalışmayeri=çalışmayeri;
			}
	
	@Override
	public String toString() {
		return "isim:"+ getIsim()+" tc kimlik:"+getTckimlik()+" yaş:"+getYaş()+" öğrenci no:"+getÖğrencino()+" çalıştığı yer:"+getÇalışmayeri();
	}
	
}
