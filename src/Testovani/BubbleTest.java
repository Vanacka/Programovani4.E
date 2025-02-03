package Testovani;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleTest {

    @Test
    public void getArr() {
    }

    @Test
    public void bubbleSort() {
        int[] vstup = new int[]{5, 9, 4, 3, 6, 7, 2, 1, 8};
        int[] vystup = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Bubble bubble = new Bubble(vstup);

        bubble.bubbleSort();
        assertArrayEquals(vystup, bubble.getArr());
    }

    @Test
    public void prohod() {
        int[] vstup = new int[]{2, 1, 3, 4, 5};
        int[] vystup = new int[]{1, 2, 3, 4, 5};
        Bubble bubble = new Bubble(vstup);

        bubble.prohod(0, 1);

        assertArrayEquals(vystup, bubble.getArr());
    }
}