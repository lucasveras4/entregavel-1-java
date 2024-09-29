package entregavel.pkg1.java;


import java.util.ArrayList;
import java.util.List;

public class quickSort {

    public static List<Integer> quickSort(List<Integer> array) {
        if (array.size() <= 1) {
            return array;
        }

        int pivot = array.get(0);

        List<Integer> esq = new ArrayList<>();
        List<Integer> dir = new ArrayList<>();

        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) < pivot) {
                esq.add(array.get(i));
            } else {
                dir.add(array.get(i));
            }
        }

        return mergeLists(quickSort(esq), pivot, quickSort(dir));
    }

    private static List<Integer> mergeLists(List<Integer> esq, int pivot, List<Integer> dir) {
        List<Integer> result = new ArrayList<>();
        result.addAll(esq);
        result.add(pivot);
        result.addAll(dir);
        return result;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(17);
        arr.add(14);
        arr.add(23);
        arr.add(2);
        arr.add(4);
        arr.add(9);
        arr.add(15);
        arr.add(1);
        arr.add(0);
        arr.add(3);
        arr.add(5);

        List<Integer> sortedArr = quickSort(arr);
        System.out.println(sortedArr);
    }
}