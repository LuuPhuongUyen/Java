/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js12memorycache;

import java.util.*;

/**
 *
 * @author PC
 */
public class FuMemoryCached {

    private static final HashMap<String, FuCached> cached = new HashMap<>();

    public Object getObject(String key) {
        synchronized (cached) {
            Date date = new Date();
            if (cached.containsKey(key.toUpperCase())) {
                if (cached.get(key.toUpperCase()).getExpiredDate().before(date)) {
                    cached.remove(key.toUpperCase());
                    return null;
                } else {
                    Object obj = cached.get(key.toUpperCase()).getData();
                    return obj;
                }
            } else {
                return null;
            }
        }
    }

    public boolean putObject(String key, Object object, int timeTolive) {
        synchronized (cached) {
            if (!cached.containsKey(key)) {
                Calendar calendar = new GregorianCalendar();
                calendar.add(Calendar.DATE, timeTolive);
                cached.put(key.toUpperCase(), new FuCached(object, calendar.getTime()));
            }
            HashMap<String, FuCached> cached1 = cached;
            return true;
        }
    }

    public boolean clean(String key) {
        synchronized (cached) {
            try {
                if (cached.containsKey(key.toUpperCase())) {
                    cached.remove(key.toUpperCase());
                    return true;
                } else {
                    System.err.println("ID not found!");
                    return false;
                }
            } catch (Exception e) {
                return false;
            }
        }
    }

    public boolean cleanAll() {
        synchronized (cached) {
            if (cached.isEmpty()) {
                return false;
            }
            cached.clear();
            return true;
        }
    }
}
