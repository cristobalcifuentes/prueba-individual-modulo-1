package electrodomesticos;

public class principal {

	public static void main(String[] args) {
		
		Electrodomestico a = new Electrodomestico ();
		System.out.println(a);
		System.out.println(a.precioFinal(a.getConsumoEnergetico(), a.getTamanio()));
		
		Electrodomestico b = new Electrodomestico (60000, 81);
		System.out.println(b);
		System.out.println(b.precioFinal(b.getConsumoEnergetico(), b.getTamanio()));
		
		Electrodomestico c = new Electrodomestico (40000, "negro", 'b', 70);
		System.out.println(c);
		System.out.println(c.precioFinal(c.getConsumoEnergetico(), c.getTamanio()));
		
		//System.out.println(a);
		//System.out.println(a.precioFinal(a.getConsumoEnergetico(), a.getTamanio()));
		
		Lavadora d = new Lavadora ();
		System.out.println(d);
		System.out.println(d.precioFinal(d.getConsumoEnergetico(), d.getTamanio(), d.getCarga()));
		
		Lavadora e = new Lavadora (50000,50);
		System.out.println(e);
		System.out.println(e.precioFinal(e.getConsumoEnergetico(), e.getTamanio(), e.getCarga()));
		
		Lavadora f = new Lavadora (50);
		System.out.println(f);
		System.out.println(f.precioFinal(f.getConsumoEnergetico(), f.getTamanio(), f.getCarga()));
		
		Television g = new Television();
		System.out.println(g);
		System.out.println(g.precioFinal(g.getConsumoEnergetico(), g.getTamanio(), g.getResolucion(), g.getTdt()));
		
		Television h = new Television(20000, 50);
		System.out.println(h);
		System.out.println(h.precioFinal(h.getConsumoEnergetico(), h.getTamanio(), h.getResolucion(), h.getTdt()));
		
		Television i = new Television(70, true);
		System.out.println(i);
		System.out.println(i.precioFinal(i.getConsumoEnergetico(), i.getTamanio(), i.getResolucion(), i.getTdt()));
		
		Television j = new Television (30 , true);
		System.out.println(j);
		System.out.println(j.precioFinal(j.getConsumoEnergetico(), j.getTamanio(), j.getResolucion(), j.getTdt()));
		

		
		

	}

}
