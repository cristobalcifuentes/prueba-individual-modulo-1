package electrodomesticos;

public class principal {

	public static void main(String[] args) {
		
		Electrodomestico elec = new Electrodomestico();
		System.out.println(elec);
		Electrodomestico ele = new Electrodomestico(6000,"NEGRO",'a',0);
		System.out.println(ele);
		System.out.println(elec.getConsumoEnergetico());
		System.out.println(ele.precioFinal(ele.getConsumoEnergetico(),ele.getPeso()));
		
		

	}

}
