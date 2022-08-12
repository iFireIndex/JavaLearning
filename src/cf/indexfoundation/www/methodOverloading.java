package cf.indexfoundation.www;

public class methodOverloading {
    public static void main(String[] args) {

        class Subhajit{
            int findSum(int x, int y){      //The method name is findSum.
                return (x * y);
            }
            int findSum(int x, int y, int z){       //Method name is the same as above, this is called method overloading. you just need to specify more arguments than other method.
                int multiply = (x * y * z);
                return multiply;
            }
        }

        Subhajit oneResult = new Subhajit();

        System.out.println(oneResult.findSum(5,8));
        System.out.println(oneResult.findSum(6,2,8));
    }
}
