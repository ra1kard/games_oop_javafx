package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    /**
     * Метод Cell[] way(Cell dest) - максимум будет занимать 10 строк кода.
     */
    @Override
    public Cell[] way(Cell dest) {
        throw new ImpossibleMoveException(
                String.format("Could not way by diagonal from %s to %s", position, dest)
        );
        /*if (!isDiagonal(position, dest)) {
            throw new ImpossibleMoveException(
                    String.format("Could not move by diagonal from %s to %s", position, dest)
            );
        }
        int size = ...;
        Cell[] steps = new Cell[size];
        int deltaX = ...;
        int deltaY = ...;
        for (int index = 0; index < size; index++) {
            steps[index] = ...
        }
        return steps;*/
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        /* TODO check diagonal */
        return false;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }

}
