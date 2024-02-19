package test;

public class Motor{
	int numeroCilindros;
	String tipo;
	static int registro;
	void cambiarRegistro(int registro){
		Motor.registro=registro;	
	}
	void cambiarTipo(String tipo){
		if (tipo.equals("electrico") || (tipo.equals("gasolina"))){
			this.tipo=tipo;
	} 
}
}