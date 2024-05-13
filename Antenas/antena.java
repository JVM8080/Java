package Antenas;

public class antena {
    private String id;
    private double radio;
    private coordenadas posicion;

    public antena(String _id, double _radio, coordenadas _posicion){
        id = _id;
        radio = _radio;
        posicion = _posicion; 
    }

    public String getId() {
        return id;
    }
    public coordenadas getPosicion() {
        return posicion;
    }
    public double getRadio() {
        return radio;
    }

}