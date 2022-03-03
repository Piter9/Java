public class InvoiceTest {

    public static void main(String[] args) {

        Customer c1 = new Customer(222011503, "Fathir Maula. S", 90);

        System.out.println(c1);

        c1.getName();
        c1.getId();

        Invoice a = new Invoice(222011503, c1, 10000);
        
        System.out.println(a.getCustomerName());
        System.out.println(a);
        System.out.println(a.getAmountAfterDiscount());

    }
}
 
    
         