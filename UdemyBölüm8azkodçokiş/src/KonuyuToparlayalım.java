import javax.crypto.interfaces.DHPublicKey;

public class KonuyuToparlayalım {

	public static void main(String[] args) {
		Canlı canlı= new Canlı();
		canlı.adınısöyle();
		
		
		Canlı kartal1= new kartal();
		kartal1.adınısöyle();
		((kartal)kartal1).uç();
		
		Canlı panda1= new panda();
		panda1.adınısöyle();
		((panda)panda1).oyna();
		
		System.out.println("--------------");
		
	
        
	}

}

class Canlı{
	
	public void adınısöyle() {
		System.out.println("ben bir canlı sınıfı nesnesiyim");
	}
}

class kartal extends Canlı{
	
	public void adınısöyle() {
		System.out.println("ben bir kartal sınıfı nesnesiyim");
	}
	
	public void uç() {
		System.out.println("ben uçabilirim");
	}
}

class panda extends Canlı{
	
	@Override
	public void adınısöyle() {
		System.out.println("ben bir panda sınıf nesnesiyim");
	}
	
	public void oyna() {
		System.out.println("ben oyun oynamayı severim");
	}
}
