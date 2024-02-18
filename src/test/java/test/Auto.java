package test;
public class Auto{
 String modelo;
 int precio;
 Asiento[] asientos;
 String marca;
 int registro;
 int cantidadCreados;
 
 int cantidadAsientos(){
	 return asientos.length;
 }
 String verificarRegistro(){
	 String x="Las piezas no son originales";
	 if (Auto.registro==Asiento.registro) && (Asiento.registro==Motor.registro){
		 x="Auto original";
	 }
	return x;
	}
}
