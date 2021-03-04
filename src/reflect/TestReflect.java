package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Create By chengming on 2020/3/27 17:02
 */
public class TestReflect {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
        Person person = new Person();
        person.age = 11;
        person.name = "zhangsan";
        test(person);
    }
    public static void test(Object object) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> aClass = object.getClass();

        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field f: declaredFields){
            System.out.println(f.getType());
            System.out.println(f.getName());
        }
        Field age = aClass.getDeclaredField("age");
        System.out.println("年龄："+age.getName());
        Method speak = aClass.getDeclaredMethod("speak");
        speak.setAccessible(true);
        speak.invoke(object);
    }
}
class Person{
    int age;
    String name;
    private void speak(){
        System.out.println("hello");
    }
}
