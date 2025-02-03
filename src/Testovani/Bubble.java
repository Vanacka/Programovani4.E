package Testovani;

public class Bubble {
    private int[] arr;

    public Bubble(int[] arr) {
        this.arr = arr;
    }

    // Vrati setrizene pole
    public int[] getArr() {
        return arr;
    }

    // Setridi pole arr pomoci bubble sortu
    public void bubbleSort() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    prohod(j, j + 1);
                }
            }
        }
    }

    // Prohodi dva prvky v poli
    protected void prohod(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
