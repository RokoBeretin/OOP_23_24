package pckg_uml;

public class User {
    private int id;
    private String userName;
    private String mail;
    private String password;
    private static int cntId = 100;

    public User(String userName, String mail, String password) {
        this.id = cntId++;
        this.userName = userName;
        this.mail = mail;
        this.password = password;
    }
    public boolean logIn(String pswd, String usNme){

        return true;
    }
    public boolean activateAccount(){

        return true;

    }

}
