package PasswordManager;
public class Password {
    
    //Atributos privados
    private String password;
    
    //Constructor
    public Password(String password){
        this.password = password;
    }
    
    //Metodo que mostra as senhas
    public void showPassword(){
        System.out.println(
                
                    "\t\tPassword data:"
                  + "Registred password: " + this.password
        );
    }

    //GETTERS AND SETTERS
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    
    
    
}
