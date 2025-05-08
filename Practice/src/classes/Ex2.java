package classes;
import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int vetor [];
		vetor = new int [n];
		for(int i = 0;i<n;i++) {
			vetor[i] = sc.nextInt();
		}
		int maior = vetor[0];
		int pos = 0;
		for(int i = 0;i<vetor.length;i++) {
			if(maior < vetor[i]) {
				maior = vetor[i];
				pos = i;
			}
			
		}
		System.out.println("Maior="+maior + ", posicao="+pos);
		sc.close();
	}

}
