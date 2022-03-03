public class BookTest {
    public static void main(String args[]){

        Author[] authors = new Author[3];
        authors[0] = new Author("Nano Yulian P.", "nano@bps.go.id", 'm');
        authors[1] = new Author("Wa Ode Zuhayeni M.", "yeni@bps.go.id", 'f');
        authors[2] = new Author("Fathir Maula. S", "piter@bps.go.id", 'f');

        System.out.println(authors[0]);
        System.out.println(authors[1]);
        System.out.println(authors[2]);
    
        Book javaDummy = new Book("Java for Dummies", authors, 35000, 99);
        System.out.println(javaDummy.getAuthorNames());
        System.out.println(javaDummy);  // toString()
        //javaDummy.toMyString();
    }
}

