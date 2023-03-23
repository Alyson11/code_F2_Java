package day11.Test2;

import java.util.Objects;

public class Book{
    //属性：编号，名称，单价，出版社
    private String id;
    private String name;
    private int price;
    private String press;

    public Book() {
    }

    public Book(String id, String name, int price, String press) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.press = press;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price && Objects.equals(id, book.id) && Objects.equals(name, book.name) && Objects.equals(press, book.press);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, press);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", press='" + press + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Book o) {
//        if(this.price<o.price){
//            return -1;
//        } else if (this.price>o.price) {
//            return 1;
//        } else {
//            return 0;
//        }
//    }
}
