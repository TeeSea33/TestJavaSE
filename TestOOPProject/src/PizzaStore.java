import java.util.Scanner;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-30 - 03 - 30 - 20:02
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class PizzaStore {
    public static Pizza getPizza(int choice){
        Pizza p = null;
        Scanner sc = new Scanner(System.in);
        switch (choice){
            case 1: {
                System.out.println("请录入培根的克数");
                int weight = sc.nextInt();
                System.out.println("请录入匹萨的大小");
                int size = sc.nextInt();
                System.out.println("请录入匹萨的价格");
                int price = sc.nextInt() ;
                //将录入的信息封装为培根匹萨的对象
                BaconPizza bp = new BaconPizza("培根匹萨",size,price,weight);
                p = bp;
            }break;
            case 2: {
                System.out.println("请录入你想要加入的水果");
                String burdening = sc.next();
                System.out.println("请录入匹萨的大小");
                int size = sc.nextInt();
                System.out.println("请录入匹萨的价格");
                int price = sc.nextInt();
                //将录入的信息封装为水果匹萨的对象
                FruitsPizza fp = new FruitsPizza("水果披萨",size,price,burdening);
                p = fp;
            }break;

        }
        return p;

    }
}
