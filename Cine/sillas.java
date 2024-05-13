public class sillas {
    private boolean disponibilidad;
    private String duenho;
    
    sillas(){
        this.disponibilidad = true;
        this.duenho = "";
    }

    //setters
    public void setDuenho(String duenho) {
        if(disponibilidad){
            this.duenho = duenho;
            this.disponibilidad = false;
        } else {
            System.out.println("Silla ocupada por el usuario " + this.duenho);
            System.out.println("Elija otra por favor");
        }
    }

    //getters
    public String getDuenho() {
        if(!disponibilidad)
        return duenho;
        else
        return "Silla desocupada";
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }
}
