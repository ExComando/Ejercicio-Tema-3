package openbootcam;

public class SmartPhone extends SmartDevice {

    int tamaño;
    String modelo;
    boolean camara;
    boolean linterna;
    String SO;

    public SmartPhone() {

    }

    public SmartPhone(int tamaño, boolean camara, boolean linterna, String SO, String modelo) {
        this.tamaño = tamaño;
        this.camara = camara;
        this.linterna = linterna;
        this.SO = SO;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "SmartPhone{" + "tama\u00f1o=" + tamaño + ", modelo=" + modelo + ", camara=" + camara + ", linterna=" + linterna + ", SO=" + SO + '}';
    }

    boolean concat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
