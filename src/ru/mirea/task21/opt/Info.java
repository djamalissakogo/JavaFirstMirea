package ru.mirea.task21.opt;

public class Info<T> {
    private final T info;

    public Info(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }
}
