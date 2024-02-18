package test;

public class Motor{
	int numeroCilindros;
	String tipo;
	static int registro;
	void cambiarRegistro(int registro){
		Motor.registro=registro;	
	}
	void cambiarTipo(String tipo){
		if (tipo=="electrico"){
			this.tipo=tipo;
		}else if (tipo=="gasolina"){
			this.tipo=tipo;
		}
	} 
}
