package javacombined319.usinggenerics;

//I need to pass a type and that type should be covered all variables or objects
//
public class GenericClassDemo<T> {
    T name;
    T age;

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }

    void setName(T name) {
        this.name = name;
    }

    public T getName() {
        return this.name;
    }

    public static void main(String[] args) {
        GenericClassDemo<String> genericClassDemo = new GenericClassDemo();
        genericClassDemo.setName("Rahul");
        genericClassDemo.setAge("22");
        System.out.println(genericClassDemo.getName() + "\t" +
                genericClassDemo.getAge());
    }
}
