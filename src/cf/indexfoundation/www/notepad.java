package cf.indexfoundation.www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class notepad {
    public static void main(String[] args) {
        InputStreamReader ir =new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        String[] myString = new String[50];

        System.out.println("Type your 1000 lines of story.");
        System.out.println("Type 'stop' to stop the the program.");

         try{
            for (int i = 0; i < 50; i++){
                myString[i] = br.readLine();
                if (myString[i].equalsIgnoreCase("stop")){
                    break;
                }
            }
             System.out.println("--------------------------------");
             System.out.println("This the stored by you");
             System.out.println("--------------------------------");

             for (int i = 0; i < 50; i++){
                 if (myString[i].equalsIgnoreCase("stop")){
                     break;
                 }
                 System.out.println(myString[i]);
             }
         }catch(IOException e){
             System.out.println(e);
         }

        System.out.println("Thanks for using my program.");
    }
}
