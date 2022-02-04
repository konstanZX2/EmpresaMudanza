import java.util.Scanner;

public class Paquete {
    Scanner escaneado=new Scanner(System.in);

    private int Id(){
        System.out.println("Introduzca el ID del paquete");
        int idPaquete;
        idPaquete= escaneado.nextInt();
        return idPaquete;
    }




    private double Volumen(){
        System.out.println("Introduzca el volumen del paquete");
        double volumenPaquete;
        volumenPaquete= escaneado.nextDouble();
        return volumenPaquete;
    }



    private double Peso(){
        System.out.println("Introduzca el peso del paquete");
        double pesoPaquete;
        pesoPaquete= escaneado.nextDouble();
        return pesoPaquete;
    }

    private boolean Fragil(){
        System.out.println("Introduzca si es Fragil. 1 si es fragil, 0 si no es fragil.");
        boolean paqueteFragil=false;
        int fragil;
        fragil= escaneado.nextInt();
        if (fragil==1){paqueteFragil=true;}
        if (fragil==0){paqueteFragil=false;}
        return paqueteFragil;
    }








}
