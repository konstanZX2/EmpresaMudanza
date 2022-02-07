import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Paquete paquete1 = new Paquete(1, 22, 30, true);
        Paquete paquete2 = new Paquete(2, 32, 23.22, false);
        Paquete paquete3 = new Paquete(3, 32, 21, false);
        Camion camion1 = new Camion("2323ACC", 60, 90);





        if (camion1.cabePaquete(paquete1))
            camion1.cargaPaquete(paquete1);

        camion1.cargaPaquete(paquete2);
        camion1.cargaPaquete(paquete3);


        Mudanza mudanza = new Mudanza(1,2);
        mudanza.setCamion(camion1);
        mudanza.incluyePaquete(paquete1);
        mudanza.incluyePaquete(paquete2);
        mudanza.incluyePaquete(paquete3);
    }
}
