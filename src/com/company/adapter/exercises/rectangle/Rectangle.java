package com.company.adapter.exercises.rectangle;

public interface Rectangle {
    int getWidth();
    int getHeight();
    default int getArea() {
        return getWidth() * getHeight();
    }
}
