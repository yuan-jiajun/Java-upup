package test3;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/2/7 17:37
 */

abstract class CarClass {
    abstract String getName();

    abstract int getPrice();
}

class BMW extends CarClass {
    @Override
    public String getName() {
        return "BMW";
    }

    @Override
    public int getPrice() {
        return 300000;
    }
}

class CheryQQ extends CarClass {
    public String getName() {
        return "CherryQQ";
    }

    public int getPrice() {
        return 20000;
    }
}

public class CarShopClass {
    private static int money = 0;

    public void sellCar(CarClass carClass) {
        System.out.println("车型:" + carClass.getName() + " 单价: " + carClass.getPrice());
        money += carClass.getPrice();
    }

    public int getMoney() {
        return money;
    }

    public static void main(String[] args) {
        CarShopClass aShop = new CarShopClass();
        aShop.sellCar(new BMW());
        aShop.sellCar(new CheryQQ());
        System.out.println("总收入: " + aShop.getMoney());
    }
}