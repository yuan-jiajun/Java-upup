package test2;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/2/7 17:37
 */

interface CarInterface {
    String getName();

    int getPrice();
}

class BMW implements CarInterface {
    public String getName() {
        return "BMW";
    }
    public int getPrice() {
        return 300000;
    }
}

class CheryQQ implements CarInterface {
    public String getName() {
        return "CherryQQ";
    }

    public int getPrice() {
        return 20000;
    }
}

public class CarShopInterface {
    private static int money = 0;

    public void sellCar(CarInterface carInterface) {
        System.out.println("车型:" + carInterface.getName() + " 单价: " + carInterface.getPrice());
        money += carInterface.getPrice();
    }

    public int getMoney() {
        return money;
    }

    public static void main(String[] args) {
        CarShopInterface aShop = new CarShopInterface();
        aShop.sellCar(new test2.BMW());
        aShop.sellCar(new test2.CheryQQ());
        System.out.println("总收入: " + aShop.getMoney());
    }
}