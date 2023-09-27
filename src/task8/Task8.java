package task8;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        double[] a = {1, 3, 3, 4};
        double[] b = {2, 6, 7, 8};
        System.out.println(Arrays.toString(findIndices(a, b)));
    }

    public static int[] findIndices(double[] a, double[] b) {
        int bIndex = 0;
        int[] indices = new int[b.length];
        int iIndex = 0;
        int aIndex = 0;
        while (aIndex < a.length && bIndex < b.length) {
            if (b[bIndex] <= a[aIndex]) {
                indices[iIndex++] = aIndex;
                bIndex++;
            } else aIndex++;
        }
        while (iIndex < b.length) {
            indices[iIndex++] = a.length - 1;
        }
        return indices;
    }
}
