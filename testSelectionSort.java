
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
	}

    public testSelectionSort() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 3;
        arr[3] = 1;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 1;
        Sortedarr[1] = 2;
        Sortedarr[2] = 3;
        Sortedarr[3] = 5;
        Sortedarr[4] = 6;
        SelectionSort temp1 = new SelectionSort();
        temp1.sort(arr);
        assertArrayEquals("wrong",Sortedarr,arr);
    }

    public void testNegative(){
      int[] arr = new int[5];
         arr[0] = -6;
         arr[1] = -3;
         arr[2] = -1;
         arr[3] = -9;
         arr[4] = -2;

         int[] Sortedarr = new int[5];
         Sortedarr[0] = -9;
         Sortedarr[1] = -6;
         Sortedarr[2] = -3;
         Sortedarr[3] = -2;
         Sortedarr[4] = -1;
         SelectionSort temp1 = new SelectionSort();
         temp1.sort(arr);
         assertArrayEquals("wrong",Sortedarr,arr);
    }

    public void testMixed(){
      int[] arr = new int[5];
        arr[0] = -4;
        arr[1] = -5;
        arr[2] = 0;
        arr[3] = 7;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -5;
        Sortedarr[1] = -4;
        Sortedarr[2] = 0;
        Sortedarr[3] = 2;
        Sortedarr[4] = 7;
        SelectionSort temp1 = new SelectionSort();
        temp1.sort(arr);
        assertArrayEquals("wrong",Sortedarr,arr);
    }
}
