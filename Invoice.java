public class Invoice{
    private int invoiceId;
    private Date date;
    private float negotiatePrice;
    private float taxes;
    private float licenseFees;
    private float finalPrice;

    private Customer customer;
    private Salesperson salesperson;
    private Vehicle vehicle;
    private TradeinVehicle tradeinVehicle;
    private ArrayList<Options> options;

    public Invoice(Date date, float negotiatePrice, float taxes, float licenseFees, float finalPrice){
        this.date = date;
        this.negotiatePrice = negotiatePrice;
        this.taxes = taxes;
        this.licenseFees = licenseFees;
        this.finalPrice = finalPrice;
    }
    public Date getDate(){
        return this.date;
    }
    public float getNegotiatePrice(){
        return this.negotiatePrice;
    }
    public float getTaxes(){
        return this.taxes;
    }
    public float getLicenseFees(){
        return this.licenseFees;
    }
    public float getFinalPrice(){
        return this.finalPrice;
    }
}
