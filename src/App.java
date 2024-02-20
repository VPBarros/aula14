import java.util.Locale;
import java.util.Scanner;


public class App {
    public static final double PI = 3.14159;
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite Raios: ");
		double raios = sc.nextDouble();
		
		double C = circunferencia(raios);
		double V = volume(raios);
		
		System.out.printf("Circunferencia: %.2f%n", C);
		System.out.printf("Volume:  %.2f%n" , V);
		System.out.printf("PI valor: %.2f%n" ,PI);
		
		
  sc.close();
	}

	public static double circunferencia(double raios) {
		return 2.0 * PI*raios;
	}
	
	public static double volume(double raios) { 
		return 4.0 * PI * raios * raios * raios / 3.0;
	}


    }

