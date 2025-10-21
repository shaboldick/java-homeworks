// Утилита для расчёта суммы элементов массива
package ru.qa.lesson.lesson_5;

public class ArraySumCalculator {

    // Метод принимает двумерный строковый массив 4x4
    // Возвращает сумму всех чисел, или бросает исключение
    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        // Проверяем размер: должно быть ровно 4 строки и 4 столбца
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Массив должен быть размером 4x4!");
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    // Пытаемся преобразовать строку в целое число
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    // Если не получилось — бросаем своё исключение с координатами
                    throw new MyArrayDataException(
                            "Неверные данные в ячейке [" + i + "][" + j + "]: '" + array[i][j] + "'"
                    );
                }
            }
        }
        return sum; // Возвращаем сумму
    }
}