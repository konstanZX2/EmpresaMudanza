

public class Paquete {

    public int id;
    public double volumen;
    public double peso;
    public boolean fragilidad;

    public Paquete(int id, double volumen, double peso, boolean fragilidad) {
        this.id = id;
        this.volumen = volumen;
        this.peso = peso;
        this.fragilidad = fragilidad;
    }

    @Override
    public String toString() {
        return "Paquete{" +
                "id=" + id +
                ", volumen=" + volumen +
                ", peso=" + peso +
                ", fragilidad=" + fragilidad +
                '}';

    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isFragilidad() {
        return fragilidad;
    }

    public void setFragilidad(boolean fragilidad) {
        this.fragilidad = fragilidad;
    }


}












