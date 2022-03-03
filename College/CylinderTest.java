public class CylinderTest{
    public static void main(String[] args){

        //Circle
        Circle c1 = new Circle(10,"red");
        System.out.println(c1);
        
        //Cylinder
        Cylinder cc1 = new Cylinder(20,c1);
        System.out.println(cc1);

        c1.setColor("Black");
        cc1.setHeight(15);

        System.out.println(cc1);
        System.out.println(c1);
    }
}