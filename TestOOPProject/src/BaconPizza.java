/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-30 - 03 - 30 - 19:30
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class BaconPizza extends Pizza{
    //特有的属性
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    //重写showPizza的方法

    @Override
    public String showPizza() {
        return "培根的克数是"+weight+"g\n"+super.showPizza();
    }

    //构造器

    public BaconPizza() {
    }

    public BaconPizza(String name, int size, int price, int weight) {
        super(name, size, price);
        this.weight = weight;
    }
}
