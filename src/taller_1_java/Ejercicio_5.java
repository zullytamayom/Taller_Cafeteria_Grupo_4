package taller_1_java;

public class Ejercicio_5 {
    public static void main(String[] args) {

        double openingAmount;

        openingAmount = -35.500;

        do{
            System.out.println("monto de apertura de caja : "+ openingAmount);

            if(openingAmount <= 0 ){
                System.out.println("Monto incorrecto, deberia ser mayor a 0");
                openingAmount = 1000.1;
            }

        }while(openingAmount<= 0);

            System.out.println("apertura exitosa  : " + openingAmount);


    }
}
