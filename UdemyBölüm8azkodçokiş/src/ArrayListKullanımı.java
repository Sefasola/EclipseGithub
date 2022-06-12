import java.util.ArrayList;

public class ArrayListKullanımı {

	

	public static void main(String[] args) {
		
		
		//Telefon[] telefonlar = new Telefon[20];
		
		ArrayList<Telefon> telefonlar = new ArrayList<>();
		Telefon tel1= new Telefon("mi8", 3000);
		Telefon tel2= new Telefon("Mate 10 pro", 4500);
		Telefon tel3= new Telefon("iphone 11" , 7000);
		Telefon tel4 = new Telefon("ECLİPSE", 9000);
		
		telefonlar.add(tel1);
		telefonlar.add(tel2);
		telefonlar.add(tel3);
		 
		
		System.out.println(telefonlar.size());//dizinizde o an kaç tane eleman olduğunu gösteriyor
		
		listeyiyazdır(telefonlar);
		
		
		/*
		 * telefonlar[0]= tel1; telefonlar[1]= tel2; telefonlar[2]= tel3;
		 * System.out.println(telefonlar[1]);
		 */	
		}





private static void listeyiyazdır(ArrayList<Telefon> telefonlar) {
	

	for(int i=0; i<telefonlar.size()-1; i++) {
		System.out.println(telefonlar.get(i));
	}
}
}

class Telefon{
	String model;
	int fiyat;
	
	public Telefon(String model, int fiyat) {
		super();
		this.model = model;
		this.fiyat = fiyat;
	}

	@Override
	public String toString() {
		return "telefon [model=" + model + ", fiyat=" + fiyat + "]";
	}
	
	
}
