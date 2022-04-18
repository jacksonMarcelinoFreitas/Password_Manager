package PasswordManager;

public class Login {
    
    //Atributos privados
    private String count;
    private String date;
    
    //Constructors
    public Login(String count, String date){
        this.count = count;
        this.date = date;
    }
    
    public Login(){
    }

    public void showLogin(){
        System.out.println(
                
                "\t\tDados de login"
              + "Count: "+ this.count  
              + "Date: " + this.date
        );   
    }
    
    
    //GETTERS AND SETTERS
    public String getCount(){
        return count;
    }
    public void setCount(String count) {
        this.count = count;
    }

  
    public String getDate(){
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
      
}
