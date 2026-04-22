package taller_1_java;

public class Ejercicio_2
{
    public static void main(String[] args) {
        double subtotal = 42500.0;
        boolean tieneDerechoDescuento = subtotal > 30000;
        double valorDescuento = tieneDerechoDescuento ? subtotal * 0.15 : 0;
        double totalPagar = subtotal - valorDescuento;

        System.out.printf("Valor del descuento: %.2f%n", valorDescuento);
        System.out.printf("Total a pagar: %.2f%n", totalPagar);
        System.out.printf("Tiene derecho al descuento: %b%n", tieneDerechoDescuento);
    }
}