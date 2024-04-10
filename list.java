import java.util.Scanner;

// 1

public class list {
	public static void main(String[] args) {
        System.out.print("É preciso fazer todos os exercícios para aprender algoritmos!");
	}
}

// 2

public class list {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userName = sc.nextLine();
		int ageUser = sc.nextInt();

        System.out.printf("O usuário %s informou que tem %f anos", userName, ageUser);
		sc.close();
	}
}

// 3

public class list {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int coupleAmount = 2;
		int nowYear = 2021;

		String[] couple = new String[coupleAmount];

		for(int x = 0; x < coupleAmount; x++) {
			couple[x] = sc.nextLine();
		}

		int yearStartCouple = sc.nextInt();

		System.out.printf("%s é casado com %s há %d ano(s)", couple[0], couple[1], (nowYear - yearStartCouple));

		sc.close();
	}
}

// 4

public class list {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dividend = sc.nextInt();
		int divider = sc.nextInt();
		float quotient = (dividend / divider);
		float rest = (dividend % divider);

		System.out.printf("Dividendo = %d\n", dividend);
		System.out.printf("Divisor = %d\n", divider);
		System.out.printf("Quociente = %.1f\n", quotient);
		System.out.printf("Resto = %.1f\n", rest);

		sc.close();
	}
}

// 5

public class list {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int base = sc.nextInt();
		int height = sc.nextInt();

		int area = ( base * height );
		int perimeter = ( (2 * base) + (2 * height) );

		System.out.printf("Area = %d\n", area);
		System.out.printf("Perimetro = %d\n", perimeter);

		sc.close();
	}
}

// 6

public class list {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double salaryMin = sc.nextDouble();
		double salaryUser = sc.nextDouble();

		double userTotalSalarys = ( salaryUser / salaryMin );


		System.out.printf("O usuário recebe %.3f salários miniomos", userTotalSalarys);

		sc.close();
	}
}

// 7

public class list {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double percentDiscount = sc.nextDouble();
		double productPrice = sc.nextDouble();
		double calcDiscount = (productPrice - ( productPrice * ( percentDiscount / 100 ) ));

		System.out.printf("Produto com desconto! Preco com desconto: %.2f", calcDiscount);

		sc.close();
	}
}

// 8

public class list {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double priceFrabicVehicle = sc.nextDouble();
		double valueDistributorReceive = ( priceFrabicVehicle * ( 12 / 100) );
		double valuePayFabric = ( priceFrabicVehicle * ( 30 / 100 ) );
		double consumerPay = (priceFrabicVehicle + valueDistributorReceive + valuePayFabric);

		System.out.printf("O consumidor ira pagar: R$ %.2f", consumerPay);

		sc.close();
	}
}

// 9

public class list {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double fahrenheit = sc.nextDouble();

		double convertInCelsius = ( fahrenheit - 32 ) * ( 5 / 9 );

		System.out.printf("O valor em celsius é %.1f", convertInCelsius);

		sc.close();
	}
}

// 10

public class list {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double thunder = sc.nextDouble();

		double area = (Math.PI * Math.pow(thunder, 2));
		double perimeter = ((2 * Math.PI) * thunder);

		System.out.printf("AREA = %.2f", area);
		System.out.printf("PERIMETRO = %.2f", perimeter);

		sc.close();
	}
}

// 11

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

// 12

// Uma Progressão Aritmética (P.A) é determinada pela sua razão (r) e pelo seu primeiro
// termo (a1). Escreva um programa que determine o n-ésimo termo de uma P.A utilizando
// a fórmula abaixo. Para tal, leia o primeiro termo, a razão e o valor de n que representa o
// índice do n-ésimo termo. Ao final, imprima o valor da P.A de n (an).


public class list {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int firstTerm = sc.nextInt();
		int razao = sc.nextInt();
		int n = sc.nextInt();


		int an = (firstTerm + (n - 1) * razao);

		System.out.printf("A%d = %d\n", n, an);

		sc.close();
	}
}

// 13

public class Core {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		double salaryMin = sc.nextDouble();
		int TV_LCD = ( sc.nextInt() * 50 );
		int TV_LED = ( sc.nextInt() * 60 );
		int TV_PLASMA = ( sc.nextInt() * 75 );

        double salaryTotal = ( 2 * salaryMin ) + ( TV_LCD + TV_LED + TV_PLASMA ) ; 

        System.out.printf("Salario total é: %.2f", salaryTotal);


		sc.close();
    }
}

// 14

public class Main
{
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        double formula = (2 * ( Math.sqrt(3 * x + 30) / 3 ) + Math.pow((y - 32), 4));

        System.out.printf("Formula: %.2f", formula);

		sc.close();
		
	}
}


// 15

public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X1 = sc.nextInt();
        int Y1 = sc.nextInt();
        int X2 = sc.nextInt();
        int Y2 = sc.nextInt();

        double calc = Math.sqrt( ( Math.pow((Y2 - Y1), 2) + Math.pow((X2 - X1), 2)) );

        System.out.printf("Resultado: %.2f", calc);


		sc.close();
		
	}
}


// 16

public class Main
{
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        double res = (  (Math.pow((A + B), 2) + Math.pow((B + C), 2) ) / 2);

        System.out.printf("O resultado é: %.2f", res);
		sc.close();
		
	}

// 17

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();
        double dolPrice = 5.04;
        
        double calc = amount * dolPrice;
        
        System.out.printf("Você precisa de R$ %.2f", calc);

		sc.close();
		
	}
}

// 18

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int temp = 0;

        temp = A;

        A = B;
        B = temp;

        System.out.printf("O valor de A é %d e o valor de B é %d", A, B);

		sc.close();
    }
}

// 19
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double AUTONOMY = 12.0;
        System.out.println("Informe o tempo gasto na viagem (em horas): ");
        double timeSpent = sc.nextDouble();
        System.out.println("Informe a velocidade média durante a viagem (em Km/h): ");
        double averageSpeed = sc.nextDouble();
        double distance = timeSpent * averageSpeed;
        double litersUsed = distance / AUTONOMY;
        System.out.printf("Velocidade média: %.2f Km/h\n", averageSpeed);
        System.out.printf("Tempo gasto na viagem: %.2f horas\n", timeSpent);
        System.out.printf("Distância percorrida: %.2f Km\n", distance);
        System.out.printf("Quantidade de litros de combustível utilizada: %.2f litros\n", litersUsed);
        sc.close();
    }
}

// 20
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double TAX_BUILT = 5.00;
        final double TAX_UNBUILT = 3.80;
        System.out.println("Informe a área total do terreno (em m2): ");
        double totalArea = sc.nextDouble();
        System.out.println("Informe a área construída do terreno (em m2): ");
        double builtArea = sc.nextDouble();
        double unbuiltArea = totalArea - builtArea;
        double totalTax = (builtArea * TAX_BUILT) + (unbuiltArea * TAX_UNBUILT);
        System.out.printf("O valor total do imposto a ser pago é: R$ %.2f\n", totalTax);
        sc.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tempo total em segundos: ");
        int totalSeconds = sc.nextInt();
        
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        
        System.out.printf("%ds = %dh %dm %ds\n", totalSeconds, hours, minutes, seconds);
        sc.close();
    }
}
// 21
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro de 3 dígitos: ");
        int number = sc.nextInt();
        
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;
        
        System.out.printf("Centenas: %d, Dezenas: %d, Unidades: %d\n", hundreds, tens, units);
        
        int invertedNumber = (units * 100) + (tens * 10) + hundreds;
        System.out.println("Número invertido: " + invertedNumber);
        
        sc.close();
    }
}
// 22
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a hora (formato 24h): ");
        int hour = sc.nextInt();
        System.out.println("Informe os minutos: ");
        int minutes = sc.nextInt();
        
        int totalMinutes = (hour * 60) + minutes;
        System.out.printf("Desde o início do dia, passaram-se %d minutos.\n", totalMinutes);
        
        sc.close();
    }
}
// 23
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        int number = sc.nextInt();
        
        if (number % 2 == 0) {
            System.out.println("O número informado é par.");
        } else {
            System.out.println("O número informado é ímpar.");
        }
        
        sc.close();
    }
}
// 24
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        int number = sc.nextInt();
        
        if (number > 0) {
            System.out.println("O número é positivo.");
        } else if (number < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é nulo.");
        }
        
        sc.close();
    }
}
// 25
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        int A = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        int B = sc.nextInt();
        
        if (B == 0) {
            System.out.println("Não é possível dividir por zero.");
        } else if (A % B == 0) {
            System.out.println("A é divisível por B.");
        } else {
            System.out.println("A não é divisível por B.");
        }
        
        sc.close();
    }
}

// 26
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número real: ");
        double number1 = sc.nextDouble();
        System.out.println("Digite o segundo número real: ");
        double number2 = sc.nextDouble();
        
        System.out.println("Escolha a operação: (1) Soma, (2) Subtração, (3) Multiplicação, (4) Divisão");
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1: // Soma
                System.out.printf("Resultado: %.2f\n", number1 + number2);
                break;
            case 2: // Subtração
                System.out.printf("Resultado: %.2f\n", number1 - number2);
                break;
            case 3: // Multiplicação
                System.out.printf("Resultado: %.2f\n", number1 * number2);
                break;
            case 4: // Divisão
                if (number2 == 0) {
                    System.out.println("Divisão impossível.");
                } else {
                    System.out.printf("Resultado: %.2f\n", number1 / number2);
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        
        sc.close();
    }
}

// 28

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String name = sc.nextLine();
        
        System.out.println("Digite sua idade: ");
        int age = sc.nextInt();
        
        if (age >= 18) {
            System.out.println(name + " é maior de idade.");
        } else {
            System.out.println(name + " é menor de idade.");
        }
        
        sc.close();
    }
}

// 29

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String name = sc.nextLine();
        
        System.out.println("Digite sua idade: ");
        int age = sc.nextInt();
        
        if (age >= 18) {
            System.out.println(name + " é maior de idade.");
            if (age > 65) {
                System.out.println(name + " tem mais de 65 anos.");
            }
        } else {
            System.out.println(name + " é menor de idade.");
            if (age < 12) {
                System.out.println(name + " é menor de 12 anos.");
            }
        }
        
        sc.close();
    }
}

// 30

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite uma letra: ");
        char letter = sc.next().toLowerCase().charAt(0);
        
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println("É uma vogal.");
        } else if ((letter >= 'a' && letter <= 'z')) {
            System.out.println("É uma consoante.");
        } else {
            System.out.println("Não é uma letra válida.");
        }
        
        sc.close();
    }
}

// 31

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a média do aluno: ");
        double grade = sc.nextDouble();
        
        if (grade >= 0.0 && grade <= 4.9) {
            System.out.println("Conceito D");
        } else if (grade <= 6.9) {
            System.out.println("Conceito C");
        } else if (grade <= 8.9) {
            System.out.println("Conceito B");
        } else if (grade <= 10.0) {
            System.out.println("Conceito A");
        } else {
            System.out.println("Nota inválida.");
        }
        
        sc.close();
    }
}

// 32

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite três valores inteiros distintos: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int MAIOR, MENOR, INTER;
        
        MAIOR = A;
        if (B > MAIOR) MAIOR = B;
        if (C > MAIOR) MAIOR = C;
        
        MENOR = A;
        if (B < MENOR) MENOR = B;
        if (C < MENOR) MENOR = C;
        
        INTER = (A + B + C) - (MAIOR + MENOR);
        
        System.out.println("Ordem crescente: " + MENOR + ", " + INTER + ", " + MAIOR);
        
        sc.close();
    }
}

// 33

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String name = sc.nextLine();
        
        System.out.println("Digite seu peso na Terra (em kg): ");
        double earthWeight = sc.nextDouble();
        
        System.out.println("Escolha o número de um planeta para saber seu peso nele:");
        System.out.println("1. Mercúrio\n2. Vênus\n3. Marte\n4. Júpiter\n5. Saturno\n6. Urano");
        int planetChoice = sc.nextInt();
        
        double gravityRelative = switch (planetChoice) {
            case 1 -> 0.37;
            case 2 -> 0.88;
            case 3 -> 0.38;
            case 4 -> 2.64;
            case 5 -> 1.15;
            case 6 -> 1.17;
            default -> 0;
        };
        
        if (gravityRelative == 0) {
            System.out.println("Opção inválida.");
        } else {
            double weightOnPlanet = earthWeight * gravityRelative;
            System.out.printf("%s, seu peso no planeta escolhido é: %.2f kg\n", name, weightOnPlanet);
        }
        
        sc.close();
    }
}

// 34

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o peso em quilogramas: ");
        double weight = sc.nextDouble();

        System.out.println("Digite a altura em metros: ");
        double height = sc.nextDouble();

        double imc = weight / (height * height);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 25) {
            System.out.println("Peso normal");
        } else if (imc <= 30) {
            System.out.println("Acima do peso");
        } else {
            System.out.println("Obeso");
        }

        sc.close();
    }
}

// 35

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma opção do cardápio:\n1. Pizza\n2. Picanha\n3. Peixe Frito");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Opção 1: Pizza, pedido realizado com sucesso.");
                break;
            case 2:
                System.out.println("Opção 2: Picanha, pedido realizado com sucesso.");
                break;
            case 3:
                System.out.println("Opção 3: Peixe Frito, pedido realizado com sucesso.");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        sc.close();
    }
}

// 36

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de compra do produto: ");
        double purchaseValue = sc.nextDouble();
        double saleValue;

        if (purchaseValue < 10.00) {
            saleValue = purchaseValue * 1.70;
        } else if (purchaseValue <= 30.00) {
            saleValue = purchaseValue * 1.50;
        } else if (purchaseValue <= 50.00) {
            saleValue = purchaseValue * 1.40;
        } else {
            saleValue = purchaseValue * 1.30;
        }

        System.out.printf("O valor de venda do produto é: R$ %.2f\n", saleValue);

        sc.close();
    }
}


// 37

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int age = sc.nextInt();
        String classification;

        if (age >= 0 && age <= 2) {
            classification = "Recém-nascido";
        } else if (age <= 11) {
            classification = "Criança";
        } else if (age <= 19) {
            classification = "Adolescente";
        } else if (age <= 55) {
            classification = "Adulto";
        } else {
            classification = "Idoso";
        }

        System.out.println("Classificação: " + classification);

        sc.close();
    }
}

// 38

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o preço inicial de fábrica do carro: ");
        double precoInicial = sc.nextDouble();
        
        System.out.println("Deseja adicionar ar condicionado? 1 para sim, 0 para não: ");
        int opcaoAr = sc.nextInt();
        
        System.out.println("Deseja adicionar pintura metálica? 1 para sim, 0 para não: ");
        int opcaoPintura = sc.nextInt();
        
        System.out.println("Deseja adicionar vidro elétrico? 1 para sim, 0 para não: ");
        int opcaoVidro = sc.nextInt();
        
        System.out.println("Deseja adicionar direção hidráulica? 1 para sim, 0 para não: ");
        int opcaoDirecao = sc.nextInt();
        
        double precoFinal = precoInicial
            + (opcaoAr == 1 ? 1750.0 : 0)
            + (opcaoPintura == 1 ? 800.0 : 0)
            + (opcaoVidro == 1 ? 1200.0 : 0)
            + (opcaoDirecao == 1 ? 2000.0 : 0);
        
        System.out.printf("O preço final do carro é: R$ %.2f\n", precoFinal);
        
        sc.close();
    }
}

// 39

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o dia: ");
        int dia = sc.nextInt();
        
        System.out.println("Digite o mês (número): ");
        int mes = sc.nextInt();
        
        System.out.println("Digite o ano: ");
        int ano = sc.nextInt();
        
        String[] meses = {
            "janeiro", "fevereiro", "março", "abril", "maio", "junho",
            "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
        };
        
        String mesExtenso = meses[mes - 1];
        
        System.out.printf("%d de %s de %d\n", dia, mesExtenso, ano);
        
        sc.close();
    }
}

// 40

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a idade: ");
        int idade = sc.nextInt();
        
        if (idade < 16) {
            System.out.println("Não-eleitor");
        } else if (idade >= 18 && idade <= 65) {
            System.out.println("Eleitor obrigatório");
        } else {
            System.out.println("Eleitor facultativo");
        }
        
        sc.close();
    }
}


// 41

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o consumo de água em metros cúbicos: ");
        double consumo = sc.nextDouble();
        
        System.out.println("Digite o tipo de consumo: 1-Residencial, 2-Comercial, 3-Industrial: ");
        int tipo = sc.nextInt();
        
        double conta = 0.0;
        if (tipo == 1) {
            conta = 5.0 + consumo * 0.05;
        } else if (tipo == 2) {
            conta = consumo <= 80 ? 500.0 : 500.0 + (consumo - 80) * 0.25;
        } else if (tipo == 3) {
            conta = consumo <= 100 ? 800.0 : 800.0 + (consumo - 100) * 0.04;
        }
        
        System.out.printf("O valor da conta de água é: R$ %.2f\n", conta);
        
        sc.close();
    }
}

// 42

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores de A, B e C: ");
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        System.out.println("Escolha o código da fórmula (1, 2, 3 ou 4): ");
        int codigo = sc.nextInt();
        double Y = 0.0;
        boolean divisaoPorZero = false;

        switch (codigo) {
            case 1:
                if (B - C == 0) {
                    divisaoPorZero = true;
                } else {
                    Y = (A * Math.pow(B, 2) + C) / (B - C);
                }
                break;
            case 2:
                Y = A * B + C;
                break;
            case 3:
                if (4 * X == 0) {
                    divisaoPorZero = true;
                } else {
                    Y = (A * X + C) / (4 * X);
                }
                break;
            case 4:
                Y = B * Math.pow(X, -1);
                break;
            default:
                System.out.println("Código de fórmula inválido.");
                break;
        }

        if (!divisaoPorZero) {
            System.out.printf("O resultado da fórmula é: %.2f\n", Y);
        } else {
            System.out.println("Divisão por zero.");
        }

        sc.close();
    }
}

// 43

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salário do funcionário: ");
        double salario = sc.nextDouble();
        System.out.println("Digite o código correspondente ao cargo: ");
        int codigo = sc.nextInt();
        double percentual = 0.0;

        switch (codigo) {
            case 1:
                percentual = 0.50; // 50%
                break;
            case 2:
                percentual = 0.35; // 35%
                break;
            case 3:
                percentual = 0.20; // 20%
                break;
            case 4:
                percentual = 0.10; // 10%
                break;
            case 5:
                percentual = 0; // 0%
                break;
            default:
                System.out.println("Código de cargo inválido.");
                return; // Sai do método main
        }

        double aumento = salario * percentual;
        double novoSalario = salario + aumento;

        System.out.printf("O aumento será de: R$ %.2f\n", aumento);
        System.out.printf("O novo salário será de: R$ %.2f\n", novoSalario);

        sc.close();
    }
}

// 44

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código do produto: ");
        int codigo = sc.nextInt();
        String classificacao;

        if (codigo == 1) {
            classificacao = "Alimento não-perecível";
        } else if (codigo >= 2 && codigo <= 4) {
            classificacao = "Alimento perecível";
        } else if (codigo == 5 || codigo == 6) {
            classificacao = "Vestuário";
        } else if (codigo == 7) {
            classificacao = "Higiene pessoal";
        } else if (codigo >= 8 && codigo <= 15) {
            classificacao = "Limpeza e utensílios domésticos";
        } else {
            classificacao = "Inválido";
        }

        System.out.println("Classificação do produto: " + classificacao);

        sc.close();
    }
}

// 45

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o preço normal do DVD: ");
        double precoNormal = sc.nextDouble();
        System.out.println("Informe o dia da semana (1 - Domingo, 2 - Segunda, ..., 7 - Sábado): ");
        int diaSemana = sc.nextInt();
        System.out.println("O DVD é um lançamento? (s/n): ");
        char lancamento = sc.next().toLowerCase().charAt(0);

        double precoFinal = precoNormal;

        if (diaSemana == 2 || diaSemana == 3 || diaSemana == 5) {
            // Segunda, Terça ou Quinta: desconto de 40%
            precoFinal *= 0.6;
        } else if (lancamento == 's') {
            // Lançamentos: acréscimo de 15%
            precoFinal *= 1.15;
        }

        System.out.printf("O preço final a ser pago pela locação do DVD é: R$ %.2f\n", precoFinal);

        sc.close();
    }
}




