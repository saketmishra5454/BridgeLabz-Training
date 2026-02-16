package functionalInterface.dataserialization;

// This class is marked for backup
class UserData implements Backupable {

    String name;
    int id;

    UserData(String name, int id) {

        this.name = name;
        this.id = id;
    }
}

