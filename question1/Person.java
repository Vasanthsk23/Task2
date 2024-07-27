package question1;

public class Person
{

   private String name;
   private int age = 18;

    public int getAge() {
        return this.age;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String getName(){
        return this.name;
    }

    public Person(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public Person(){

    }
    public static void main(String[] args) {
        Person obj = new Person("Vasantha Kumar S K",18);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());

    }
}