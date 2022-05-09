package openbootcam;

public class SmartWatch extends SmartDevice {

    int tamano;
    String modelo;
    String SO;
    boolean USB;

    public SmartWatch() {
    }

    public SmartWatch(int tamano, String modelo, String SO, boolean USB) {
        this.tamano = tamano;
        this.modelo = modelo;
        this.SO = SO;
        this.USB = USB;
    }

    @Override
    public String toString() {
        return "SmartWatch{" + "tamano=" + tamano + ", modelo=" + modelo + ", SO=" + SO + ", USB=" + USB + '}';
    }
    

}


