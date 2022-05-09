/*En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
Agregaréis atributos tal cual tendrían esos objetos en la realidad.
Crear constructor vacío y con todos los parámetros para cada clase.
Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.*/
package openbootcam;

public class SmartDevice {

    boolean bluetooth;
    boolean wifi;
    boolean telefoniaMovil;
    boolean usb;

    public SmartDevice() {
    }

    public SmartDevice(boolean bluetooth, boolean wifi, boolean telefoniaMovil, boolean usb) {
        this.bluetooth = bluetooth;
        this.wifi = wifi;
        this.telefoniaMovil = telefoniaMovil;
        this.usb = usb;
    }

    @Override
    public String toString() {
        return "SmartDevice{" + "bluetooth=" + bluetooth + ", wifi=" + wifi + ", telefoniaMovil=" + telefoniaMovil + ", usb=" + usb + '}';
    }

   
    
    
}

    

   


