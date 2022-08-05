package cf.indexfoundation.www;

public class method {
    public static void main(String[] args) {
        class Human{        //Creating a new class
            String name;
            int age;

            void talk(){        //Declaring a method with the type of 'void' which does not return anything
                System.out.println("My name is " + name + " and I am " + age + " years old.");
            }

            int calculate(int one, int two, int three){  //Declaring a method with the type of 'integer' which does return values but can't directly print
                return one * two * three;
            }
        }

        Human human1 = new Human();     //Declaring an object with the name human1
        Human human2 = new Human();     //Declaring an object with the name human2

        //Storing the values in the 'Human' class variables
        human1.name = "Rik The Noob";
        human1.age = 15;

        //Printing the values
        human1.talk();
        System.out.println(human1.calculate(5,4,2));
        System.out.println(human2.calculate(7,8,9));
    }
}
