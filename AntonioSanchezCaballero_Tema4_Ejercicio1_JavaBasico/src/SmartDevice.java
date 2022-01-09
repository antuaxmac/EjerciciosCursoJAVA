public abstract class SmartDevice {


    String brand;
    String model;
    int capacity;
    double price;
    boolean apps;
    boolean gps;
    boolean date_hour;
    boolean calendar;
    boolean useVoice;


    public SmartDevice() {
    }

    public SmartDevice(String brand, String model, int capacity, double price, boolean apps, boolean gps, boolean date_hour, boolean calendar, boolean useVoice) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.price = price;
        this.apps = apps;
        this.gps = gps;
        this.date_hour = date_hour;
        this.calendar = calendar;
        this.useVoice = useVoice;
    }

    }
