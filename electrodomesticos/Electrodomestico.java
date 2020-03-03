package electrodomesticos;

public class Electrodomestico {
	protected  int precioBase ;
	protected  String color;
	protected  char consumoEnergetico;
	protected  int peso ;
	//protected  int precioFinal;
	
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
		this.precioBase = precioBase ; 
		color = color_def;
		consumoEnergetico=consumoEnergetico_def;
		this.peso = peso;
	}
		
	public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}

	public String toString() {
		return "Electrodomestico (precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso +")" ;
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

	public int getTamanio() {
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

	public static int aumentoPorConsumo(char letra) {
		
		int aumento = 0;
		if (letra == 'A'|| letra == 'b') {
			aumento = 100;}
		if (letra == 'B'|| letra == 'b') {	
			aumento = 80;}
		if (letra == 'C'||letra == 'c') {
			aumento = 60;}
		if (letra == 'D'||letra =='d') {
			aumento=50;}
		if (letra == 'E'||letra =='e') {
			aumento=30;}
		if (letra == 'F'||letra =='f') {
			aumento=10;}
		return aumento;
	}
		
	public static int aumentoPorTamanio(int tamanio) {
		int aumento=0;
		if (tamanio >=0 && tamanio <= 19) {
			aumento =10;}
		if (tamanio >=20 && tamanio <= 49) {
			aumento =50;}
		if (tamanio >=50 && tamanio <= 79) {
			aumento =80;}
		if (tamanio >=80) {
			aumento =100;}
		return aumento;
	}
	
	public int precioFinal(char letraConsummo, int tamanio) {
		int precio=0;
		precio = precioBase + aumentoPorConsumo(letraConsummo) + aumentoPorTamanio(tamanio);
		return precio;
	}

	public double precioFinal(char letraConsummo, int tamanio, int resolucion, boolean tdt) {
		return 0;
	}

	public int precioFinal(char letraConsummo, int tamanio, int carga) {
		return 0;
	}
	
}
