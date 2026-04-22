package taller_1_java;

public class Ejercicio_4 {
    public static void main(String[] args) {

    int stock = 50;
    int consumptionPerOrder = 3;
        System.out.println("inventario inicial :" + stock);

        while (stock >= 10){
            stock -= consumptionPerOrder;
            System.out.println(stock);
        }
        System.out.println("Alerta, el inventario se esta agotando, nos quedan solo : " + stock + " unidades");

    }
}
