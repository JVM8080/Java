public class registro {
    public sillas silla[];

    registro(){
        silla = new sillas[100];

        for(int id_silla = 0; id_silla < 100; id_silla++){
            silla[id_silla] = new sillas();
        }
    }

    public void setSilla(int id_silla, String duenho) {
        silla[id_silla].setDuenho(duenho);
    }

    public void verificar_ventas(){
        detallitos.imprimir("Sillas vendidas:");
        detallitos.espacio_doble();
        for(int id_silla = 0; id_silla < 100; id_silla++){
            if(!silla[id_silla].getDisponibilidad()){
                int numero_para_usuario;
                numero_para_usuario = id_silla + 1;
                detallitos.imprimir("Silla No. "+ numero_para_usuario + " ocupada por :" + silla[id_silla].getDuenho());
                detallitos.espacio();
            }
        }
    }

    public boolean dar_disponibilidad(int id_silla){
        return silla[id_silla].getDisponibilidad();
    }

    public String dar_nombres_duenhos(int id_silla){
        return silla[id_silla].getDuenho();
    }
}
