/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/30$
 * @description 策略模式$
 * 开闭原则    扩展开放  修改关闭
 * 里氏替换    子类独立 尽量不重写父类方法
 * 依赖倒置     尽量不与具体实现类发生依赖  也就是 尽量使用接口（面向接口编程）
 * 接口隔离     一口接只实现意见事 相互不影响   （接口中不要过度臃肿）
 *单一职责      一个类或者方法  之作一件事
 *迪米特        也叫最少知识原则   尽量不与具体实现类发生依赖
 *
 *
 */
public class Test55 {


    public static void main(String[] args) {

        System.out.println(new  Context(new SpearkPerson()).getResult(15,20));
        System.out.println(new  Context(new SpearkDog()).getResult(30,20));
    }
}


interface Speark{

    int getNumber(int a,int b);
}

class SpearkPerson implements  Speark{

    @Override
    public int getNumber(int a, int b) {
        return a+b;
    }
}
class SpearkDog implements Speark{

    @Override
    public int getNumber(int a, int b) {
        return a-b;
    }
}
class Context{

    private  Speark spearkPerson;

    public Context( Speark a){
        this.spearkPerson = a;
    }

    public int getResult(int a,int b){
        return  spearkPerson.getNumber(a,b);
    }
}