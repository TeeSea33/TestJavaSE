import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.sound.midi.Soundbank;
import java.awt.*;
import java.util.Scanner;

/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-30 - 03 - 30 - 19:32
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //选择购买的pizza
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择你想要购买的pizza（1.培根匹萨 2.水果披萨）：");
        int choice = sc.nextInt();
        //通过工厂获取pizza
        Pizza pizza = PizzaStore.getPizza(choice);
        System.out.println(pizza.showPizza());
        System.out.println();


    }
}
