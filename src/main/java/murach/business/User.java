package murach.business;

import java.io.Serializable;

public class User implements Serializable {

    private String firstName;
    private String lastName;
    private String email;
    private String dob;
    private String hearAbout;
    private String offers;
    private String emailOffers;
    private String contact;

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        dob = "";
        hearAbout = "";
        offers = "";
        emailOffers = "";
        contact = "";
    }

    public User(String firstName, String lastName, String email, 
                String dob, String hearAbout, String offers, 
                String emailOffers, String contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
        this.hearAbout = hearAbout;
        this.offers = offers;
        this.emailOffers = emailOffers;
        this.contact = contact;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }

    public String getHearAbout() { return hearAbout; }
    public void setHearAbout(String hearAbout) { this.hearAbout = hearAbout; }

    public String getOffers() { return offers; }
    public void setOffers(String offers) { this.offers = offers; }

    public String getEmailOffers() { return emailOffers; }
    public void setEmailOffers(String emailOffers) { this.emailOffers = emailOffers; }

    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }
}
