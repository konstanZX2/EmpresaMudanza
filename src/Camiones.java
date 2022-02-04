import java.util.Scanner;

public class Camiones {
    Scanner escaneado = new Scanner(System.in);
    private String Matricula(){
        System.out.println("Introduce la matricula del camion");
        String matriculaCamion;
        matriculaCamion= escaneado.next();
        return matriculaCamion;
    }

    private double Remolque() {
        System.out.println("Introduce el volumen maximo del remolque");
        double volumenMaximoRemolque;
        volumenMaximoRemolque=escaneado.nextDouble();
        return volumenMaximoRemolque;
    }


    private double PesoCamion() {
        System.out.println("Introduce el peso maximo del camion");
        double pesoMaximoTransporte;
        pesoMaximoTransporte = escaneado.nextDouble();
        return pesoMaximoTransporte;
    }



}

