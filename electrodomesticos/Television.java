package electrodomesticos;

public class Television extends Electrodomestico {

	protected int resolucion;
	protected boolean tdt;
	
	protected final int resolucion_def = 20;
	protected final boolean tdt_def = false;
	
	public Television() {
		precioBase = precioBase_def ;
		color= color_def;
		consumoEnergetico = consumoEnergetico_def ;
		peso = peso_def;
		resolucion = resolucion_def;
		tdt = tdt_def;
	}

	public Television(int precioBase, int peso) {
		this.precioBase = precioBase ; 
		color = color_def;
		consumoEnergetico=consumoEnergetico_def;
		this.peso = peso;
		resolucion = resolucion_def;
		tdt = tdt_def;
	}

	public Television( int resolucion, boolean tdt) {
		precioBase = precioBase_def;
		color = color_def;
		consumoEnergetico = consumoEnergetico_def;
		peso = peso_def;
		this.resolucion = resolucion;
		this.tdt = tdt;
	}

	
	public int getResolucion() {
		return resolucion;
	}
	

	public boolean getTdt() {
		return tdt;
	}
	
	public static double aumentoPorResolucion(int pulgadas) {
		double aumento=0;
		if(pulgadas > 40) {
			aumento = 1.30;
		}else {
			aumento=1;
		}
		return aumento;
	}
	
	public static int aumentoPorTDT(boolean tdt) {
		int aumento =0;
		if (tdt) {
			aumento=50;
		}
		return aumento;
	}
	
	@Override
	public double precioFinal(char letraConsummo, int tamanio, int resolucion, boolean tdt) {
		double precio=0;
		precio =( precioBase + aumentoPorConsumo(letraConsummo) + aumentoPorTamanio(tamanio)+
				 aumentoPorTDT(tdt))*aumentoPorResolucion(resolucion);
		return precio;
	}

	
	@Override
	public String toString() {
		return "Television (resolucion=" + resolucion + ", tdt=" + tdt + ", precioBase=" + precioBase + ", color="
				+ color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + ")";
	}

	
		
	
}
