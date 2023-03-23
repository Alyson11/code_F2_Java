package day07.test1;

abstract class Pizza {
    // 属性：名称、价格、大小
    private String name;
    private int price;
    private int size;

    Pizza() {
    }

    public Pizza(String name, int price, int size) {
        this.name = name;
        this.price = price;
        this.size = size;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // 定义抽象方法：展示
    public abstract void show();

}
