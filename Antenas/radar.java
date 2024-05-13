package Antenas;

import java.util.Random;

public class radar {
    public static void main(String[] args) {
        coordenadas[] array_de_coordenadas = {
            new coordenadas(329,1632),
            new coordenadas(1651, 1701),
            new coordenadas(1000, 1000),
            new coordenadas(430, 500),
            new coordenadas(1312, 629),
        };
    
        antena[] array_de_antenas = {
            new antena("1",306,array_de_coordenadas[0]),
            new antena("2",251,array_de_coordenadas[1]),
            new antena("3",758,array_de_coordenadas[2]),
            new antena("4",391,array_de_coordenadas[3]),
            new antena("5",606,array_de_coordenadas[4]),
        };

        usuario array_de_usuarios[] = new usuario[20];

        for(int i = 0;i < 20; i++){
            coordenadas rand_usuario;
            rand_usuario = new coordenadas();
            Random random = new Random();
            rand_usuario.x = random.nextDouble(2501);
            rand_usuario.y = random.nextDouble(2501);
            array_de_usuarios[i]= new usuario(Integer.toString(i), rand_usuario);
        }

        while(true){
            System.out.println("Cobertura de usuarios:");
            for(int _usuario = 0; _usuario < 20; _usuario++){
                for(int _antena = 0; _antena < 5 ; _antena++){
                    array_de_usuarios[_usuario].verificar(array_de_antenas[_antena].getId(), array_de_antenas[_antena].getPosicion(), array_de_antenas[_antena].getRadio());
                }
                int b = _usuario + 1;
                if (array_de_usuarios[_usuario].getLcobertura() == true) {
                    if(_usuario < 9){
                        System.out.println("[ "+ b + "] = " + array_de_usuarios[_usuario].getCobertura());
                    } else{
                        System.out.println("["+ b + "] = " + array_de_usuarios[_usuario].getCobertura());
                    }
                } else{
                    if(_usuario < 9){
                        System.out.println("[ "+ b + "] = sin cobertura");
                    } else{
                        System.out.println("["+ b + "] = sin cobertura");
                    }
                }
                array_de_usuarios[_usuario].setCobertura();
                array_de_usuarios[_usuario].setLcobertura(false);
                array_de_usuarios[_usuario].pos_aleatoria();
            }

            System.out.println();
            System.out.println();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}
