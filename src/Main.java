
import java.rmi.Naming;
import java.rmi.RMISecurityManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cursino
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        System.setSecurityManager(new RMISecurityManager());
        
        try {
            
            HelloImpl obj = new HelloImpl("Hello Server");
            Naming.rebind("Hello Server", obj);
            System.out.println("HelloImpl foi criado e registrado");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
