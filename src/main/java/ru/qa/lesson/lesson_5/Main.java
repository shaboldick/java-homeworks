package ru.qa.lesson.lesson_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        String[] fileNames = {
                "correctArray.txt",
                "wrongSizeArray.txt",
                "wrongDataArray.txt"
        };

        for (String fileName : fileNames) {
            System.out.println("\n=== Проверка файла: " + fileName + " ===");
            String[][] array = readArrayFromResource(fileName); // Читаем массив из файла
            if (array != null) { // Если чтение прошло успешно
                try {
                    int result = ArraySumCalculator.sumArray(array); // Считаем сумму
                    System.out.println("Сумма: " + result);
                } catch (MyArraySizeException | MyArrayDataException e) {
                    // Обрабатываем пользовательские исключения
                    System.out.println("Ошибка: " + e.getMessage());
                }
            }
        }

        // Пример стандартного исключения — выход за границы массива
        System.out.println("\n=== Генерация ArrayIndexOutOfBoundsException ===");
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // Индекс 5 не существует → исключение!
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }
    }

    // Вспомогательный метод — читает массив из файла, который находится в resources
    private static String[][] readArrayFromResource(String fileName) {
        try (InputStream is = Main.class.getClassLoader().getResourceAsStream(fileName);
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

            // Проверяем, что файл найден
            if (is == null) {
                System.err.println(" Файл не найден в resources: " + fileName);
                return null;
            }

            String line;
            String[][] array = new String[4][4]; // Создаём массив 4x4
            int row = 0;

            // Читаем строки до тех пор, пока не дойдём до конца файла или до 4 строк
            while ((line = br.readLine()) != null && row < 4) {
                String[] values = line.split(","); // Разделяем строку по запятым
                if (values.length != 4) {
                    System.err.println(" Некорректное количество значений в строке: " + line);
                    return null;
                }
                for (int col = 0; col < 4; col++) {
                    array[row][col] = values[col].trim(); // Убираем пробелы
                }
                row++;
            }
            return array; // Возвращаем прочитанный массив

        } catch (IOException e) {
            System.err.println(" Ошибка при чтении файла: " + e.getMessage());
            return null;
        }
    }
}