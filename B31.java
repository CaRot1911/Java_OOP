class Author{
    private String name;
    private String email;
    public Author(String name,String email){
        this.name = name;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
class Book{
    private String name;
    private Author[] authors;
    private double price;
    public Book(String name,Author[] authors,double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public String getAuthorNames(){
        String authorNames = "";
        for (int i=0;i<authors.length-1;i++){
            authorNames += authors[i].getName()+ ", ";
        }
        authorNames+= authors[authors.length-1].getName();
        return authorNames;
    }
}
public class B31 {
    public static void main(String[] args) {
        Author[] authors = new Author[3];
        authors[0] = new Author("Viet", "VietCV@codelearn.io");
        authors[1] = new Author("Tuan", "TuanLQ@codelearn.io");
        authors[2] = new Author("Kien", "KienNT@Codelearn.io");

        Book book1 = new Book("C++ for Beginners", authors, 210000);
        System.out.println(book1.getAuthorNames());
    }
}
