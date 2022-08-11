package cf.indexfoundation.www;

class Reference{
    int number1, number2;

    public Reference(){        //Setting the base value to the variables in the constructor
        number1 = 10;
        number2 = 20;
    }

    void fedData(Reference e){      //Setting the new value the same variables
        e.number1= 88;
        e.number2 = 99;
    }

    void displayData(){
        System.out.println("The first number is: " +number1+ " and the second number is: " +number2);
    }
}

public class methodByReference {
    public static void main(String[] args) {
        Reference ref1 = new Reference();

        //Display the result
        ref1.displayData();
        ref1.fedData(ref1);     //Setting the new data
        ref1.displayData();

    }
}
