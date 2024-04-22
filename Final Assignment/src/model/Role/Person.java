package model.Role;

public class Person {
    private String username;
    private final RoleManager role;
    private final String password;
    public Person(RoleManager role) {
        this.role = role;
        this.password = "password";
    }
    public RoleManager getRole() {
        return role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
}
