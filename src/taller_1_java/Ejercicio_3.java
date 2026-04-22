import java.util.Scanner;

public class Cafeteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el código del producto (B, F, C, P): ");
        char codigo = sc.next().toUpperCase().charAt(0);

        switch (codigo) {
            case 'B':
                System.out.println("Categoría: Bebida caliente");
                System.out.println("IVA: 0%");
                break;

            case 'F':
                System.out.println("Categoría: Bebida fría");
                System.out.println("IVA: 5%");
                break;

            case 'C':
                System.out.println("Categoría: Comida");
                System.out.println("IVA: 8%");
                break;

            case 'P':
                System.out.println("Categoría: Postre");
                System.out.println("IVA: 8%");
                break;

            default:
                System.out.println("Código no reconocido");
        }

        sc.close();
    }
}