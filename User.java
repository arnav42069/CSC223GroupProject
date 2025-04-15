public class User {
    private String type;
    private String name;
    private String username;
    private String password;

    public User(String name, String username, String password) {
        this.name = name;
        this.ID = ID;
        this.password = password;
    }

    public User(){
        this.name = "";
        this.ID = 0;
        this.password = "";
    }

    public User(String name){
        this.name = name;
        this.ID = 0;
        this.password = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLogin(String password, String username){
        this.password = password;
        this.username = username;
    }

     public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
