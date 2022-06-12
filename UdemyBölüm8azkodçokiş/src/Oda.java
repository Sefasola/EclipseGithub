import java.security.KeyStore.PrivateKeyEntry;

public class Oda {

	public static void main(String[] args) {
		
		oda1 b1= new oda1(1);
		
	}

}

class çalışmaodası1{
	private String yatak1="sefa";
	private String yatak2="abdurrakip";
	private int kitapsefa=12;
	private int kitapabdurakip=10;
	
	public çalışmaodası1() {
		yatak1="sefa";
		yatak2="abdurakip";
		kitapabdurakip=10;
		kitapsefa=12;
		System.out.println(yatak1+" nın yatağı "+ "ve "+ kitapsefa+ " sahiptir");
		System.out.println(yatak2+" nın yatağı "+ "ve "+ kitapabdurakip+ " sahiptir");
		
	}
}

class çalışmaodası2{
	private String yatak1;
	private String yatak2;
	private int kitapkayra;
	private int kitapemre;
	
	public çalışmaodası2() {
		yatak1="kayra";
		yatak2="emre";
		kitapkayra=15;
		kitapemre=11;
		System.out.println(yatak1+" nın yatağı "+ "ve "+ kitapkayra+ " sahiptir");
		System.out.println(yatak1+" nın yatağı "+ "ve "+ kitapemre+ " sahiptir");
		
	}
}

class oda1 {
	private çalışmaodası1 d1;
	private çalışmaodası2 d2;
	int mutfaksayısı;
   public oda1(int mutfaksayısı) {
	   d1= new çalışmaodası1();
	   d2= new çalışmaodası2();
	   this.mutfaksayısı=mutfaksayısı;
   }
   
   public void info() {
	   System.out.println("evin sahip olduğu mutfak sayısı "+this.mutfaksayısı);
   }
}
