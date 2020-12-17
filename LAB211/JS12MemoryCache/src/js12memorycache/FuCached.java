/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js12memorycache;

import java.util.Date;

/**
 *
 * @author PC
 */
public class FuCached {

    private Object data;
    private Date ExpiredDate;

    public FuCached() {
    }

    public FuCached(Object data, Date ExpiredDate) {
        this.data = data;
        this.ExpiredDate = ExpiredDate;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Date getExpiredDate() {
        return ExpiredDate;
    }

    public void setExpiredDate(Date ExpiredDate) {
        this.ExpiredDate = ExpiredDate;
    }

}
