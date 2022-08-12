package cf.indexfoundation.www;

class Dog{
    String name;
    int age;

    public Dog(){
        this.name = null;
        this.age = -1;
    }
    public Dog(String name, int age) {      //This is a constructor
        this.name = name;
        this.age = age;
    }

    public String getName() {
        if (this.name == null){
            return "You did not provide with any name of the dog.";
        }
        return name;
    }

    public int getAge() {
        if (this.age == -1){
            System.out.println("You did not provide with any age of the dog.");
        }
        return age;
    }

    void talk() {
        System.out.println("Hi! I am " +this.name+ " the dog, nice to meet you.");
        System.out.println("I am " +this.age+ " years old.");
    }
}

public class objectAsParameters {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Larry", 8);
        Dog dog2 = new Dog();

        //Display the result
        dog1.talk();
        System.out.println("------------------------------------------");
        dog2.talk();
        System.out.println("------------------------------------------");
        System.out.println("Name: " +dog2.getName()+ " Age: " +dog2.getAge());
    }
}
