/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import DAO.ContactDAO;
import Model.Contact;

/**
 *
 * @author Luu Phuong Uyen
 */
public class getContactAction {

    Contact con ;

    public getContactAction() {
    }

    public Contact getCon() {
        return con;
    }

    public void setCon(Contact con) {
        this.con = con;
    }

    public String execute() throws Exception {
        ContactDAO dao = new ContactDAO();
        con = dao.getContact();
        System.out.println(con);
        return "success";
    }

}
