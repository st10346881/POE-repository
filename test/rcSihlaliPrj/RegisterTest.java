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
public class RegisterTest {
    
    public RegisterTest() {
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

   
     //Test of getFirstname method, of class Register.
     
    @Test
    public void testGetFirstname() {
        System.out.println("getFirstname");
        Register instance = new Register();
        String expResult = "";
        String result = instance.getFirstname();
        assertEquals(expResult, result);
        fail("Invalid firstname");
    }

   
     // Test of setFirstname method, of class Register.
     
    @Test
    public void testSetFirstname() {
        System.out.println("setFirstname");
        String Firstname = "";
        Register instance = new Register();
        instance.setFirstname(Firstname);
        fail("Invalid firstname");
    }

   
     //Test of getLastname method, of class Register.
     
    @Test
    public void testGetLastname() {
        System.out.println("getLastname");
        Register instance = new Register();
        String expResult = "";
        String result = instance.getLastname();
        assertEquals(expResult, result);
        fail("Invalid firstname");
    }

   
     // Test of setLastname method, of class Register.
    
    @Test
    public void testSetLastname() {
        System.out.println("setLastname");
        String Lastname = "";
        Register instance = new Register();
        instance.setLastname(Lastname);
        fail("Invalid ");
    }

    
     // Test of getUsername method, of class Register.
    
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Register instance = new Register();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        fail("Invalid");
    }

   
     // Test of setUsername method, of class Register.
    
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String Username = "";
        Register instance = new Register();
        instance.setUsername(Username);
        fail("Invalid");
    }

   
     // Test of getPassword method, of class Register.
     
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Register instance = new Register();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        fail("Invalid");
    }

    
     //Test of setPassword method, of class Register.
     
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String Password = "";
        Register instance = new Register();
        instance.setPassword(Password);
        fail("Invalid");
    }

   
     // Test of Register method, of class Register.
    
    @Test
    public void testRegister() {
        System.out.println("Register");
        Register instance = new Register();
        instance.Register();
        fail("Invalid");
    }
    
}
