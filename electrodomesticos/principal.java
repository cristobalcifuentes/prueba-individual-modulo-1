package electrodomesticos;

public class principal {

	public static void main(String[] args) {
		
		int sumaTotal =0;
		int sumaElectrodomesticos=0;
		int sumaLavadoras=0;
		int sumaTelevision=0;
				
		Electrodomestico a = new Electrodomestico ();
		System.out.println(a);
		System.out.println(a.precioFinal());
		
		Electrodomestico b = new Electrodomestico (60000, 81);
		System.out.println(b);
		System.out.println(b.precioFinal());
		
		Electrodomestico c = new Electrodomestico (40000, "negro", 'b', 70);
		System.out.println(c);
		System.out.println(c.precioFinal());
		
		Lavadora d = new Lavadora ();
		System.out.println(d);
		System.out.println(d.precioFinal());
		
		Lavadora e = new Lavadora (50000,50);
		System.out.println(e);
		System.out.println(e.precioFinal());
		
		Lavadora f = new Lavadora (50);
		System.out.println(f);
		System.out.println(f.precioFinal());
		
		Television g = new Television();
		System.out.println(g);
		System.out.println(g.precioFinal());
		
		Television h = new Television(20000, 50);
		System.out.println(h);
		System.out.println(h.precioFinal());
		
		Television i = new Television(70, true);
		System.out.println(i);
		System.out.println(i.precioFinal());
		
		Television j = new Television (30 , true);
		System.out.println(j);
		System.out.println(j.precioFinal());
		
		Electrodomestico [] electrodomesticos = new Electrodomestico[10];
		electrodomesticos[0] = new Electrodomestico ();
		electrodomesticos[1] = new Electrodomestico (60000, 81);
		electrodomesticos[2] = new Electrodomestico (40000, "negro", 'b', 70);
		electrodomesticos[3] = new Lavadora ();
		electrodomesticos[4] = new Lavadora (50000,50);
		electrodomesticos[5] = new Lavadora (50);
		electrodomesticos[6] = new Television();
		electrodomesticos[7] = new Television(20000, 50);
		electrodomesticos[8] = new Television(70, true);
		electrodomesticos[9] = new Television (30 , true);
		
		for (int l =0; l<electrodomesticos.length; l++) {
			 if (electrodomesticos[l] instanceof Lavadora) {
				sumaTotal = sumaTotal + electrodomesticos[l].precioFinal();	
				sumaLavadoras=sumaLavadoras+electrodomesticos[l].precioFinal();	
			}else if (electrodomesticos[l] instanceof Television) {
				sumaTotal = sumaTotal + electrodomesticos[l].precioFinal();  
				sumaTelevision=sumaTelevision+electrodomesticos[l].precioFinal();
			}else if (electrodomesticos[l] instanceof Electrodomestico) {
				sumaTotal = sumaTotal +electrodomesticos[l].precioFinal();
				sumaElectrodomesticos=sumaElectrodomesticos+electrodomesticos[l].precioFinal();
			}	
		}
		
			System.out.println();
			System.out.println("-------------------------");
			System.out.println("la suma total es: "+sumaTotal);
			System.out.println("la suma de los electrodomesticos es: "+sumaElectrodomesticos);
			System.out.println("la suma de de las lavadoras es: "+sumaLavadoras);
			System.out.println("la suma de los televisores es: "+sumaTelevision);
			System.out.println("--------------------------");
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		

		
		

	}

}
