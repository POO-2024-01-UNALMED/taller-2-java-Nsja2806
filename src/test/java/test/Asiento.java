package test;
public class Asiento{
	String color;
	int precio;
	static int registro;
	void cambiarColor(String color){
		if (color.equals("amarillo") || (color.equals("verde")) || (color.equals("rojo")) || (color.equals("negro")) || (color.equals("blanco"))){
			this.color=color;
	}
 }
}