/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author Mads Voss
 */
public class User {
    private int id;
    private String username, password, email;
    private float balance;

    public User(int id, String username, String password, String email, float balance) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.balance = balance;
    }
    
    public boolean passwordCheck(String password) {
        return this.password.equals(password);
    }
    
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public float getBalance() {
        return balance;
    }
    
}