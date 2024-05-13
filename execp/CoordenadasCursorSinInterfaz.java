import java.awt.*;
import java.awt.event.*;

public class CoordenadasCursorSinInterfaz {

    public static void main(String[] args) {
        // Creamos un objeto de tipo Toolkit para obtener información sobre la pantalla
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        // Obtenemos el tamaño de la pantalla
        Dimension screenSize = toolkit.getScreenSize();

        // Creamos un objeto de tipo Robot para controlar el cursor
        try {
            Robot robot = new Robot();
            while (true) {
                // Obtenemos la posición actual del cursor
                Point point = MouseInfo.getPointerInfo().getLocation();
                // Imprimimos las coordenadas en la consola
                System.out.println("Coordenadas: (" + point.x + ", " + point.y + ")");
                // Dormimos el hilo durante un breve período para evitar un uso excesivo de la CPU
                Thread.sleep(100);
            }
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
