package day80_advanced_DSA_arrays_3.assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class Q4_Search_In_A_RowWiseAndColumnWiseSortedMatrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(new ArrayList<>(Arrays.asList(2, 8, 8, 8)));
        A.add(new ArrayList<>(Arrays.asList(2, 8, 8, 8)));
        A.add(new ArrayList<>(Arrays.asList(2, 8, 8, 8)));
        int B = 8;

      /*  ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(new ArrayList<>(Arrays.asList(1, 3, 5, 8, 9, 11, 12, 13, 16, 19, 21, 22, 25, 27, 28, 31, 33, 35, 36, 39, 41, 42, 44, 46, 49, 50, 53, 56, 59, 60, 63, 65, 66, 67, 70, 73, 74, 75, 77, 79, 81, 83, 85, 88, 91)));
        A.add(new ArrayList<>(Arrays.asList(4, 7, 10, 12, 15, 17, 20, 22, 25, 27, 30, 33, 34, 37, 40, 42, 44, 47, 48, 51, 54, 57, 59, 61, 63, 65, 66, 69, 71, 74, 76, 78, 79, 81, 82, 84, 86, 88, 89, 90, 92, 94, 95, 97, 99)));
        A.add(new ArrayList<>(Arrays.asList(7, 10, 12, 14, 16, 20, 22, 25, 27, 29, 32, 34, 36, 39, 42, 44, 46, 48, 51, 53, 57, 59, 60, 64, 67, 70, 73, 74, 76, 79, 80, 82, 83, 85, 88, 90, 93, 94, 96, 99, 102, 103, 105, 108, 111)));
        A.add(new ArrayList<>(Arrays.asList(10, 13, 16, 18, 20, 23, 25, 28, 31, 32, 33, 35, 38, 42, 44, 47, 50, 53, 56, 59, 61, 63, 66, 68, 71, 72, 75, 76, 77, 80, 83, 85, 87, 88, 89, 93, 94, 96, 97, 101, 105, 107, 110, 113, 115)));
        A.add(new ArrayList<>(Arrays.asList(13, 16, 17, 20, 21, 25, 26, 31, 33, 35, 38, 41, 43, 45, 46, 50, 53, 56, 58, 62, 64, 66, 69, 70, 72, 75, 77, 78, 81, 83, 86, 88, 89, 92, 95, 97, 98, 101, 103, 105, 108, 109, 112, 115, 118)));
        A.add(new ArrayList<>(Arrays.asList(15, 19, 21, 23, 25, 26, 27, 34, 36, 37, 39, 43, 45, 46, 49, 53, 56, 58, 60, 64, 66, 67, 70, 72, 74, 77, 80, 81, 84, 85, 88, 89, 92, 95, 98, 101, 102, 103, 106, 109, 112, 114, 115, 116, 120)));
        A.add(new ArrayList<>(Arrays.asList(17, 22, 24, 25, 26, 28, 31, 35, 39, 41, 43, 44, 46, 48, 50, 54, 57, 60, 61, 66, 68, 70, 71, 75, 76, 78, 81, 83, 85, 88, 89, 92, 93, 98, 101, 102, 104, 107, 109, 110, 115, 116, 118, 120, 123)));
        A.add(new ArrayList<>(Arrays.asList(20, 23, 27, 28, 31, 32, 35, 37, 40, 44, 47, 48, 51, 52, 55, 56, 58, 63, 65, 67, 70, 72, 75, 77, 78, 80, 84, 86, 87, 91, 93, 94, 96, 101, 103, 106, 108, 109, 110, 113, 116, 117, 119, 122, 125)));
        A.add(new ArrayList<>(Arrays.asList(22, 24, 28, 31, 33, 36, 39, 42, 43, 45, 50, 51, 53, 56, 57, 60, 61, 64, 68, 69, 72, 73, 78, 80, 83, 85, 86, 89, 90, 94, 95, 97, 100, 102, 104, 109, 110, 113, 114, 116, 117, 119, 122, 124, 128)));
        A.add(new ArrayList<>(Arrays.asList(24, 25, 31, 33, 34, 38, 42, 43, 44, 47, 51, 53, 54, 57, 58, 62, 65, 66, 71, 73, 75, 77, 79, 82, 85, 86, 87, 90, 91, 97, 98, 101, 103, 105, 106, 110, 112, 114, 115, 118, 121, 123, 126, 129, 132)));
        A.add(new ArrayList<>(Arrays.asList(27, 29, 33, 34, 36, 40, 43, 44, 46, 48, 53, 54, 57, 58, 61, 65, 67, 69, 74, 76, 79, 81, 83, 84, 88, 89, 91, 93, 96, 98, 100, 104, 106, 108, 110, 112, 114, 116, 118, 120, 123, 125, 128, 130, 134)));
        A.add(new ArrayList<>(Arrays.asList(30, 32, 35, 36, 38, 42, 44, 47, 48, 51, 56, 59, 60, 62, 64, 66, 70, 73, 76, 77, 81, 82, 85, 88, 90, 91, 93, 95, 98, 100, 102, 106, 108, 110, 113, 114, 116, 118, 120, 122, 126, 129, 132, 133, 135)));
        A.add(new ArrayList<>(Arrays.asList(32, 34, 38, 39, 42, 45, 47, 49, 52, 54, 59, 61, 63, 66, 69, 71, 72, 74, 79, 82, 84, 85, 86, 89, 92, 95, 97, 100, 103, 104, 105, 107, 109, 112, 115, 116, 119, 120, 123, 126, 129, 130, 133, 135, 137)));
        A.add(new ArrayList<>(Arrays.asList(34, 35, 40, 41, 43, 48, 50, 52, 53, 57, 62, 64, 66, 69, 70, 72, 75, 77, 81, 83, 86, 89, 92, 95, 96, 99, 101, 104, 105, 106, 108, 111, 112, 114, 118, 119, 122, 123, 124, 128, 130, 132, 135, 136, 140)));
        A.add(new ArrayList<>(Arrays.asList(36, 39, 42, 43, 46, 51, 54, 56, 58, 59, 65, 68, 69, 71, 74, 75, 77, 78, 84, 85, 87, 90, 95, 97, 100, 103, 104, 107, 109, 111, 112, 115, 116, 119, 122, 124, 127, 130, 133, 135, 137, 139, 140, 143, 145)));
        A.add(new ArrayList<>(Arrays.asList(39, 40, 43, 44, 48, 54, 56, 58, 60, 63, 68, 70, 73, 74, 76, 78, 81, 82, 86, 89, 90, 93, 96, 98, 101, 105, 106, 108, 110, 114, 115, 116, 118, 122, 123, 127, 129, 132, 135, 137, 140, 142, 145, 146, 148)));
        int B = 1; */

        System.out.println(solve(A, B));
    }

    public static int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int N = A.size();  // Row Size
        int M = A.get(0).size(); //Column Size

        int i = 0;
        int j = M - 1;

        while (i < N && j >= 0) {
            if (A.get(i).get(j) == B) {    // Case 1: A[i][j] == B, element is found
                // Checking for duplicate in same row, because we need to return smallest value of i & j
                // If the element just before the current is same, decrement j. Here (j != 0) to handle index out of bounds
                if (j != 0 && (A.get(i).get(j - 1) == B)) {
                    j--;
                } else {
                    // If the above condition is not satisfied, return i & j. Here (i+1) & (j+1)  because of 1 base indexing.
                    return ((i + 1) * 1009 + (j + 1));
                }

            } else if (A.get(i).get(j) < B) { // Case 2:  When A[i][j] < B
                i++;
            } else {     // Case 3:  When A[i][j] > B
                j--;
            }
        }
        return -1;
    }
}
