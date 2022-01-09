public class SmartWatch extends SmartDevice{


    int sportMode;
    double submersible;


    public SmartWatch() {
    }

    public SmartWatch(String brand, String model, int capacity, double price, boolean apps, boolean gps, boolean date_hour, boolean calendar, boolean useVoice, int sportMode, double submersible) {
        super(brand, model, capacity, price, apps, gps, date_hour, calendar, useVoice);
        this.sportMode = sportMode;
        this.submersible = submersible;
    }

    public void watchFeatures() {
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
                                            "\nModo deportes = " + sportMode +
                                            "\nSumergible = " + submersible +  " m");

                                }

                            }
                        }
                    }
                }
            }
        }

