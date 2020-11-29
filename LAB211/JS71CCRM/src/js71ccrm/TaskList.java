/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js71ccrm;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class TaskList {

    private ArrayList<Task> lt = new ArrayList<>();
    private int id = 1;
    Validation v = new Validation();

    public void addTask() {
        System.out.print("Enter Requirement Name: ");
        String requirementName = v.checkString();
        v.menuTask();
        System.out.print("Enter Task Type: ");
        String taskTypeId = v.checkInputTaskTypeId();
        System.out.print("Enter Date: ");
        String date = v.checkInputDate();
        System.out.print("Enter From: ");
        String planFrom = v.checkInputPlan();
        System.out.print("Enter To: ");
        String planTo = v.checkInputPlan();
        System.out.print("Enter Assignee: ");
        String assign = v.checkString();
        System.out.print("Enter Reviewer: ");
        String reviewer = v.checkString();
        lt.add(new Task(id, taskTypeId, requirementName, date, planFrom, planTo, assign, reviewer));
        System.out.println("Add Task Success.");
        id++;
    }

    public void deleteTask() {
        if (lt.isEmpty()) {
            System.err.println("List empty");
            return;
        }
        int findId = findTaskExist();
        if (findId != -1) {
            lt.remove(findId);
            for (int i = findId; i < lt.size(); i++) {
                lt.get(i).setId(lt.get(i).getId() - 1);
            }
            System.err.println("Delete success.");
        }
        id--;

    }

    private int findTaskExist() {
        System.out.print("Enter id: ");
        int id_Search = v.checkInputInt();
        for (int i = 0; i < lt.size(); i++) {
            if (lt.get(i).getId() == id_Search) {
                return i;
            }
        }
        System.err.println("Not found.");
        return -1;
    }

    public void print() {
        if (lt.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        System.out.printf("%-5s%-15s%-15s%-15s%-15s%-15s%-15s\n",
                "ID", "Name", "Task Type", "Date", "Time", "Assign", "Reviewer");
        for (int i = 0; i < lt.size(); i++) {
            System.out.printf("%-5d%-15s%-15s%-15s%-15.1f%-15s%-15s\n",
                    lt.get(i).getId(),
                    lt.get(i).getRequirementName(),
                    lt.get(i).getTaskTypeId(),
                    lt.get(i).getDate(),
                    Double.parseDouble(lt.get(i).getPlanTo()) - Double.parseDouble(lt.get(i).getPlanFrom()),
                    lt.get(i).getAssign(),
                    lt.get(i).getReviewer()
            );

        }
    }

    private static void display() {

    }
}
