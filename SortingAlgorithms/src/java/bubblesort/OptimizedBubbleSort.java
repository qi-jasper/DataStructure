package bubblesort;

/**
 * @Description 优化后的冒泡排序
 * @Author qi
 * @Date 2020/8/23 15:17
 * @ClassName OptimizedBubbleSort
 **/
public class OptimizedBubbleSort {

    public static void bubbleSort(int[] array) {
        // 用于临时存放元素
        int temp;
        // 设置一个标志位
        boolean flag = true;

        // 判空
        if (array == null || array.length <= 0) {
            return;
        }


        // 冒泡次数
        for (int i = 0; i < array.length - 1; i++) {
            // 冒泡排序步骤
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    flag = false;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            // 如果在某一次冒泡排序中，没有交换任何元素，表明该数组已有序
            if (flag) {
                break;
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