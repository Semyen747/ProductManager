public class Book extends Product {
    private String author;
//здесь ид, наименование, цена
    public Book(int id, String name, int price, String author) {
        super(id, name, price);
        this.author = author;
    }

    public String toString() {
        return id + " " + name + " " + price + " " + author;
    }
}