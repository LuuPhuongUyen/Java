/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.WishList;
import java.util.ArrayList;

/**
 *
 * @author Luu Phuong Uyen
 */
public class WishListAction {
    
    private ArrayList<WishList> lsWish = new ArrayList<>();
    private String wishlist;
    
    public WishListAction() {
    }

    public ArrayList<WishList> getLsWish() {
        return lsWish;
    }

    public void setLsWish(ArrayList<WishList> lsWish) {
        this.lsWish = lsWish;
    }

    public String getWishlist() {
        return wishlist;
    }

    public void setWishlist(String wishlist) {
        this.wishlist = wishlist;
    }
    
    public String execute() throws Exception {
        WishList wl = new WishList();
        lsWish = wl.getAllWishList();
        System.out.println(lsWish);
        return "success";
    }
}
