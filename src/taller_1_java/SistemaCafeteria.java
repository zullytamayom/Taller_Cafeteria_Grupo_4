package taller_1_java;

public class SistemaCafeteria {
    public static void main(String[] args) {
        String[] nombres = {"Café americano", "Capuchino", "Jugo naranja", "Tostada", "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};
        char[] categorias = {'B', 'B', 'F', 'C', 'P'}; // B=Bebida caliente, F=Fría, C=Comida , P=Postre
        int[] pedidoProducto = {0, 2, 1, 4, 0, 3}; // índice del producto en cada pedido
        int[] pedidoCantidad = {2, 1, 3, 1, 1, 2}; // unidades por pedido

        double totalGeneral = 0;
        for (int i = 0; i < pedidoProducto.length; i++) {
            int idx = pedidoProducto[i];
            int cantidad = pedidoCantidad[i];
            String nombreProd = nombres[idx];
            char catLetra = categorias[idx];
            double subtotal = precios[idx] * cantidad;


            String categoriaDesc = switch (catLetra) {
                case 'B' -> "Bebida caliente";
                case 'F' -> "Bebida fría";
                case 'C' -> "Comida";
                case 'P' -> "Postre";
                default -> "Otros";
            };

            System.out.println("Pedido no. : " + (i + 1));
            System.out.println(" Nombre del Producto: "  + nombreProd);
            System.out.println("Cantidad: "  + cantidad);
            System.out.println("Categoría: " + categoriaDesc);
            System.out.printf("Subtotal: $%.0f\n", subtotal);
            System.out.println("..........");

            totalGeneral += subtotal;



        }
        System.out.println("total a pagar: " + totalGeneral);
    }
}
