package annotations;

public class LegacyAPI {

    // Old method
    @Deprecated
    public void oldFeature() {

        System.out.println("This is old feature");
    }

    // New method
    public void newFeature() {
        System.out.println("This is new feature");
    }
    public static void main(String[] args) {

        LegacyAPI api = new LegacyAPI();
        // Calling old method
        api.oldFeature();

        // Calling new method
        api.newFeature();
    }
}

