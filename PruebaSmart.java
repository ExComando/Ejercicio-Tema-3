package openbootcam;

public class PruebaSmart {

    public static void main(String[] args) {

        SmartDevice equipo = new SmartDevice(true, true, true, true);

        SmartPhone celu = new SmartPhone(25, true, true, "IOS", "gama alta");

        SmartDevice tele = new SmartWatch(50, "aurora", "android", true);

        celu.wifi = true;
        celu.usb = true;
        celu.telefoniaMovil = true;
        celu.bluetooth = true;

        tele.bluetooth = true;
        tele.telefoniaMovil = true;
        tele.usb = true;
        tele.wifi = true;

        System.out.println(celu);
        System.out.println(tele);

    }

}
