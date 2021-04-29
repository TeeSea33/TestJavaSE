/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-30 - 03 - 30 - 19:27
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class FruitsPizza extends Pizza {
    //特有的属性：
    private String burdening;

    public String getBurdening() {
        return burdening;
    }

    public void setBurdening(String burdening) {
        this.burdening = burdening;
    }

    //重写showPizza的方法

    @Override
    public String showPizza() {
        return super.showPizza()+"\n你要加入的水果是"+burdening;
    }

    //构造器

    public FruitsPizza() {
    }

    public FruitsPizza(String name, int size, int price, String burdening) {
        super(name, size, price);
        this.burdening = burdening;

    }
}
