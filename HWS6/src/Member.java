public class Member {
   private String name;
    private String family;
    private String username;
    private String pass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setAll(String name, String family, String username, String pass) {
        this.name = name;
        this.family = family;
        this.username = username;
        this.pass = pass;
    }

}
