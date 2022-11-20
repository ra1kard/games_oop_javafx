package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.job4j.chess.firuges.Cell.A3;

public class BishopBlackTest {

    /**
     * �������� ������ position. �������� ������ � �������� � ���� ����� position.
     * ���������, ��� �� �������� �� �� ������, ��� � ��� �������� �������.
     */
    @Test
    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(A3);
        assertEquals(A3, bishopBlack.position());
    }

    /**
     * �������� ������ copy. �������� ������ � �������� � ���� ����� copy.
     * ���������, ���, ������������ ������ ����� ���������� �������.
     */
    @Test
    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(A3);
        BishopBlack bishopBlack2 = new BishopBlack(Cell.C5);
        assertEquals(bishopBlack.position(), bishopBlack2.copy(A3).position());
    }

    /**
     * ����� �������� ����-����� ��� �������� ������ way.
     * ��� ����� �������� ������ � ��������� ���������� C1. �������� ����� way G5.
     * �� ������ ����� ����� ��� �� ���������� � ���� ������ ����������� ��� ����� �������,
     * ����� �� ������ ������ �� ������� ������: D2, E3, F4, G5.
     */
    @Test
    public void testWay() {

    }

}
