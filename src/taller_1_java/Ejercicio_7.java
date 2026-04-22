package taller_1_java;

public class Ejercicio_7 {
    public static void main(String[] args) {
        int cantidadVendida = 5; //Sobran comillas ya que no es un String.(corregido)
        double precioUnitario = 4500;
        double total = cantidadVendida * precioUnitario;// falta el ";" (corregido)
        boolean aplicaDescuento = (total > 20000);
        if (aplicaDescuento = true) { //un solo = es asignacion, pero aqui se requieren dos: == porque comparas.
            total = total - (total * 0.10);
        }
        System.out.println("Total: " + total);

    }
}
