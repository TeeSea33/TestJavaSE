/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-31 - 03 - 31 - 11:16
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class FruitsPizza extends Pizza {

    private String burdening ;//水果的种类
    //方法


    public String getBurdening() {
        return burdening;
    }

    public void setBurdening(String burdening) {
        this.burdening = burdening;
    }

    //构造器
    public FruitsPizza(){

    }

    public FruitsPizza(int size, String name, int price, String burdening) {
        super(size, name, price);
        this.burdening = burdening;
    }
    //重写showPizza方法

    @Override
    public String showPizza() {
        return super.showPizza()+",水果的种类是"+burdening;

    }
}
