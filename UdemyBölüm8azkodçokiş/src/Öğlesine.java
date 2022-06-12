
public class Öğlesine {

	public static void main(String[] args) {
		
		ülke d1= new ülke(1, 1, "turkey");
		
		
		skin a1= new skin(2, 2, "siyah", d1);
		System.out.println(a1);
		
	}

}

class insan{
	private int ayaksayısı;
	private int kolsayısı;
	
	public insan(int ayaksayısı, int kolsayısı) {
		this.ayaksayısı=ayaksayısı;
		this.kolsayısı=kolsayısı;
	}

	public int getAyaksayısı() {
		return ayaksayısı;
	}

	public void setAyaksayısı(int ayaksayısı) {
		this.ayaksayısı = ayaksayısı;
	}

	public int getKolsayısı() {
		return kolsayısı;
	}

	public void setKolsayısı(int kolsayısı) {
		this.kolsayısı = kolsayısı;
	}
	
	
}

  class ülke extends insan{
       private String aitolduğuırk;
       
       
	public String getAitolduğuırk() {
		return aitolduğuırk;
	}


	public void setAitolduğuırk(String aitolduğuırk) {
		this.aitolduğuırk = aitolduğuırk;
	}


	public ülke(int ayaksayısı, int kolsayısı, String aitolduğuırk) {
		super(ayaksayısı, kolsayısı);
		setAyaksayısı(ayaksayısı);
		setKolsayısı(kolsayısı);
		this.aitolduğuırk=aitolduğuırk;
	}
	  
  }
  class skin extends insan{
     private String tenrengi;
     private ülke k;
     
	public skin(int ayaksayısı, int kolsayısı, String tenrengi, ülke k) {
		super(ayaksayısı, kolsayısı);
		setAyaksayısı(ayaksayısı);
		setKolsayısı(kolsayısı);
		this.tenrengi=tenrengi;
		this.k=k;
	}
	public String getTenrengi() {
		return tenrengi;
	}
	public void setTenrengi(String tenrengi) {
		this.tenrengi = tenrengi;
	}
	@Override
	public String toString() {
		return "ayak sayısı:"+ getAyaksayısı()+" kol sayısı:"+ getKolsayısı()+" ait olduğu ırk:"+k.getAitolduğuırk()+" ten rengi:"+getTenrengi();
	}
	  
  }
