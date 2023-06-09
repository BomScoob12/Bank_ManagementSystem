package person;

import java.time.LocalDateTime;

public abstract class Person {
    private final String id;
    private String firstname;
    private String lastname;
    private String contactNumber;
    private String email;
    private String address;
    private final LocalDateTime registerDate;

    //username and password (password should be hash before store into database)
    private String username;
    private String passhash;

    public Person(String id, String firstname, String lastname, String contactNumber, String email, String address, LocalDateTime registerDate, String username, String passhash) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.contactNumber = contactNumber;
        this.email = email;
        this.address = address;
        this.registerDate = registerDate;
        this.username = username;
        this.passhash = passhash;
    }

    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }

    public String getUsername() {
        return username;
    }

    public String getPasshash() {
        return passhash;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPasshash(String passhash) {
        this.passhash = passhash;
    }
}
