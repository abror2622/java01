package lesson4;

public class Tarnary {
    public static void main(String[] args) {
        int money = 100;
        int breadPrice = 60;
        int monyAfterShopping = money - breadPrice;
        int childMoney = monyAfterShopping >= 50 ? 10 : 5;
        monyAfterShopping -= monyAfterShopping >= 50 ? 10 : 5;

        System.out.println(childMoney);
        System.out.println(monyAfterShopping);

//        if (monyAfterShopping >= 50) {
//            childMoney = 10;
//            monyAfterShopping -= 10;
//        } else {
//            childMoney = 5;
//            monyAfterShopping -= 5;
//        }
    }
}
