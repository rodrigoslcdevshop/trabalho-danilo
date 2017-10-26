
import java.applet.Applet;
import java.awt.Graphics;
import java.rmi.Naming;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cursino
 */
public class HelloApplet extends Applet {
    
    String mensagem = "";
    
    public void init(){
        
        try {
            Hello obj = (Hello) Naming.lookup("//"+getCodeBase().getHost() +"/HelloServer");
            mensagem =  obj.sayHello();
        } catch (Exception e) {
            
              System.out.println("Ococoreu um Erro");
                       e.printStackTrace();
            
        }
        
    }
    
    public void paint(Graphics g) {
        
        g.drawString(mensagem, 25, 50);
        
    }
    
}
