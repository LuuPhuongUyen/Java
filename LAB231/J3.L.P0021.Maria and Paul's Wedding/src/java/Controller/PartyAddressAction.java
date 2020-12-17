/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.PartyAddress;
import java.util.ArrayList;

/**
 *
 * @author Luu Phuong Uyen
 */
public class PartyAddressAction {

    public ArrayList<PartyAddress> viewAddress;
    private String address;
    private String email;

    public ArrayList<PartyAddress> getViewAddress() {
        return viewAddress;
    }

    public void setViewAddress(ArrayList<PartyAddress> viewAddress) {
        this.viewAddress = viewAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PartyAddressAction() {
    }

    public String execute() throws Exception {
        PartyAddress p = new PartyAddress();
        viewAddress = p.getPartyAddress();
        return "success";
    }

}
