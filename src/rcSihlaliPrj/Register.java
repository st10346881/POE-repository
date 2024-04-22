/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rcSihlaliPrj;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class Register {
    
    //Declare your variables
    private String Firstname;
    private String Lastname;
    private String Username;
    private String Password;

    //impliment your getters and setters for your variables
    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Register(String Firstname, String Lastname, String Username, String Password) {
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.Username = Username;
        this.Password = Password;
    //Add your default constructor
    }
     public Register() {
        this.Firstname = "";
        this.Lastname = "";
        this.Username = "";
        this.Password = "";
     }
     // create a method for your register 
    public void Register(){
        
        
        
        Firstname = JOptionPane.showInputDialog("Enter Firstname:");
        Lastname = JOptionPane.showInputDialog("Enter Lastname: ");
        
        boolean  isValid = false;
        boolean isPassValid = false;
        
        //impliment your while loop and add your conditions.
        while(!isValid){
      Username = JOptionPane.showInputDialog("Enter Username");
        if(!Username.contains("_")&& Username.length()<=5){
                    JOptionPane.showMessageDialog(null,"Invalid username", "Register", JOptionPane.ERROR_MESSAGE);
                 isValid = false;
                      
        }else{
            
                JOptionPane.showMessageDialog(null, "Username successfully captured", "Register",JOptionPane.INFORMATION_MESSAGE );
        
                
       while(!isPassValid){
        Password = JOptionPane.showInputDialog("Enter password");
        if(Password.length()>=8 && Password.matches(".*[A-Z].*")&& Password.matches(".*[0-9].*")&& Password.matches(".*[!@#$%^&*()_+{}<>].*")){
            
            JOptionPane.showMessageDialog(null, "Password Successfuly Captured", "REGISTER", JOptionPane.INFORMATION_MESSAGE);
            isPassValid = true;
        }else{
           JOptionPane.showMessageDialog(null, "Password doesnt meet the complexity requirements", "REGISTER", JOptionPane.ERROR_MESSAGE);
        }
        
        }
       
       while(true){
           
           String Confirm = JOptionPane.showInputDialog("Confirm Password");
           
       if(Password.equals(Confirm)){
           JOptionPane.showMessageDialog(null, "Password Successfully captured");
           
             break;
       }else{
           JOptionPane.showMessageDialog(null, "Passsowrd Does not match", "Register", JOptionPane.ERROR_MESSAGE);
           
       }
    
       }
       break;
         
    }
}
}  
}

    


