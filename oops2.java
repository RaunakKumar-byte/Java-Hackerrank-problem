public class oops2 {
    public static void main(String args[]) {
        Bankaccount myAcc = new Bankaccount();
        myAcc.username = "Raunak Singh";
        System.out.println(myAcc.username);
        myAcc.setpassword("Raja");
        System.out.println(myAcc.getPassword());
    }
}

class Bankaccount {
    public String username; // Declare inside class block
    private String password; // Use private for encapsulation

    // Setter for password
    public void setpassword(String password) {
        this.password = password;
    }

    // Getter for password
    public String getPassword() {
        return this.password;
    }
}