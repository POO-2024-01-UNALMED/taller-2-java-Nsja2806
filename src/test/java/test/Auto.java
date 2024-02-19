package test;
public class Auto{
 String modelo;
 int precio;
 Asiento[] asientos;
 String marca;
 static int registro;
 int cantidadCreados;
 
 int cantidadAsientos(){
	 return asientos.length;
 }
 String verificarIntegridad(){
	if ((Asiento.registro==Auto.registro)&&(Motor.registro==Asiento.registro)){
		return "Auto original";
	}else{
		return "Las piezas no son originales";
	}
 }
}