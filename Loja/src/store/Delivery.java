/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

/**
 *
 * @author Lukas Dias
 */
public class Delivery {

    /**
     * @return the client
     */
    public User getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(User client) {
        this.client = client;
    }
    
    private User client;
    
    public Delivery(User client, String adress, String cep, int number){
        this.client = client;
    }
}
