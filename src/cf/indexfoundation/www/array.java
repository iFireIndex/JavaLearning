package cf.indexfoundation.www;

public class array {
    public static void main(String[] args) {
        double[] testScore = {48.30, 45.2, 70.0, 85.50, 95.45, 78.45, 66.35, 25.26, 35.24, 48.12, 49.78};
        int arrayIndex = 0;

        while (arrayIndex < testScore.length){
            if (testScore[arrayIndex] > 80) {
                System.out.println("Good Score: " + testScore[arrayIndex]);
            } else if (testScore[arrayIndex] > 50 && testScore[arrayIndex] < 80) {
                System.out.println("Average Score: " + testScore[arrayIndex]);
            } else {
                System.out.println("Bad Score: " + testScore[arrayIndex]);
            }
            arrayIndex++;
        }
    }
}