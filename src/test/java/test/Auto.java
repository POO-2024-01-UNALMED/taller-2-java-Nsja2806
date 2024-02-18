package test;
public class Auto {
 public String modelo;
 public int precio;
 public Asiento[] asientos;
 public String marca;
 public static int registro;
 static int cantidadCreados;
 
 public int cantidadAsientos() {
	 return asientos.length;
 }
 public String verificarRegistro() {
	 String x="Las piezas no son originales";
	 if (Auto.registro==Asiento.registro && Asiento.registro==Motor.registro){
		 x="Auto original";
	 }
	return x;
	}
}
