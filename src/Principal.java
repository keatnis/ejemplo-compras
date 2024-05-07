import com.keatnis.desafio.mod.Compra;
import com.keatnis.desafio.mod.Tarjeta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        String menu = """
                *** MENU ***\n
                  Realizar operaciones        
                ------------         
                """;
        int salir = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println(menu);
        System.out.println("escriba el limite de la tarjeta ");
        Double limite = teclado.nextDouble();
        Tarjeta tarjeta = new Tarjeta(limite);

        while (salir != 0) {
            System.out.println("escriba el valor del producto");
            Double valor = Double.valueOf(teclado.nextDouble());
            System.out.println("describa el producto");
            String descripcion = teclado.next();

            Compra compra = new Compra(descripcion, valor);
            boolean realizarCompra = tarjeta.lanzarCompra(compra);
            if (realizarCompra) {
                System.out.println("Compra realizada ");
                System.out.println("escriba 0 para salir o 1 para continuar ");
                salir = teclado.nextInt();

            } else {
                System.out.println("saldo insuficiente");
                salir = 0;
            }

        }
        System.out.println("**** c o m p r a s   r e a l i z a d a s ****");
        Collections.sort(tarjeta.getListaDeCompras());
       for (Compra compra : tarjeta.getListaDeCompras()) {

           System.out.println("descripcion: "+compra.getDescripcion() + " precio: "+compra.getValor());
       }
        System.out.println("\n ************");
        System.out.println("saldo de la tarjeta: "+tarjeta.getSaldo());
    }


}
