package selectsort;

/**
 * @Description 选择排序
 * @Author qi
 * @Date 2020/8/23 15:21
 * @ClassName SelectSort
 **/
public class SelectSort {

    public static void selectSort(int[] array) {
        // 判空
        if (array == null || array.length <= 0) {
            return;
        }

        // 选择排序的次数
        for (int i = 0; i < array.length - 1; i++) {
            // 存放最小的数
            int min = array[i];
            // 存放最小数的下标
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                array[minIndex] = array[i];
                array[i] = min;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arrays = {4, 7, 2, 3, 9, 2};
        System.out.println("排序前：");
        for (int element : arrays) {
            System.out.print(element + " ");
        }

        selectSort(arrays);

        System.out.println("\n" + "排序后：");
        for (int element : arrays) {
            System.out.print(element + " ");
        }
    }
}