package electrodomesticos;

public class Lavadora extends Electrodomestico{
	
	protected int carga;
	static protected final int carga_def=5;
	
	public Lavadora() {
		precioBase = precioBase_def ;
		color= color_def;
		consumoEnergetico = consumoEnergetico_def ;
		peso = peso_def;
		carga =  carga_def;
	}

	public Lavadora(int precioBase, int peso) {
		this.precioBase = precioBase ; 
		color = color_def;
		consumoEnergetico=consumoEnergetico_def;
		this.peso = peso;
		carga = carga_def;
	}

	public Lavadora( int carga) {
		precioBase = precioBase_def ;
		color= color_def;
		consumoEnergetico = consumoEnergetico_def ;
		peso = peso_def;
		this.carga = carga;
	}

		
	@Override
	public String toString() {
		return "Lavadora (carga=" + carga + ", precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso +")" ;
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
	
	public int precioFinal() {
		int precio=0;
		precio = precioBase + aumentoPorConsumo(consumoEnergetico) + 
				aumentoPorTamanio(peso)+ aumentoPorCarga(carga);
		return precio;
	}
		
}
