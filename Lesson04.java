public class Lesson04 {
    public static void main(String[] args) {
        int money = 2000;
        int price = 600;
        int price2 = 700;
        int totalPrice = price + price2;
        System.out.println("購入金額" + totalPrice + "円");
        if (money < totalPrice){
            System.out.println("お金が足りません");
        } else{
            System.out.println("購入できます");
        }
    }
}
