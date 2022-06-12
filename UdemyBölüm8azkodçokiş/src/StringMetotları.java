
public class StringMetotları {

	public static void main(String[] args) {
		String isim= "emre";
		String isim1= "muhammed sefa AKYÜZ";
		System.out.println(isim.length());
		System.out.println(isim.charAt(0));
		System.out.println(isim.concat(" altunbilek"));
		System.out.println(isim.toUpperCase());//bütün harfleri büyük harfe çevirir
		System.out.println(isim.toLowerCase());//bütün harfleri küçük harfe çevirir
		
		String ay = "Mart";
		String ay2= "mart";
		
		System.out.println(ay.equals(ay2));
		System.out.println(ay.equalsIgnoreCase(ay2));
		System.out.println(ay.compareTo(ay2));//bu eğer parantez dışındaki alfabetik sıraya göre önce gelirse 1 döndürecek eğer iki string eşit olursa 
		//0 döndürecek alfabetik sıraya göre sonraan gelirse -1 döndürecek.
		
		System.out.println(ay.startsWith("M"));//hangi harle başlıyorsa ona göre true veya false değerini döndürür
		System.out.println(ay.endsWith("t"));
		
		System.out.println(ay.contains("a"));
		
		System.out.println(ay.substring(0,2 ));
		
		System.out.println(ay.indexOf("a"));//ay stiringindeki a kelimsei kaçıncı sıradaysa onun sırasını veriyor ama sıfırdan başlayayrak
		//mesela biz burda a yı girdik birinci indexte olduğu için bir çıktısını verdi
		
		System.out.println(isim1.lastIndexOf("a"));//bu kelimedeki harfin en son nerde kullanıldığını söylüyor mesela a girdiğimizde 12 dedi
		
		
		
	}

}
