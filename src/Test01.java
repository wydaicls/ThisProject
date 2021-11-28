/**
 * @Author:王亚栋
 * @Date:2021/7/31 13:12
 * @Version:1.0
 */
public class Test01 {

    public static void main(String[] args) {

        Dog dog = new Dog("王亚栋", 20);
        dog.info();
    }
}

class Dog{

    String name;

    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void info(){
        System.out.println(name + "\t" + age +"\t");
    }
}
