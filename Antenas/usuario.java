package Antenas;

import java.util.Random;

public class usuario {
    private String id;
    private coordenadas posicion;
    private String cobertura;
    private boolean lcobertura;

    public usuario(String _id, coordenadas _posicion){
        id = _id;
        posicion = _posicion;
        cobertura = "";
        lcobertura = false;
    }

    //setters
    public void setCobertura() {
        cobertura = "";
    }

    public void setLcobertura(boolean lcobertura) {
        this.lcobertura = lcobertura;
    }

    //getters
    public String getCobertura() {
        return cobertura;
    }

    public boolean getLcobertura() {
        return lcobertura;
    }
    
    //metodos
    public void verificar(String _id, coordenadas _posicion, double _radio){
        double distancia; 
        distancia = Math.sqrt(Math.pow(this.posicion.x - _posicion.x, 2) + Math.pow(this.posicion.y - _posicion.y, 2));
        if(distancia <= _radio){
            cobertura = cobertura + _id + "  ";
            lcobertura = true;
        }
    }

    public void pos_aleatoria(){
        double angulo;
        double desplazamiento;
        
        Random random = new Random();
        do {
            angulo = random.nextDouble(360);
            desplazamiento = random.nextDouble(20, 50);
    
            posicion.x = posicion.x + desplazamiento*Math.cos(angulo*Math.PI/180);
            posicion.y = posicion.x + desplazamiento*Math.sin(angulo*Math.PI/180);   
        } while (posicion.x > 2500 || posicion.x < 0 || posicion.y > 2500 || posicion.y < 0 );
    }
}
