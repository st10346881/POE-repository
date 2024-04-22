
 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rcSihlaliPrj;

import javax.swing.JOptionPane;

/**
 *
 * @author Mbuso_Sihlali_(ST10346881)
 */
public class LogIn {
    
    //Declare your variables.
    private String usernameEntered;
    private String passwordEntered;

    public String getUsernameEntered() {
        return usernameEntered;
    }

    public void setUsernameEntered(String usernameEntered) {
        this.usernameEntered = usernameEntered;
    }

    public String getPasswordEntered() {
        return passwordEntered;
    }

    public void setPasswordEntered(String passwordEntered) {
        this.passwordEntered = passwordEntered;
    }

    public LogIn(String usernameEntered, String passwordEntered) {
        this.usernameEntered = usernameEntered;
        this.passwordEntered = passwordEntered;
    }
    public  LogIn() {
        this.usernameEntered = "";
        this.passwordEntered = "";
    }
    
    public void Log(){
        
              Register myReg = new Register();
              
              JOptionPane.showMessageDialog(null, "WELCOME, It is great to see you", "LogIn", JOptionPane.INFORMATION_MESSAGE);

      while(true){
        usernameEntered = JOptionPane.showInputDialog("Enter Username:");
        if(usernameEntered .equals(myReg.getUsername())){
            JOptionPane.showMessageDialog(null, "Invalid username", "Login", JOptionPane.ERROR_MESSAGE);   
            break;
        }else{
            JOptionPane.showMessageDialog(null,"Valid Username", "Login", JOptionPane.INFORMATION_MESSAGE);
        }
      
    
      while(true){
        passwordEntered = JOptionPane.showInputDialog("Enter Password:");
        if(passwordEntered .equals(myReg.getPassword()) ){
            JOptionPane.showMessageDialog(null, "Invalid Password", "Login", JOptionPane.ERROR_MESSAGE);   
          
        }else{
            JOptionPane.showMessageDialog(null, "Valid Password!!", "Login", JOptionPane.INFORMATION_MESSAGE);
        }
         break;
        
        
    }
                    JOptionPane.showMessageDialog(null, "Part 2 coming soon, THANK YOU!!", "Login", JOptionPane.INFORMATION_MESSAGE);
         break;
      }

      }
    
    }

    

    
