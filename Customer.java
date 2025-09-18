public class Customer{
    private int customerId;
    private String name;
    private String address;
    private String phone;

    private ArrayList<Invoice> invoices;

    public Customer(int customerId, String name, String address, String phone){
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public int getCustomerID(){ 
        return this.customerId; 
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public String getPhone(){
        return this.phone;
    }
}
