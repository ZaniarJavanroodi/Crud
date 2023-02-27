/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Zaniar
 */
public class Directory {
    ArrayList<User> allusers;
    
    public Directory(){
            this.allusers = new ArrayList<>();
    }

    public ArrayList<User> getAllusers() {
        return allusers;
    }

    public void setAllusers(ArrayList<User> allusers) {
        this.allusers = allusers;
    }
    public void addUser(User newUser){
        this.allusers.add(newUser);
    }
    public void removeUser(User user){
        this.allusers.remove(user);
    }
    
   
    
}
