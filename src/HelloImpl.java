
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RMISecurityException;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cursino
 */
public class HelloImpl extends UnicastRemoteObject implements Hello{
    
    private String nome;

    public HelloImpl(String nome) throws RemoteException{
        super();
        this.nome = nome;
    }
    
    @Override
    public String sayHello() throws RemoteException {
       return  "Hello World";
    }
    
}
