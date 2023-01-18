package Lesson2;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException() {
        System.out.println("Ошибочный размер массива");
    }
}
