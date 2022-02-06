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


}

