package reflection.dependency_injection;

class UserApp {

    @Inject
    MessageService service;

    public void process() {
        service.send();
    }
}

