package j1.a2;
/*
 *Dia 05-08-2020: continuar 12min20s.
 */
public class Programa {

	public static void main(String[] args) {
		//int:  -(2^31) => (2^31)-1
		int numeroPequeno = 32000;
		System.out.println("Limite mínimo: " + Math.pow(-2.0, 31.0));
		System.out.println("Limite máximo: " + Math.pow(2.0, 31.0));		
		
		//long: -(2^63) => (2^63)-1
		long numeroGrande = 999999999999999L;
		
		float outroPi = 3.14f;
		double pi = 3.14;
		
		long numero = 314;
		int copiaDeNumero = (int) numero;		
		System.out.println(copiaDeNumero);
		
		double grande = 10.8;
		float copia = (float) grande;
		System.out.println(copia);	
		
	}

}
