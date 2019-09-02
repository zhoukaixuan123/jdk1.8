/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/7/14$
 * @description 工厂模式
 */

/**
 * 抽象接口类
 */
public interface Test60 {

    String getName();

    String color();

}

/**
 * 工厂实现类
 */
class  DogLbld implements Test60{

    @Override
    public String getName() {
        return "拉布拉多";
    }

    @Override
    public String color() {
        return "白色";
    }
}
class DogJm implements  Test60{

    @Override
    public String getName() {
        return "金毛";
    }

    @Override
    public String color() {
        return "黄色";
    }

    public String noise(){
        return "旺旺";
    }
}
interface DogFactory {
    DogLbld getDog();

}
class DogFactoryImpl implements DogFactory {


    public DogLbld getDog() {
        return new DogLbld();
    }

    public DogJm getDogJm() {
        return new DogJm();
    }
}

class demo{
    public static void main(String[] args) {
        DogFactoryImpl factory = new DogFactoryImpl();
        DogLbld dog = factory.getDog();
        System.out.println(dog.getName());
        System.out.println(dog.color());
        System.out.println("=====================================");
        DogJm jm = factory.getDogJm();
        System.out.println(jm.getName());
        System.out.println(jm.color());
        System.out.println(jm.noise());
    }
}