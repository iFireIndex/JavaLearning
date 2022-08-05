package cf.indexfoundation.www;

public class method {
    public static void main(String[] args) {
        class Human{        //Creating a new class
            String name;
            int age;

            void talk(){        //Declaring a method
                System.out.println("My name is " + name + " and I am " + age + " years old.");
            }
        }

        Human human1 = new Human();     //Declaring an object

        //Storing the values in the 'Human' class variables
        human1.name = "Rik The Noob";
        human1.age = 15;

        //Printing the values
        human1.talk();
    }
}
