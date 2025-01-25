public class User {

    private String fname;
    private String lname;
    private String email;

    // Default constructor
    public User() {
    }

    // Parameterized constructor
    public User(String fname, String lname, String email) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
    }

    // Getter for fname
    public String getFname() {
        return fname;
    }

    // Setter for fname
    public void setFname(String fname) {
        this.fname = fname;
    }

    // Getter for lname
    public String getLname() {
        return lname;
    }

    // Setter for lname
    public void setLname(String lname) {
        this.lname = lname;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

