public class ReproductorAudio {

    int volumenActual;
    String estado;

    public ReproductorAudio(){

        volumenActual = 0;

        estado = "detenido";


    }

    void play(){

        estado = "reproduciendo";
        System.out.println(estado);
    }
    void pause(){

        estado = "pausado";
        System.out.print(estado);
    }

    void subirVolumen(int cantidad) {

        if (volumenActual < 100) {

            volumenActual = volumenActual + cantidad;

            if (volumenActual > 100) {
                volumenActual = 100;
            }

            System.out.println("Volumen: " + volumenActual);
        }
    }

    void bajarVolumen(int cantidad) {

        if (volumenActual > 0) {

            volumenActual = volumenActual - cantidad;

            if (volumenActual < 0) {
                volumenActual = 0;
            }

            System.out.println("Volumen: " + volumenActual);
        }
    }

}

