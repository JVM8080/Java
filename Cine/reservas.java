import java.util.Scanner;

public class reservas {
    public static void main(String[] args) {
        
        registro reservas_cine;
        Scanner sc;
        int id_silla;
        boolean senhal_del_cajero = false;
        String persona;

        reservas_cine = new registro();
        sc = new Scanner(System.in);

        //Proceso de compra
        while(!senhal_del_cajero){
            detallitos.imprimir("Ingrese su nombre completo por favor:");
            persona = sc.next();
            detallitos.espacio();

            do{
            detallitos.imprimir("Ingrese el numero de la silla a comprar (1-100):");
            id_silla = sc.nextInt() - 1;

            if(!reservas_cine.dar_disponibilidad(id_silla)){
                detallitos.espacio();
                detallitos.imprimir("Silla ocupada por " + reservas_cine.dar_nombres_duenhos(id_silla));
                detallitos.espacio_doble();
            }

            } while (!reservas_cine.dar_disponibilidad(id_silla));

            detallitos.espacio();

            reservas_cine.setSilla(id_silla, persona);

            //Pregunta para el cajero
            detallitos.imprimir("¿Hay clientes en la fila?  si/no: ");

            if(sc.next().equals("no")){
                senhal_del_cajero = true;
            }

            detallitos.espacio();
        }

        detallitos.espacio_doble();

        reservas_cine.verificar_ventas();

        detallitos.espacio_doble();
    }
}
