
public class AveragePercentPCM {
    public static void main(String[] args) {
        
        int physicsMarks = 95;          // given marks in Question
        int chemistryMarks = 96;        // given marks in Question
        int mathematicsMarks = 94;         // given marks in Question

        double totalMarks = physicsMarks + chemistryMarks + mathematicsMarks;
        double averagePercent = (totalMarks / 300) * 100;            // calculate averagePercent by using formula

        System.out.printf("Average Percentage in PCM:", averagePercent);

        
    }
}