/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js56worker;

/**
 *
 * @author PC
 */
public class SalaryHistory extends Worker implements Comparable<SalaryHistory> {

    private String status;
    private String date;

    public SalaryHistory() {
    }

    public SalaryHistory(String status, String date, String id, String name, int age,
            int salary, String workLocation) {
        super(id, name, age, salary, workLocation);
        this.status = status;
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public int compareTo(SalaryHistory t) {
        return this.getId().compareTo(t.getId());
    }
}
