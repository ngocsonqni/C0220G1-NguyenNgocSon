package LopVaDoiTuong.BaiTap;
import java.util.Arrays;
import java.util.Random;
public class StopWatching_b {
        public static void main(String[] args) {
            final int n = 100000;
            Integer[] arr = StopWatching_b.creatRandom(n);
            System.out.print("Given array: ");
            System.out.println(Arrays.toString(arr));

            StopWatching_a stopWatch = new StopWatching_a();
            stopWatch.start();
            selectionSort(arr);
            stopWatch.end();

            System.out.print("Sorted array:");
            System.out.println(Arrays.toString(arr));
            System.out.println("The array of " + n + " random elements has been sorted after " + stopWatch.getElapsedTime() + " milliseconds.");
        }

        private static void selectionSort(Integer[] arr) {
            for (int i = 0; i < arr.length; i++) {
                int min = arr[i];
                int indexOfMin = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < min) {
                        min = arr[j];
                        indexOfMin = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[indexOfMin];
                arr[indexOfMin] = temp;
            }
        }

        public static Integer[] creatRandom(int n) {
            Random randomNum = new Random();
            Integer[] arr = new Integer[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = randomNum.nextInt(n);
            }
            return arr;
        }
    }
