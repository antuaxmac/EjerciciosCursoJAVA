public class SmartPhone extends SmartDevice {


    boolean sms;
    boolean phoneCalls;


    public SmartPhone() {
    }

    public SmartPhone(String brand, String model, int capacity, double price, boolean apps, boolean gps, boolean date_hour, boolean calendar, boolean useVoice, boolean sms, boolean phoneCalls) {
        super(brand, model, capacity, price, apps, gps, date_hour, calendar, useVoice);
        this.sms = sms;
        this.phoneCalls = phoneCalls;
    }

    public void makeCall(int phoneNumber) {
        System.out.println("Estás realizando una llamada al número" + " " + phoneNumber);

    }

    public void phoneFeatures() {
        if (apps = true) {
            String apps = "sí";
            if (gps = true) {
                String gps = "sí";
                if (date_hour = true) {
                    String date_hour = "sí";
                    if (calendar = true) {
                        String calendar = "sí";
                        if (useVoice = true) {
                            String useVoice = "sí";
                            if (sms = true) {
                                String sms = "sí";
                                if (phoneCalls = true) {
                                    String phoneCalls = "sí";


                                    System.out.println("Las características del " + brand + " " + model + " son:" +
                                            "\nMarca = " + brand +
                                            "\nModelo = " + model +
                                            "\nCapacidad = " + capacity + " gb" +
                                            "\nPrecio = " + price + " euros" +
                                            "\nApps = " + apps +
                                            "\nGPS = " + gps +
                                            "\nDía y Hora = " + date_hour +
                                            "\nCalendario = " + calendar +
                                            "\nUso por voz = " + useVoice +
                                            "\nSMS = " + sms +
                                            "\nLlamadas = " + phoneCalls);

                                }

                            }
                        }
                    }
                }
            }
        }
    }
}