public class ControlRemoto {

    private ReproductorAudio reproductor;

    public ControlRemoto(ReproductorAudio reproductor){

        this.reproductor = reproductor;

    }

    public void reproducir(){

        reproductor.play();

    }

    public void pausar(){

        reproductor.pause();

    }

    public void aumVolumen(){

        reproductor.subirVolumen(5);

    }

    public void disVolumen(){

        reproductor.bajarVolumen(3);

    }
}
