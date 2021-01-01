import java.util.Date;

public class Student {
    private String fullName;
    private Date dateOfBirth;
    private String address;

    public Student() {
    }

    public Student(String fullName, Date dateOfBirth, String address) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }
}
