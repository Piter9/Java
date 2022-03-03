public class TestPerson{
    public static void main(String[] args){
    
    //Person
        Person p1 = new Person("Fathir Maula. S", "Pekanbaru");
        System.out.println(p1);
        System.out.println(p1.getName());
        System.out.println(p1.getAddress());
        p1.setAddress("Riau");
        System.out.println(p1);
        System.out.println();
        
    //Student
        Student a1 = new Student("Piter","PKU","Statistika",2022, 250000);
        System.out.println(a1);
        System.out.println(a1.getProgram());
        System.out.println(a1.getYear());
        System.out.println(a1.getFee());
        a1.setProgram("Kedokteran");
        a1.setYear(2025);
        a1.setFee(2500000);
        System.out.println(a1);
        System.out.println();

    //Staff
        Staff s1 = new Staff("Parker","London","STIS",9999);
        System.out.println(s1);
        System.out.println(s1.getSchool());
        System.out.println(s1.getPay());
        s1.setSchool("STAN");
        s1.setPay(99999);
        System.out.println(s1);
    }
}