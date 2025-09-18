public class Salesperson{
    private int salespersonId;
    private String name;
    private String phone;

    private ArrayList<Invoice> invoices;

    public Salesperson(int salespersonId, String name, String phone){
        this.salespersonId = salespersonId;
        this.name = name;
        this.phone = phone;
    }
    public int getSalespersonId(){
        return this.salespersonId;
    }
    public String getName(){
        return this.name;
    }
    public String getPhone(){
        return this.phone;
    }
}
