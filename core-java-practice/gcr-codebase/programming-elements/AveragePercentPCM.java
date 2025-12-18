
public class AveragePercentPCM {
    public static void main(String[] args) {
        
        int physicsMarks = 95;
        int chemistryMarks = 96;
        int mathematicsMarks = 94;

        double totalMarks = physicsMarks + chemistryMarks + mathematicsMarks;
        double averagePercent = (totalMarks / 300) * 100;

        System.out.printf("Average Percentage in PCM:", averagePercent);

        
    }
}