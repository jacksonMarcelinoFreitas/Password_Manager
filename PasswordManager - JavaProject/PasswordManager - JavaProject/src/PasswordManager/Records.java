package PasswordManager;

public class Records {
    
    private User user;
    private Login login;
    private Password password;
    
    public Records(){  
    }
    
    public Records(User user, Login login, Password password){
        this.user = user;
        this.login = login;
        this.password = password;
    }
    
    public void Relatorio(){
        System.out.println(
                "\n\t----------"
              + "\n\t| REPORT |"
              + "\n\t----------"
              + "\nNAME:     " + this.user.getName()
              + "\nCPF:      " + this.user.getCPF()
              + "\nPHONE:    " + this.user.getNumber()
              + "\nEMAIL:    " + this.user.getEmail()
              + "\nCOUNT:    " + this.login.getCount()
              + "\nDATE :    " + this.login.getDate()
              + "\nPASSWORD: " + this.password.getPassword() );                   
    }
    
    

    //GETTERS AND SETTERS
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }
    
    
    
}
