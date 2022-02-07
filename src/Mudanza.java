import java.util.LinkedList;

public class Mudanza {
    private String id;

    @Override
    public String toString() {
        return "Mudanza{" +
                "id='" + id + '\'' +
                ", distancia=" + distancia +
                '}';
    }

    public String getId() {
        return id;
    }

    //CONSTRUCTOR COPIA ABAJO
    public Paquete(Paquete paquete){
        this.id = paquete.id;
        this.distancia = paquete.distancia;
    }

    private double distancia;

    public double getDistancia() {
        return distancia;
    }

    private Camion camion;

    public Camion getCamion() {
        return camion;
    }

    public void setCamion(Camion camion) {
        this.camion = camion;
    }

    private LinkedList<Paquete> paquete = new LinkedList<Paquete>();

    public Mudanza(String id, double distancia) {
        this.id = id;
        this.distancia = distancia;
    }


    public void IncluyePaquete(Paquete paquete) {
        paquetes.add(paquete);
    }

    public double precio() {
        return precioPaquetes() + precioDesplazamiento();

    }

    public double precioPaquetes() {
        double precio = 0;
        for (Paquete paquete : paquetes) {
            if (paquete.isFragilidad())
                precio += paquete.getPeso() * 4;
            else
                precio += paquete.getPeso();
        }
    }

    public precioDesplazamiento() {
        return viajesRequeridos() * distancia * 2;
    }

    public int viajesRequeridos() {
        LinkedList<Paquete> copiaPaquetes = new LinkedList<>(paquetes);
        int viajes = 0;
        while (!copiaPaquetes.isEmpty/*==false*/ ()){

            cargaCamionAlMaximo(copiaPaquetes);
            copiaPaquetes.removeAll(camion.paquetesCargados());
            camion.vaciar();
            viajes ++;
        }return 0;
    }
private void cargaCamionAlMaximo(LinkedList<Paquete> paquetesRestantes){
        for (Paquete paquete : paquetesRestantes);
        if (camion.cabePaquete(paquete))
            camion.cargaPaquete(paquete);
        }



}
