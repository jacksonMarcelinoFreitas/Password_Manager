package PasswordManager;


public class PasswordManager {

    public static void main(String[] args) {
        
        
        //Objetos
        User users1 = new User("Felipe Gabriel", "955.132.423-19", "(19)997118903", "gabrielfelipe@gmail.com");
        Password password1 = new Password("felipe2501");
        Login login1 = new Login("Google", "25/03/2020");
        Records record1 = new Records();
        
        User users2 = new User("Jackson Marcelino", "060.931.771-73", "(19)997149506", "jacksonzitap.mc@gmail.com");
        Password password2 = new Password("jackson*****");
        Login login2 = new Login("Canvas", "11/09/2020");
        Records record2 = new Records();
        
        //Passando objetos como parêmtro
        record1.setLogin(login1);
        record1.setPassword(password1);
        record1.setUser(users1);
        
        record2.setLogin(login2);
        record2.setPassword(password2);
        record2.setUser(users2);  
        
        //Chamando relatório
        record1.Relatorio();
        record2.Relatorio();
 
    }
    
}
