public class User {
//    "id": 1,
//            "first_name": "Jeanette",
//            "last_name": "Penddreth",
//            "email": "jpenddreth0@census.gov",
//            "gender": "Female",
//            "ip_address": "26.58.193.2"

    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public User(int id, String first_name, String last_name, String email, String gender) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.gender = gender;
    }
}
