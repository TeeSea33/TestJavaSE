import java.util.Scanner;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-31 - 03 - 31 - 10:35
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class PizzaStore {
    public static Pizza getPizza(int choice){
        Pizza p = null;
        Scanner sc = new Scanner(System.in);
        switch(choice){
            case 1:{
                System.out.println("请录入培根的克数");
                int weight = sc.nextInt();
                System.out.println("请录入匹萨的大小");
                int size = sc.nextInt();
                System.out.println("请录入匹萨的价格");
                int price = sc.nextInt() ;//
                //将录入的信息封装为培根匹萨的对象
                BaconPizza bp = new BaconPizza(size,"培根匹萨" ,price,weight);
                p = bp;
            }break;
            case 2:{
                System.out.println("请录入水果披萨的种类");
                String burdening = sc.next();
                System.out.println("请录入披萨的大小：");
                int size = sc.nextInt();
                System.out.println("请录入匹萨的价格");
                int price = sc.nextInt();
                //将录入的信息封装为水果披萨的对象
                FruitsPizza fp = new FruitsPizza(size,"水果披萨",price,burdening);
                p = fp;
            }break;
        }
        return p;
    }

}
