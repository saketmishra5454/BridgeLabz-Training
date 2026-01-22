import java.util.*;

// Abstract base class for job roles
abstract class JobRole {
    private String candidateName;

    public JobRole(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateName() {
        return candidateName;
    }

    // every job role must implement its screening rule
    public abstract void screenCandidate();
}

// Subclass for Software Engineer
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName) {
        super(candidateName);
    }

    @Override
    public void screenCandidate() {
        System.out.println(getCandidateName() + " (Software Engineer) -> Screening: Requires DSA + Backend Skills");
    }
}

//  Subclass for Data Scientist
class DataScientist extends JobRole {
    public DataScientist(String candidateName) {
        super(candidateName);
    }

    @Override
    public void screenCandidate() {
        System.out.println(getCandidateName() + " (Data Scientist) -> Screening: Requires ML + Statistics Skills");
    }
}

//  Subclass for Product Manager
class ProductManager extends JobRole {
    public ProductManager(String candidateName) {
        super(candidateName);
    }

    @Override
    public void screenCandidate() {
        System.out.println(getCandidateName() + " (Product Manager) -> Screening: Requires Communication + Strategy Skills");
    }
}

// Generic Resume Class
// bounded type parameter: T MUST extend JobRole
class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public T getJobRole() {
        return jobRole;
    }
}

//  Screening Utility with Generic Method + Wildcards
class ScreeningPipeline {

    // Generic Method to process a single resume
    public static <T extends JobRole> Resume<T> analyzeResume(T role) {
        System.out.println("\nAnalyzing Resume for: " + role.getCandidateName());
        return new Resume<>(role);
    }

    // Wildcard method to handle ANY job role list
    public static void batchScreen(List<? extends JobRole> resumes) {
        System.out.println("\n=== Batch Screening Started ===");
        for (JobRole role : resumes) {
            role.screenCandidate(); // polymorphic call
        }
        System.out.println("=== Batch Screening Completed ===\n");
    }
}

// Main class for testing 
public class AiDrivenResumeScreeningSystem {
    public static void main(String[] args) {

        // Creating different candidate roles
        SoftwareEngineer c1 = new SoftwareEngineer("Saket");
        DataScientist c2 = new DataScientist("AbhiShek");
        ProductManager c3 = new ProductManager("Piyush");

        // Using generic method to analyze resumes
        Resume<SoftwareEngineer> r1 = ScreeningPipeline.analyzeResume(c1);
        Resume<DataScientist> r2 = ScreeningPipeline.analyzeResume(c2);
        Resume<ProductManager> r3 = ScreeningPipeline.analyzeResume(c3);

        // Putting all roles into a list for batch processing
        List<JobRole> resumeList = new ArrayList<>();
        resumeList.add(r1.getJobRole());
        resumeList.add(r2.getJobRole());
        resumeList.add(r3.getJobRole());

        // Using wildcard method to process any job role
        ScreeningPipeline.batchScreen(resumeList);
    }
}

