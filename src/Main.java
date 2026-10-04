void main() {

    ReproductorAudio reproductor = new ReproductorAudio();
    ControlRemoto control = new ControlRemoto(reproductor);

    control.reproducir();
    control.aumVolumen();
    control.disVolumen();
    control.pausar();
}