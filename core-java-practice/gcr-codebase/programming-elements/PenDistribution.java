public class PenDistribution {
     public static void main(String[] args) {
        
        int totalPens = 14;                     // Total number of pens
        int students = 3;                        // Total number of students

        int pensPerStudent = totalPens / students;   // Calculating pens per student
        int remainingPens = totalPens % students;    // Calculating remaining pens

        System.out.println("Each student gets " + pensPerStudent + " pens and the Remaining pens is " + remainingPens+ ".");
    }
}