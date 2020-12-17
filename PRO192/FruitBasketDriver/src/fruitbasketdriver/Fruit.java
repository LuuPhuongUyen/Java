/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruitbasketdriver;

/**
 *
 * @author PC
 */
public class Fruit implements Comparable<Fruit> {

    private int id;
    private String name;
    private String origin;

    public Fruit() {
    }

    public Fruit(int id, String name, String origin) {
        this.id = id;
        this.name = name;
        this.origin = origin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Fruit{" + "id=" + id + ", name=" + name + ", origin=" + origin + '}'+"\n";
    }

    @Override
    public int compareTo(Fruit o) {
        return this.name.compareTo(o.name);
    }
}
