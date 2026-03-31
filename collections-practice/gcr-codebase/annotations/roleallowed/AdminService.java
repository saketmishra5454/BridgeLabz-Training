package annotations.roleallowed;

class AdminService {

    @RoleAllowed("ADMIN")
    public void delete() {

        System.out.println("Data Deleted");
    }
}

