public class BookMain {
    public static void main(String[] args) {

        Book b1 = new Book("Harry Potter", 400, "Rowling", "MSC");
        b1.setNumberOfPage(200);
        System.out.println(b1.getNumberOfPage());

        Book b2=new Book("Lord Of The Rin",500,"J.R.R. Tolkien","MSC");
        b2.setName("Lord Of The Rings");
        System.out.println(b2.getName());
    }
}
