// Пользовательское исключение — выбрасывается, если элемент нельзя преобразовать в число
package ru.qa.lesson.lesson_5;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message); // Сообщение будет содержать координаты ячейки
    }
}