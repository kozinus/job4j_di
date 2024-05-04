package ru.job4j.di.model;

public class StartUI {

    private Store store;

    private final ConsoleInput consoleInput = new ConsoleInput();

    public StartUI(Store store) {
        this.store = store;
    }

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}