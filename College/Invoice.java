public class Invoice{

    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount){
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId(){
        return id;
    }

    public Customer getCustomer(){
        return customer;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public double amount(){
        return amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public int getCustomerId(){
        return getCustomer().getId();
    }

    public String getCustomerName(){
        return getCustomer().getName();
    }

    public int getCustomerDiscount(){
        return getCustomer().getDiscount();
    }

    public double getAmountAfterDiscount(){
        return (100-getCustomer().getDiscount())*amount/100;
    }

    public String toString(){
        return "Invoice[id="+id+",customer="+getCustomer().toString()+",amount="+amount+"]";
    }
}