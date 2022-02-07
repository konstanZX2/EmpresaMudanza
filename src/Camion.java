import java.util.LinkedList;
import java.util.Scanner;

public class Camion {

    public String matricula;
    public double volumenRemolque;
    public double pesoCamion;



    public Camion(String matricula, double volumenRemolque, double pesoCamion) {
        this.matricula = matricula;
        this.volumenRemolque = volumenRemolque;
        this.pesoCamion = pesoCamion;
    }

    private LinkedList<Paquete> PaquetesCamion = new LinkedList<Paquete>();

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getVolumenRemolque() {
        return volumenRemolque;
    }

    public void setVolumenRemolque(double volumenRemolque) {
        this.volumenRemolque = volumenRemolque;
    }

    public double getPesoCamion() {
        return pesoCamion;
    }

    public void setPesoCamion(double pesoCamion) {
        this.pesoCamion = pesoCamion;
    }

    public void cargaPaquete(Paquete paquete) {
        PaquetesCamion.add(paquete);


    }

    public boolean cabePaquete(Paquete paquete) {
        double pesoDisponible = pesoCamion - pesoCarga();


        return paquete.getPeso() <= pesoDisponible;
    }

    public double pesoDisponible(){
        return pesoCamion - pesoCarga();
    }

    public double pesoCarga(){
        double pesoCarga=0;
        for (Paquete paqueteCargado : paquetesCargados);
        pesoCarga += paqueteCargado.getPeso();
        return pesoCarga;
    }

    //Hacer lo mismo para volumen aqui...

    @Override
    public String toString() {
        return "Camion{" +
                "matricula='" + matricula + '\'' +
                ", volumenRemolque=" + volumenRemolque +
                ", pesoCamion=" + pesoCamion +
                ", PaquetesCamion=" + PaquetesCamion +
                '}';
    }

    public LinkedList<Paquete> paquetesCargados() {
        return new LinkedList<>(bultosCargados());
    }
    public void vaciar(){
        paquetesCargados().clear();
    }
}

