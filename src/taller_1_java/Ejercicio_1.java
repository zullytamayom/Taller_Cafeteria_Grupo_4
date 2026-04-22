package taller_1_java;

public class Ejercicio_1 {
    public static void main(String[] args) {
        String productName = "Boton de Oro";
        Double unitPrice = 35.500;
        int stock = 120;
        boolean available = true;
        byte productCode = 1;

        String result = String.format("El cafe es %s  y cuesta %f , tenemos en inventario con %d productos, su disponibilidad es %b y el codigo de producto es %d", productName, unitPrice,stock,available,productCode);
        System.out.println("result = " + result);


    }
}
