
public class PolymorphismKavramı {
	public static void main(String[] args) {
		hayvan h1= new hayvan();
	    köpek kopek1= new köpek("golden");
	    kedi kedi1= new kedi("van kedisi");
	    adınıısöyle(h1);
	    adınıısöyle(kedi1);
	    adınıısöyle(kopek1);
	}
	
	public static void adınıısöyle(hayvan  hayvan) {
		hayvan.adınıısöyle();
	}
	

}

class hayvan{
	private int ayaksayısı;

	public int getAyaksayısı() {
		return ayaksayısı;
	}

	public void setAyaksayısı(int ayaksayısı) {
		this.ayaksayısı = ayaksayısı;
	}
    public void adınıısöyle() {
    	System.out.println("ben hayvan sınıfı nesnesiyim");
    }
    
}

class köpek extends hayvan{
	private String tür;
	
	public köpek(String tür) {
		setAyaksayısı(4);
		setTür(tür);
		
	}

	public String getTür() {
		return tür;
	}

	public void setTür(String tür) {
		this.tür = tür;
	}
	
	@Override
	public void adınıısöyle() {
		System.out.println("ben köpek sınıfı nesnesiyim");
	}
	
}

class kedi extends hayvan{
	private String cinsi;

	public kedi(String cinsi) {
		setAyaksayısı(4);
		setCinsi(cinsi);
		
	}
	public String getCinsi() {
		return cinsi;
	}

	public void setCinsi(String cinsi) {
		this.cinsi = cinsi;
	}
	
	@Override
	public void adınıısöyle() {
		System.out.println("ben bir kedi nesnesiyim");
	}
	
}