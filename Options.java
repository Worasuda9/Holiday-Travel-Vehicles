public class Options{
    private String optionCode;
    private String description;
    private float price;

    private ArrayList<Invoice> invoices;

    public Options(String optionCode, String description, float price){
        this.optionCode = optionCode;
        this.description = description;
        this.price = price;
    }
    public String getOptionCode(){
        return this.optionCode;
    }
    public String getDescription(){
        return this.description;
    }
    public float getPrice(){
        return this.price;
    }
}
