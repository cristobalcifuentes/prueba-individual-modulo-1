package electrodomesticos;

public class Television extends Electrodomestico {

	protected int resolucion;
	protected boolean tdt;
	
	protected final int resolucion_def = 20;
	protected final boolean tdt_def = false;
	
	public Television() {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion_def;
		this.tdt = tdt_def;
	}

	public Television(int precioBase, int peso) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion_def;
		this.tdt = tdt_def;
	}

	public Television( int resolucion, boolean tdt) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.tdt = tdt;
	}

	
	public int getResolucion() {
		return resolucion;
	}
	

	public boolean getTdt() {
		return tdt;
	}
	
	public static int aumentoPorResolucion(int pulgadas) {
		int aumento=0;
		if(pulgadas > 40) {
			aumento = 30;
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
	public int precioFinal(char letra, int tamanio, int resolucion, boolean tdt) {
		int precio=0;
		precio =( precioBase + aumentoPorConsumo(letra) + aumentoPorTamanio(tamanio)+
				 aumentoPorTDT(tdt))*aumentoPorResolucion(resolucion);
		return precio;
	}

	
	
	
	
	
	
	
	
	
	
	
}
