package lesson4;

public class Client {
    private long id;
    private String fullName;

    public Client(long id, String fullName){
        this.fullName = fullName;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setId(long id) {
        this.id = id;
    }
}
