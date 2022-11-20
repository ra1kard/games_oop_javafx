package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.job4j.chess.firuges.Cell.A3;

public class BishopBlackTest {

    /**
     * Проверка метода position. Создайте объект и вызовите у него метод position.
     * Проверьте, что он занимает ту же ячейку, что и при создании объекта.
     */
    @Test
    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(A3);
        assertEquals(A3, bishopBlack.position());
    }

    /**
     * Проверка метода copy. Создайте объект и вызовите у него метод copy.
     * Проверьте, что, возвращенный объект имеет правильную позицию.
     */
    @Test
    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(A3);
        BishopBlack bishopBlack2 = new BishopBlack(Cell.C5);
        assertEquals(bishopBlack.position(), bishopBlack2.copy(A3).position());
    }

    /**
     * Далее создайте тест-метод для проверки метода way.
     * Для этого создайте объект с начальным положением C1. Вызовите метод way G5.
     * На данном этапе метод еще не реализован и Ваша задача реализовать его таким образом,
     * чтобы он вернул массив из четырех клеток: D2, E3, F4, G5.
     */
    @Test
    public void testWay() {

    }

}
