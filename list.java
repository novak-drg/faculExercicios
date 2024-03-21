import java.util.Scanner;

// 1

// public class list {
// 	public static void main(String[] args) {
//         System.out.print("É preciso fazer todos os exercícios para aprender algoritmos!");
// 	}
// }

// 2

// public class list {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		String userName = sc.nextLine();
// 		int ageUser = sc.nextInt();

//         System.out.printf("O usuário %s informou que tem %f anos", userName, ageUser);
// 		sc.close();
// 	}
// }

// 3

// public class list {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
//         int coupleAmount = 2;
// 		int nowYear = 2021;

// 		String[] couple = new String[coupleAmount];

// 		for(int x = 0; x < coupleAmount; x++) {
// 			couple[x] = sc.nextLine();
// 		}

// 		int yearStartCouple = sc.nextInt();

// 		System.out.printf("%s é casado com %s há %d ano(s)", couple[0], couple[1], (nowYear - yearStartCouple));

// 		sc.close();
// 	}
// }

// 4

// public class list {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);

// 		int dividend = sc.nextInt();
// 		int divider = sc.nextInt();
// 		float quotient = (dividend / divider);
// 		float rest = (dividend % divider);

// 		System.out.printf("Dividendo = %d\n", dividend);
// 		System.out.printf("Divisor = %d\n", divider);
// 		System.out.printf("Quociente = %.1f\n", quotient);
// 		System.out.printf("Resto = %.1f\n", rest);

// 		sc.close();
// 	}
// }

// 5

// public class list {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);

// 		int base = sc.nextInt();
// 		int height = sc.nextInt();

// 		int area = ( base * height );
// 		int perimeter = ( (2 * base) + (2 * height) );

// 		System.out.printf("Area = %d\n", area);
// 		System.out.printf("Perimetro = %d\n", perimeter);

// 		sc.close();
// 	}
// }

// 6

// public class list {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);

// 		double salaryMin = sc.nextDouble();
// 		double salaryUser = sc.nextDouble();

// 		double userTotalSalarys = ( salaryUser / salaryMin );


// 		System.out.printf("O usuário recebe %.3f salários miniomos", userTotalSalarys);

// 		sc.close();
// 	}
// }

// 7

// public class list {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);

// 		double percentDiscount = sc.nextDouble();
// 		double productPrice = sc.nextDouble();
// 		double calcDiscount = (productPrice - ( productPrice * ( percentDiscount / 100 ) ));

// 		System.out.printf("Produto com desconto! Preco com desconto: %.2f", calcDiscount);

// 		sc.close();
// 	}
// }

// 8

// public class list {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);

// 		double priceFrabicVehicle = sc.nextDouble();
// 		double valueDistributorReceive = ( priceFrabicVehicle * ( 12 / 100) );
// 		double valuePayFabric = ( priceFrabicVehicle * ( 30 / 100 ) );
// 		double consumerPay = (priceFrabicVehicle + valueDistributorReceive + valuePayFabric);

// 		System.out.printf("O consumidor ira pagar: R$ %.2f", consumerPay);

// 		sc.close();
// 	}
// }

// 9

// public class list {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
		
// 		double fahrenheit = sc.nextDouble();

// 		double convertInCelsius = ( fahrenheit - 32 ) * ( 5 / 9 );

// 		System.out.printf("O valor em celsius é %.1f", convertInCelsius);

// 		sc.close();
// 	}
// }

// 10

// public class list {
// 	public static void main(String[] args) {

// 		Scanner sc = new Scanner(System.in);
		
// 		double thunder = sc.nextDouble();

// 		double area = (Math.PI * Math.pow(thunder, 2));
// 		double perimeter = ((2 * Math.PI) * thunder);

// 		System.out.printf("AREA = %.2f", area);
// 		System.out.printf("PERIMETRO = %.2f", perimeter);

// 		sc.close();
// 	}
// }

// 11

// public class list {
// 	public static void main(String[] args) {

// 		Scanner sc = new Scanner(System.in);
		
// 		int weight[] = new int[4];

// 		for (int x = 0; x < 4; x++) {
// 			weight[x] = sc.nextInt();
// 		}

// 		double averageWeighted = ( weight[0] * 1 + weight[1] * 2 + weight[2] * 3 + weight[3] * 4 ) / ( 1 + 2 + 3 + 4 );

// 		System.out.printf("A média ponderada: %.2f", averageWeighted);

// 		sc.close();
// 	}
// }

// 12

// Uma Progressão Aritmética (P.A) é determinada pela sua razão (r) e pelo seu primeiro
// termo (a1). Escreva um programa que determine o n-ésimo termo de uma P.A utilizando
// a fórmula abaixo. Para tal, leia o primeiro termo, a razão e o valor de n que representa o
// índice do n-ésimo termo. Ao final, imprima o valor da P.A de n (an).


public class list {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int weight[] = new int[4];

		for (int x = 0; x < 4; x++) {
			weight[x] = sc.nextInt();
		}

		double averageWeighted = ( weight[0] * 1 + weight[1] * 2 + weight[2] * 3 + weight[3] * 4 ) / ( 1 + 2 + 3 + 4 );

		System.out.printf("A média ponderada: %.2f", averageWeighted);

		sc.close();
	}
}
