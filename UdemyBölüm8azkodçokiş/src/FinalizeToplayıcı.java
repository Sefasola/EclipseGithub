
public class FinalizeToplayıcı {

	public static void main(String[] args) {
		
		A d1= new A(13);
		A d2= new A(14);
	}

}

class A{
	
	int i;
	
	public A(int parameter) {
		this.i=parameter;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize tetiklendi");
		
	}
}
