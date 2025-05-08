package classes;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String marca = sc.next();
		String modelo = sc.next();
		String cor = sc.next();
		int numPortas = sc.nextInt();
		
		Carro car1 = new Carro(marca,modelo,cor,numPortas);
		System.out.println(car1);
		car1.acelerar();
		car1.frear();
		
		String marcaMoto = sc.next();
		String modeloMoto = sc.next();
		String corMoto = sc.next();
		double tamCorrente = sc.nextDouble();
		
		Moto moto1 = new Moto(marcaMoto,modeloMoto,corMoto,tamCorrente);
		System.out.println(moto1);
		
		String cornova = null;
		moto1.setCor(cornova);
		System.out.println(moto1);
		sc.close();
		
	}

	

}
