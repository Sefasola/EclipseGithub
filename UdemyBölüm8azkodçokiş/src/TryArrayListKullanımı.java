import java.util.ArrayList;

public class TryArrayListKullanımı {

	public static void main(String[] args) {
		ArrayList<PC> array= new ArrayList<>();
		PC pc1= new PC(1000, "CASPER");
		PC pc2= new PC(2000, "samsung");
		PC pc3= new PC(3000, "apple");
		array.add(pc1);
		array.add(pc2);
		array.add(pc3);		
		info(array);
		
	}
	
	public static void info(ArrayList<PC> array) {
		for(int i=0; i<array.size(); i++) {
			System.out.println(array.get(i));
		}
	}

}

class PC{
	
	int price;
	String model;
	
	
	public PC(int price, String model) {
		super();
		this.price = price;
		this.model = model;
	}


	@Override
	public String toString() {
		return "PC [price=" + price + ", model=" + model + "]";
	}
	
}
