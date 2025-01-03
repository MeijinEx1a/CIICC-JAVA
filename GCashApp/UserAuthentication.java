package GCashApp;


class User {
    private int id;
    private String name, email, number, pin;

    public User(int id, String name, String email, String number, String pin) {
        this.id = id; this.name = name; this.email = email; this.number = number; this.pin = pin;
    }

    public int getId() { return id; }
    public String getEmail() { return email; }
    public String getPin() { return pin; }
    public void setPin(String pin) { this.pin = pin; }
    public String getName() { return name; }
}

public class UserAuthentication {
    
}
