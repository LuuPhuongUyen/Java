/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Connection.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Luu Phuong Uyen
 */
public class ArticleDB {

    public ArrayList<Article> getRecentArticle(int numberArticle) throws Exception {
        DBUtil db = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Article> listArticle = new ArrayList<>();
        try {
            db = new DBUtil();
            con = db.getConnection();
            ps = con.prepareStatement("SELECT TOP (?) * FROM Article ORDER BY Date DESC");
            ps.setInt(1, numberArticle);
            rs = ps.executeQuery();
            while (rs.next()) {
                Article article = new Article(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6));
                listArticle.add(article);
            }
            return listArticle;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            db.close(con, ps, rs);
        }
    }

    public Article getArticleById(int id) throws Exception {
        DBUtil db = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            db = new DBUtil();
            con = db.getConnection();
            ps = con.prepareStatement("SELECT title, image, content, date, author FROM Article WHERE id = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Article(id, rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            db.close(con, ps, rs);
        }
        return null;
    }

    public ArrayList<Article> getListAticleSearch(int numberArticleInPage, int pageCurrent,
            String keyword) throws Exception {
        DBUtil db = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Article> listArticle = new ArrayList<>();
        try {
            db = new DBUtil();
            int articleFrom = pageCurrent * numberArticleInPage - 1;
            int articleTo = articleFrom + numberArticleInPage - 1;
            con = db.getConnection();
            ps = con.prepareStatement("SELECT * FROM (SELECT ROW_NUMBER()OVER(ORDER BY id) as Number,\n"
                    + "* FROM Article WHERE content LIKE ? OR title LIKE ? \n"
                    + ") as DataSearch where Number between ? and ?");
            keyword = "%" + keyword + "%";
            ps.setString(1, keyword);
            ps.setString(2, keyword);
            ps.setInt(3, articleFrom);
            ps.setInt(4, articleTo);
            rs = ps.executeQuery();
            while (rs.next()) {
                Article article = new Article(rs.getInt(2), rs.getString(3), 
                        rs.getString(4), rs.getString(5), rs.getDate(6), rs.getString(7));
                listArticle.add(article);
            }
            return listArticle;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            db.close(con, ps, rs);
        }
    }

    public int getNumberPage(int numberArticleInPage, String keyword) throws Exception {
        DBUtil db = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Article> listArticle = new ArrayList<>();
        try {
            db = new DBUtil();
            con = db.getConnection();
            ps = con.prepareStatement("SELECT COUNT(id) FROM Article"
                + "WHERE content LIKE ? OR title LIKE ?");
            keyword = "%" + keyword + "%";
            ps.setString(1, keyword);
            ps.setString(2, keyword);
            rs = ps.executeQuery();
            while (rs.next()) {
                int numberArticle = rs.getInt(1);
                return (numberArticle + (numberArticle % numberArticleInPage))
                        / numberArticleInPage;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            db.close(con, ps, rs);
        }
        return -1;
    }

}
