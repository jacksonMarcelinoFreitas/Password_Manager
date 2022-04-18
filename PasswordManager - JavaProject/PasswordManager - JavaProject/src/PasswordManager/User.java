package PasswordManager;

public class User {
    
    //Atributos privados
    private String name;
    private String CPF;
    private String number;
    private String email;

 
    //Constructor
    public User(String name, String CPF, String number, String email){
        this.name = name;
        this.CPF = CPF;
        this.number = number;
        this.email = email;  
    }
    
    public User(){   
    }
    
    
    //metodo para mostrar os usuários
    public void showUser(){
        System.out.println(
                
                 "\t\tUser data"
               + "Name: " + this.name 
               + "CPF:" + this.CPF 
               + "Number: " + this.number
               + "Email: " + this.email 
                
        );  
    }

    //GETTERS AND SETTERS
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    
    public String getCPF(){
        return CPF;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }

    
    public String getNumber(){
        return number;
    }
    public void setNumber(String number){
        this.number = number;
    }

    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
 
}
