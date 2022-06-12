
public class BindingTürleri {

	public static void main(String[] args) {
		/*üstsııf.adınısöyle();
		altsınıf.adınısöyle();
		
		üstsııf a1= new altsınıf();
		a1.adınısöyle1();*/
		
	}

}

class üstsııf{
	public static void adınısöyle() {
		System.out.println("üst sınıfın adını söyle metodu çağrıldı");
	}
	public void adınısöyle1() {
		System.out.println("üst sınıfın adını söyle metodu çağrıldı");
	}
	
}

class altsınıf extends üstsııf{
	public static void adınısöyle() {
		System.out.println("alt sınıfın adını söyle metodu çağrıldı");
	}
	@Override
	public void adınısöyle1() {
		//super.adınısöyle1();
		System.out.println("alt sınıfın adını söyle metodu çağrıldı");
	}
	
}