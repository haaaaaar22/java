public class Lesson02 {
    public static  void main(String[] args){
        int money = 3000;
        int price = 500;
        int price2 = 800;
        int price3 = 350;
        int balance = money - price - price2 - price3;
        int pricefull = price + price2 + price3;

        System.out.println("所持金" + money + "円");
        System.out.println("購入金額" + pricefull + "円");
        System.out.println("残金" + balance + "円");
    }
}
