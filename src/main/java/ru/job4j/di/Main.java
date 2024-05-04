package ru.job4j.di;

import ru.job4j.di.model.StartUI;
import ru.job4j.di.model.Store;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(StartUI.class);

        StartUI ui = context.get(StartUI.class);

        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
    }
}