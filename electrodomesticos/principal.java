package electrodomesticos;

public class principal {

	public static void main(String[] args) {
		
		Electrodomestico elec = new Electrodomestico();
		System.out.println(elec);
		Electrodomestico ele = new Electrodomestico(60000,"NEGRO",'A',2);
		System.out.println(ele);

		

	}

}
