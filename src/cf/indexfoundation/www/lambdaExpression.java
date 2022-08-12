package cf.indexfoundation.www;
interface myInterface{
    int giveNumber();
}
interface myInterface2{
    double giveResult(double x, double y);
}

public class lambdaExpression {
    public static void main(String[] args) {
        //Lambda Expression with no arguments
        myInterface interface1 =  () -> 625;
        myInterface interface2 = () -> 12 * 4;

        //Lambda Expression with arguments
        myInterface2 adding = Double::sum;
        myInterface2 subtracting = (x, y) -> (x * 2) - y;

        //Displaying results
        System.out.println(interface1.giveNumber());
        System.out.println(interface2.giveNumber());

        System.out.println(adding.giveResult(5.5, 6.0));
        System.out.println(subtracting.giveResult(5.0, 2.0));
    }
}
