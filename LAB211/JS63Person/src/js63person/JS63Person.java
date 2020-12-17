/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js63person;

class PersonArr {

    Person p;

    public PersonArr() {
    }

    public PersonArr(Person p) {
        this.p = p;
    }
}

public class JS63Person {

    public static void main(String[] args) {
        // TODO code application logic here
        PersonManagement m = new PersonManagement();
        int n = m.checkInputNumberStudent();
        Person[] persons = new Person[n];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = m.inputPersonInfo();
        }
        PersonArr[] listPerson = new PersonArr[persons.length];
        m.sortBySalary(persons, listPerson);
        for (int i = 0; i < persons.length; i++) {
            listPerson[i].p.displayPersonInfo();
        }
    }
}

