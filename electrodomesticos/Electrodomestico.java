package electrodomesticos;

public class Electrodomestico {
	protected int precioBase ;
	protected String color;
	protected char consumoEnergetico;
	protected int peso ;
	
	static protected final int precioBase_def =100000 ;
	static protected final String color_def  = "blanco";
	static protected final char consumoEnergetico_def ='F';
	static protected final int peso_def =5 ;
		
	public Electrodomestico(){
		precioBase = precioBase_def ;
		color= color_def;
		consumoEnergetico = consumoEnergetico_def ;
		peso = peso_def;
	}
	
	public Electrodomestico(int precioBase, int peso){
		color = color_def;
		consumoEnergetico=consumoEnergetico_def;
	}
		
	public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}

	public String toString() {
		return "precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso  ;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public float getPeso() {
		return peso;
	}
	
	public static char comprobarConsumoEnergetico( char consumo) {
		char [] letras = {'A', 'B', 'C', 'D', 'E', 'F','a', 'b','c','d','e','f'};
		boolean comprobar = false;
		for (int i=0; i<letras.length; i++) {
			if (consumo == letras[i]) {
				comprobar = true;
			}
		}
		if (comprobar == true ) {
			return consumo;
		}else {
			return consumoEnergetico_def;
		}
		
			
	}
	
	public static String comprobarColor(String col) {
		String [] colores = {"blanco", "negro", "rojo", "azul", "gris"};
		boolean comprobar = false;
		for (int i=0; i<colores.length; i++) {
			if (col.equalsIgnoreCase(colores[i])) {
				comprobar = true;
			}
		}
		if (comprobar == true ) {
			return col;
		}else {
			return color_def;
			}		
			
	}

	//public static int precioFinal() {}
		
	
	
	
	
	
}
