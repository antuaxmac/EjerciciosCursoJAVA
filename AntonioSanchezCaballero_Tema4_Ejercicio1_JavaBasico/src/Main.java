public class Main {

    public static void main(String[] args) {

        SmartPhone iPhone13 = new SmartPhone("iPhone", "13", 128, 1250.50, true, true, true, true, true, true, true);

        SmartWatch MiXiaomi = new SmartWatch("Xiaomi", "25v2", 32, 69.75, false, true, true, true, false, 7, 2.5);

        System.out.println("El móvil " + iPhone13.brand + " " + iPhone13.model + " es el último modelo de Apple");
        System.out.println("El reloj MiXiaomi es sumergible hasta " + MiXiaomi.submersible + " metros de profundidad ");


        iPhone13.makeCall (687958366);

        iPhone13.phoneFeatures();

        MiXiaomi.watchFeatures();

   }


}