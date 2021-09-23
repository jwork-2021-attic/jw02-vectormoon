package S185220001.Task2;

import S185220001.Task2.Line.Position;;

public enum Monster implements Linable {

    ONE(204, 0, 0), TWO(255, 165, 0), THREE(252, 233, 79), FOUR(78, 154, 6), FIVE(50, 175, 255), SIX(114, 159, 207), SEVEN(173, 127, 168), EIGHT(0, 99, 0),
    ONE1(234, 0, 0), TWO1(255, 195, 0), THREE1(252, 233, 149), FOUR1(108, 154, 16), FIVE1(50, 205, 255), SIX1(134, 159, 207), SEVEN1(203, 127, 168), EIGHT1(50, 99, 0),
    ONE2(184, 15, 0), TWO2(235, 195, 0), THREE2(232, 233, 149), FOUR2(108, 134, 16), FIVE2(50, 185, 255), SIX2(134, 159, 187), SEVEN2(183, 127, 168), EIGHT2(50, 99, 200),
    ONE3(164, 30, 0), TWO3(215, 195, 0), THREE3(212, 233, 149), FOUR3(108, 114, 16), FIVE3(50, 165, 255), SIX3(134, 159, 167), SEVEN3(163, 127, 168), EIGHT3(50, 99, 180),
    ONE4(144, 45, 0), TWO4(195, 195, 0), THREE4(192, 233, 149), FOUR4(108, 94, 16), FIVE4(50, 145, 255), SIX4(134, 159, 147), SEVEN4(143, 127, 168), EIGHT4(50, 99, 160),
    ONE5(124, 60, 0), TWO5(175, 195, 0), THREE5(172, 233, 149), FOUR5(108, 74, 16), FIVE5(50, 125, 255), SIX5(134, 159, 127), SEVEN5(123, 127, 168), EIGHT5(50, 99, 140),
    ONE6(104, 75, 0), TWO6(165, 195, 0), THREE6(152, 233, 149), FOUR6(108, 54, 16), FIVE6(50, 105, 255), SIX6(134, 159, 107), SEVEN6(103, 127, 168), EIGHT6(50, 99, 120),
    ONE7(84, 95, 0), TWO7(145, 195, 0), THREE7(132, 233, 149), FOUR7(108, 34, 16), FIVE7(50, 85, 255), SIX7(134, 159, 87), SEVEN7(83, 127, 168), EIGHT7(50, 99, 100);


    private final int r;
    private final int g;
    private final int b;

    private Position position;

    Monster(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public static Monster getMonsterByRank(int rank) {

        for (Monster Monster : Monster.values()) {
            if (Monster.rank() == rank) {
                return Monster;
            }
        }
        return null;

    }

    public int rank() {
        return this.ordinal() + 1;
    }

    @Override
    public String toString() {
        return "\033[48;2;" + this.r + ";" + this.g + ";" + this.b + ";38;2;0;0;0m    " + this.rank() + "  \033[0m";
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    public void swapPosition(Monster another) {
        Position p = another.position;
        this.position.setLinable(another);
        p.setLinable(this);
    }

    @Override
    public int getValue() {
        return this.rank();
    }

}