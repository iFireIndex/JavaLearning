package cf.indexfoundation.www;

public class methodOverloading {
    public static void main(String[] args) {

        class Subhajit{
            void findSum(){     //This is the default method.
                System.out.println("You did not provide any numbers");
            }
            int findSum(int x, int y){      //This is the first method. The method name is findSum.
                return (x * y);
            }
            int findSum(int x, int y, int z){       //This is the second Method. The name is the same as above, this is called method overloading. you just need to specify more arguments than other method.
                int multiply = (x * y * z);
                return multiply;
            }
        }

        Subhajit oneResult = new Subhajit();

        oneResult.findSum();
        System.out.println(oneResult.findSum(5,8));
        System.out.println(oneResult.findSum(6,2,8));
    }
}
