package classes;
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int aux = x;
		System.out.println("v[0] = "+x);
		for(int i = 1;i<n;i++) {
			aux = aux *2;
			System.out.println("v["+i+"] = "+aux);
			
		}
		sc.close();
	}

}
