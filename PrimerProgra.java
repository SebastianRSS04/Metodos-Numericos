import java.util.Random;
import java.util.Scanner;

public class PrimerProgra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Solicitar al usuario el tamaño de la matriz cuadrada (n x n)
        System.out.print("Ingrese el tamaño de la matriz cuadrada (Ejemplo: 3 para 3x3): ");
        int n = scanner.nextInt();

        // Verificar que el tamaño sea válido
        if (n <= 0) {
            System.out.println("Error: El tamaño de la matriz debe ser un número positivo.");
            return;
        }
        
        // Crear la matriz cuadrada de tamaño n x n
        int[][] matriz = new int[n][n];
        
        // Llenar la matriz con valores aleatorios entre 0 y 99
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(100); // Números aleatorios entre 0 y 99
            }
        }
        
        // Mostrar la matriz generada
        System.out.println("\nMatriz generada aleatoriamente:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        scanner.close();
    }
    }