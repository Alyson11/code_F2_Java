package day07.test1;

class SeafoodPizza extends Pizza {
    String info;

    SeafoodPizza() {
    }

    public SeafoodPizza(String name, int price, int size, String info) {
        super(name, price, size);
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public void show() {
        System.out.println("名称：" + super.getName());
        System.out.println("价格：" + super.getPrice() + "元");
        System.out.println("大小：" + super.getSize() + "寸");
        System.out.println("配料：" + info);
    }
}
