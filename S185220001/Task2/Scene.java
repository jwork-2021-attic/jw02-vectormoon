package S185220001.Task2;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Scene {
    public static void main(String[] args) throws IOException {
        Line line = new Line(64);
        
        line.put(Monster.ONE, 6);
        line.put(Monster.TWO, 3);
        line.put(Monster.THREE, 1);
        line.put(Monster.FOUR, 5);
        line.put(Monster.FIVE, 2);
        line.put(Monster.SIX, 4);
        line.put(Monster.SEVEN, 0);
        line.put(Monster.EIGHT, 8);

        line.put(Monster.ONE1, 15);
        line.put(Monster.TWO1, 9);
        line.put(Monster.THREE1, 10);
        line.put(Monster.FOUR1, 14);
        line.put(Monster.FIVE1, 11);
        line.put(Monster.SIX1, 13);
        line.put(Monster.SEVEN1, 12);
        line.put(Monster.EIGHT1, 16);

        line.put(Monster.ONE2, 23);
        line.put(Monster.TWO2, 19);
        line.put(Monster.THREE2, 20);
        line.put(Monster.FOUR2, 24);
        line.put(Monster.FIVE2, 18);
        line.put(Monster.SIX2, 17);
        line.put(Monster.SEVEN2, 22);
        line.put(Monster.EIGHT2, 21);

        line.put(Monster.ONE3, 25);
        line.put(Monster.TWO3, 29);
        line.put(Monster.THREE3, 30);
        line.put(Monster.FOUR3, 28);
        line.put(Monster.FIVE3, 27);
        line.put(Monster.SIX3, 31);
        line.put(Monster.SEVEN3, 32);
        line.put(Monster.EIGHT3, 26);

        line.put(Monster.ONE4, 35);
        line.put(Monster.TWO4, 39);
        line.put(Monster.THREE4, 40);
        line.put(Monster.FOUR4, 37);
        line.put(Monster.FIVE4, 34);
        line.put(Monster.SIX4, 38);
        line.put(Monster.SEVEN4, 33);
        line.put(Monster.EIGHT4, 36);

        line.put(Monster.ONE5, 48);
        line.put(Monster.TWO5, 41);
        line.put(Monster.THREE5, 42);
        line.put(Monster.FOUR5, 47);
        line.put(Monster.FIVE5, 43);
        line.put(Monster.SIX5, 44);
        line.put(Monster.SEVEN5, 45);
        line.put(Monster.EIGHT5, 46);

        line.put(Monster.ONE6, 51);
        line.put(Monster.TWO6, 49);
        line.put(Monster.THREE6, 50);
        line.put(Monster.FOUR6, 56);
        line.put(Monster.FIVE6, 53);
        line.put(Monster.SIX6, 52);
        line.put(Monster.SEVEN6, 55);
        line.put(Monster.EIGHT6, 54);

        line.put(Monster.ONE7, 57);
        line.put(Monster.TWO7, 59);
        line.put(Monster.THREE7, 58);
        line.put(Monster.FOUR7, 60);
        line.put(Monster.FIVE7, 61);
        line.put(Monster.SIX7, 62);
        line.put(Monster.SEVEN7, 7);
        line.put(Monster.EIGHT7, 63);




        Snake theSnake = Snake.getTheSnake();

        // Sorter sorter = new BubbleSorter();
        Sorter sorter = new SelectionSorter();

        theSnake.setSorter(sorter);

        String log = theSnake.lineUp(line);

        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("result.txt"));
        writer.write(log);
        writer.flush();
        writer.close();
    } 
}
