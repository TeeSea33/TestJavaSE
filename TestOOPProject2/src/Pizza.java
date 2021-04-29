/**
 * @Auther:ChanHuiShan
 * @Date: 2021-03-31 - 03 - 31 - 9:50
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Pizza {
    private int size;//大小
    private String name;//名字
    private int price;//价格

    //set get方法
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getSize(){
        return size;
    }
    public  void setSize(int size){
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //展示披萨信息
    public String showPizza(){
        return "披萨的名字是"+name+",披萨的大小是"+size+"，披萨的价格是"+price+"元";
    }

    //构造器

    public Pizza(){

    }

    public Pizza(int size, String name, int price) {
        this.size = size;
        this.name = name;
        this.price = price;
    }
}
