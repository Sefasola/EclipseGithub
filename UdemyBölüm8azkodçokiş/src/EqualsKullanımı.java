import java.util.Objects;

public class EqualsKullanımı {

	public static void main(String[] args) {
		
		el d1= new el(10, "ahmet");
		
		el d2= new el(10, "ahmet1");
		System.out.println(d1);
		System.out.println(d2);
		
		
		System.out.println("k1 ve k2 eşit mi :" + d1.equals(d2));
		
		/*
		 * d1=d2;
		 * 
		 * çalışan m1= new çalışan(5, "emre");
		 * 
		 * System.out.println("k1 ve m1 eşit mi :"+ d2.equals(m1));
		 */
		
		System.out.println("k1 hachcode: "+ d1.hashCode()+ " k2 hashcode: "+ d2.hashCode());
		System.out.println();
		
		String isim= new String("ayşe");
	}

}

 class el extends Object{
	
	int id;
	String isim;
	
	
	
	public el(int id, String isim) {
		super();
		this.id = id;
		this.isim = isim;
	}



	@Override
	public String toString() {
		return super.toString();
	}



	@Override
	public int hashCode() {
		return Objects.hash(id, isim);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof el)) {
			return false;
		}
		el other = (el) obj;
		return id == other.id && isim.equals(other.isim);
	}
	
	
}
 
 class çalışan {
	 int id;
	 String isim;
	public çalışan(int id, String isim) {
		super();
		this.id = id;
		this.isim = isim;
	} 
 }
