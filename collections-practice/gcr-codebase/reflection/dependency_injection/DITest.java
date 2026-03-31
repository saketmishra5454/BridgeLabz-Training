package reflection.dependency_injection;

class DITest {

    public static void main(String[] args)
            throws Exception {
        UserApp app = new UserApp();

        DIContainer.inject(app);
        app.process();
    }
}

