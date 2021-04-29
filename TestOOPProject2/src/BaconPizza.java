/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-31 - 03 - 31 - 10:59
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class BaconPizza extends Pizza {
    //属性：
    private int weight;

    //方法：

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //构造器：

    public BaconPizza() {
    }

    public BaconPizza(int size, String name, int price, int weight) {
        super(size, name, price);
        this.weight = weight;
    }
    //重写shoupizza方法
    //重写pizza方法
    @Override

    public String showPizza() {
        return super.showPizza()+"，培根的克数是"+weight;
    }
}
