import java.util.List;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/19$
 * @description $
 */
public class MyFunctionClass implements  MyFunction<Person> {

    @Override
    public boolean convert(Person person) {
        return person.getAge() > 50;
    }
}
