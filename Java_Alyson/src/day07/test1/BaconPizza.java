package day07.test1;

class BaconPizza extends Pizza {
    int baconGram; // 培根克数

    BaconPizza() {
    }

    public BaconPizza(String name, int price, int size, int baconGram) {
        super(name, price, size);
        this.baconGram = baconGram;
    }

    public int getBaconGram() {
        return baconGram;
    }

    public void setBaconGram(int baconGram) {
        this.baconGram = baconGram;
    }

    @Override
    public void show() {
        System.out.println("名称：" + super.getName());
        System.out.println("价格：" + super.getPrice() + "元");
        System.out.println("大小：" + super.getSize() + "寸");
        System.out.println("培根克数：" + baconGram);
    }
}
