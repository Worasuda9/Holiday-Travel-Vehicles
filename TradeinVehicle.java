public class TradeinVehicle{
    private int tradeinId;
    private String serialNumber;
    private String make;
    private String model;
    private int year;
    private float allowance;

    private Invoice invoice;

    public TradeinVehicle(int tradeinId, String serialNumber, String make, String model, int year, float allowance){
        this.tradeinId = tradeinId;
        this.serialNumber = serialNumber;
        this.make = make;
        this.model = model;
        this.year = year;
        this.allowance = allowance;
    }
    public getTradeinID(){
        return this.tradeinId;
    }
    public getSerialNumber(){
        return this.serialNumber;
    }
    public getMake(){
        return this.make;
    }
    public getModel(){
        return this.model;
    }
    public getYear(){
        return this.year;
    }
    public getAllowance(){
        return this.allowance;
    }
}
