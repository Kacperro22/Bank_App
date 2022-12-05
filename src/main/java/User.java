public class User {

    private String name;
    private String lastName;
    private String nickName;
    private int pesel;
    private int accountNumber;
    private double balance = 100;

    public User(String name, String lastName, int pesel){
        this.name = name;
        this.lastName = lastName;
        this.pesel = pesel;
    }


}
