import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-31 - 03 - 31 - 11:22
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //选择要购买的pizza
        Scanner sc = new Scanner(System.in);
        System.out.println("选择你想要购买的匹萨（1.培根匹萨 2.水果披萨）：");
        int choice = sc.nextInt();
        //通过工厂来获取pizza
        Pizza pizza = PizzaStore.getPizza(choice);
        System.out.println(pizza.showPizza());
    }
}
