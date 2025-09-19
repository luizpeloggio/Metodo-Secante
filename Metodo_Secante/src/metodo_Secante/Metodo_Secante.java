
package metodo_Secante;

import java.util.Scanner;

public class Metodo_Secante {
	public static double funcao(double x) {
		double res = Math.exp(x)-3 * Math.pow(x, 2);
		return res;
	}
	public static double funcaoSecante(double x0, double x1) {
		double fx0 = funcao(x0);
		double fx1 = funcao(x1);
		
		double x2 = ((x0*fx1)-(x1*fx0))/(fx1-fx0);
		
		return x2;
		
	}


	public static void main(String[] args) {
		int i = 1;
		double e = 0.001;
		double x0,x1,fx0,fx1, x2;
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe o valor de a: \n");
		x0 = sc.nextDouble();
		System.out.printf("Informe o valor de b: \n");
		x1 = sc.nextDouble();
		
		System.out.printf("O intervalo é [%.3f,%.3f]\n", x0,x1);
		
		fx0 = funcao(x0);
		System.out.printf("A funçao de a é %.3f\n", fx0);

		fx1 = funcao(x1);
		System.out.printf("A função de b é %.3f\n",fx1);
		
		x2 = funcaoSecante(x0,x1);
		
		System.out.printf("A função secante é %.3f\n",x2);
		
		while(Math.abs(x2-x1)>e) {
			System.out.printf("%d Interação \n", i);
			x0 = x1;
			x1 = x2;
			x2 = funcaoSecante(x0, x1);
			
			System.out.printf("0 novo resultado da função secante é %.3f\n",x2);

			i++;
		}
		
	        System.out.printf("Raiz encontrada: x = %.3f\n", x2);


		sc.close();

	}

}
