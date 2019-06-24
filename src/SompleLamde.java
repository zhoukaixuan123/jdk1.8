import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/16$
 * @description lamde表达式$
 */
public class SompleLamde {

    public static void main(String[] args) {
        //new  Thread(()-> System.out.println("11")).start();
        ArrayList<Cart> carts = new ArrayList<>();
        carts.add(new Cart("丰田","红色","1000"));
        carts.add(new Cart("本田","绿色","1500"));
        carts.add(new Cart("奥迪","黑色","1000"));
        carts.add(new Cart("奔驰","白色","10010"));
        List<Cart> list = translateList(carts, cart -> cart.getName().equals("丰田"));

        System.out.println(list.toString());
    }


    public static List<Cart>  translateList(List<Cart> list, Predicate<Cart> cartPredicate){

       // ArrayList<Cart> carts = new ArrayList<>();
//        for (Cart cart : list) {
////            if(cart.equals("红色")){
////                carts.add(cart);
////            }
//            if(cartPredicate.test(cart)){
//                carts.add(cart);
//            }
//
//        }
        List<Cart> collect = list.stream().filter(cartPredicate).collect(Collectors.toList());
        return  collect;
    }


}

class  Cart{

    private  String Name;
    private  String color;
    private  String price;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Cart(String name, String color, String price) {
        Name = name;
        this.color = color;
        this.price = price;
    }
}
