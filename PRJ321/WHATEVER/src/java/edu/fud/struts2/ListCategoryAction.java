/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fud.struts2;

import edu.fud.DAO.bookDAO;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ListCategoryAction {
    List<String>listCategory;

    public List<String> getListCategory() {
        return listCategory;
    }

    public void setListCategory(List<String> listCategory) {
        this.listCategory = listCategory;
    }

    
    public ListCategoryAction() {
    }
    
    public String execute() throws Exception {
        bookDAO bdao = new bookDAO();
        listCategory = bdao.listCategory();
        return "success";
    }
    
}
