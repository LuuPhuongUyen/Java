/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdlinkedlistmanage;

/**
 *
 * @author PC
 */
public class Item {
    String maHang;
    String tenHang;
    int soLuong;
    Double donGia;
    
    public Item(String maHang, String tenHang, int soLuong, Double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
    
    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        tenHang = tenHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        donGia = donGia;
    }

    @Override
    public String toString() {
        return "Item{" +
                "MaHang='" + maHang + '\'' +
                ", TenHang='" + tenHang + '\'' +
                ", SoLuong=" + soLuong +
                ", DonGia=" + donGia +
                '}';
    }
}
