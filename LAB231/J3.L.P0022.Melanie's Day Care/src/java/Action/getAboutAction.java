/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import DAO.AboutDAO;
import Model.AboutMe;

/**
 *
 * @author Luu Phuong Uyen
 */
public class getAboutAction {

    AboutMe a;

    public getAboutAction() {
    }

    public AboutMe getA() {
        return a;
    }

    public void setA(AboutMe a) {
        this.a = a;
    }

    public String execute() throws Exception {
        AboutDAO adao = new AboutDAO();
        a = adao.getAboutPage();
        return "success";
    }

}
