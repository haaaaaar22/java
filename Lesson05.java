import java.util.Scanner;

public class Lesson05 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("所持金を入力：");
        int money = scanner.nextInt();
        System.out.print("購入金額を入力：");
        int price = scanner.nextInt();
        int change = money - price;
        if(money >= price){
            System.out.println("購入できます。");
        System.out.println("残金は" + change + "円");
        }else{
            System.out.println("お金が足りません。");
        }

        scanner.close();
    }
}