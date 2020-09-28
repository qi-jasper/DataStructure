package bubblesort;

/**
 * @Description 经典冒泡排序算法
 * @Author qi
 * @Date 2020/8/23 13:32
 * @ClassName BubbleSort
 **/

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        // 用于临时存放元素
        int temp;

        // 判空
        if (array == null || array.length <= 0) {
            return;
        }

        // 冒泡次数
        for (int i = 0; i < array.length - 1; i++) {
            // 冒泡排序步骤
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arrays = {4, 7, 2, 3, 9, 2};
        System.out.println("排序前：");
        for (int element : arrays) {
            System.out.print(element + " ");
        }

        bubbleSort(arrays);

        System.out.println("\n" + "排序后：");
        for (int element : arrays) {
            System.out.print(element + " ");
        }
    }
}