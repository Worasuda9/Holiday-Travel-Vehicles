public class Vehicle{
    private String serialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private float baseCost;

    // private Invoice invoice;

    public Vehicle(String serialNumber, String name, String model, int year, String manufacturer, float baseCost) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }

    public String getSerialNumber(){ 
        return serialNumber; 
    }
    public String getName(){
        return name;
    }
    public String getModel(){ 
        return model; 
    }
    public int getYear(){ 
        return year; 
    }
    public String getManufacturer(){ 
        return manufacturer; 
    }
    public float getBaseCost(){ 
        return baseCost; 
    }
}
