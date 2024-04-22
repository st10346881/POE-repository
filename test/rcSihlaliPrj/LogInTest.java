/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package rcSihlaliPrj;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class LogInTest {
    
    public LogInTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // Test of getUsernameEntered method, of class LogIn.
     
    @Test
    public void testGetUsernameEntered() {
        System.out.println("getUsernameEntered");
        LogIn instance = new LogIn();
        String expResult = "";
        String result = instance.getUsernameEntered();
        assertEquals(expResult, result);
        fail("Invalid.");
    }

    
     // Test of setUsernameEntered method, of class LogIn.
     
    @Test
    public void testSetUsernameEntered() {
        System.out.println("setUsernameEntered");
        String usernameEntered = "";
        LogIn instance = new LogIn();
        instance.setUsernameEntered(usernameEntered);
       
        fail("Incorrect Username!!");
    }

    
     // Test of getPasswordEntered method, of class LogIn.
    
    @Test
    public void testGetPasswordEntered() {
        System.out.println("getPasswordEntered");
        LogIn instance = new LogIn();
        String expResult = "";
        String result = instance.getPasswordEntered();
        assertEquals(expResult, result);
      
        fail("Invalid password");
    }

    
     // Test of setPasswordEntered method, of class LogIn.
     
    @Test
    public void testSetPasswordEntered() {
        System.out.println("setPasswordEntered");
        String passwordEntered = "";
        LogIn instance = new LogIn();
        instance.setPasswordEntered(passwordEntered);
      
        fail("Invalid.");
    }

   
     // Test of Log method, of class LogIn.
     
    @Test
    public void testLog() {
        System.out.println("Log");
        LogIn instance = new LogIn();
        instance.Log();
        fail("Invalid.");
    }
    
}
