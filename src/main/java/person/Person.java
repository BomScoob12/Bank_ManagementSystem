package person;

import java.util.Date;
import java.util.Objects;

public abstract class Person {
    private final String idCard;
    private String firstname;
    private String lastname;
    private String phone;
    private String email;

    private String userId;
    private String password;

    private Date registerDate;

    public Person(String idCard, String firstname, String lastname, String phone, String email, Date registerDate, String userId, String password){
        if (checkId(idCard)){
            this.idCard = idCard;
        } else {
            throw new IllegalArgumentException("Invalid ID cards or ID cards less than 10 digits.");
        }
        this.firstname = Objects.requireNonNull(firstname, "Firstname is required");
        this.lastname = Objects.requireNonNull(lastname, "Lastname is required");
        this.phone = phone;
        this.email = email;
        this.registerDate = registerDate;

        this.userId = userId;
        this.password = password;
    }

    private boolean checkId(String idCard) {
        return idCard.length() == 10 && !idCard.isBlank();
    }
}
