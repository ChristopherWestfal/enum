package org.task;

public class Main {
    public static void main(String[] args) {
        PersonRepository pr = new PersonRepository();

        System.out.println(pr.searchByID(4));
    }
}
