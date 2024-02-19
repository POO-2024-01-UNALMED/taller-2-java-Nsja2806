package test;
public class Auto{
 String modelo;
 int precio;
 Asiento[] asientos;
 String marca;
 int registro;
 Motor motor;
 static int cantidadCreados;
 
 int cantidadAsientos(){
	int a=0;
	for (Asiento x:asientos){
		if(x!=null){
			a++;
		}
	}
	 return a;
 }
 String verificarIntegridad(){
	if (motor.registro!=registro){
		return "Las piezas no son originales";
	}
	for (Asiento x:asientos){
		if(x!=null){
			if (x.registro!=registro){
			return "Las piezas no son originales";
			}
	}
	}
	return "Auto Original";
}
}