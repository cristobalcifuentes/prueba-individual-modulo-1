package electrodomesticos;

public class Lavadora extends Electrodomestico{
	
	protected int carga;
	static protected final int carga_def=5;
	
	public Lavadora() {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga =  carga_def;
	}

	public Lavadora(int precioBase, int peso) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga_def;
	}

	public Lavadora( int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}
		
	public int getCarga() {
		return carga;
	}

	public static int aumentoPorCarga(int carga) {
		int precio=0;
		if (carga > 30) {
			precio=50;
		}
		return precio;
	}
	
	@Override
	public int precioFinal(char letra, int tamanio, int carga) {
		int precio=0;
		precio = precioBase + aumentoPorConsumo(letra) + 
				aumentoPorTamanio(tamanio)+ aumentoPorCarga(carga);
		return precio;
	}

	
	
	
		
}

// set guarda , get entrega
