package test;
public class Asiento {
	String color;
	int precio;
	static int registro;
	public void cambiarColor(String color) {
		if (color=="amarillo"|| color=="rojo"|| color=="verde"|| color=="negro"|| color=="blanco") {
			this.color=color;
		}
	}
}