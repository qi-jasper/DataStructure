package insertionsort;

import java.util.Arrays;

/**
 * @Description 直接插入排序
 * @Author qi
 * @Date 2021/7/6 20:37
 * @ClassName InsertionSort
 **/
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {6, 33, 2, 7, 1, 5, 9, 32, 3, 10};
        insertionSort(arr);
    }

    /**
     * 插入排序
     *
     * 1. 从第一个元素开始，该元素可以认为已经被排序
     * 2. 取出下一个元素，在已经排序的元素序列中从后向前扫描
     * 3. 如果该元素（已排序）大于新元素，将该元素移到下一位置
     * 4. 重复步骤 3，直到找到已排序的元素小于或者等于新元素的位置
     * 5. 将新元素插入到该位置后
     * 6. 重复步骤 2 ~ 5
     * @param array  待排序数组
     */
    public static void insertionSort(int[] array){
        if (array == null || array.length <= 0) {
            System.out.println("请传入不为空的数组！");
            return;
        }

        // 默认 arr[0] 是有序的
        for( int i = 1; i < array.length; i++ ) {
            // 取出下一个元素
            int temp = array[i];
            // 在已经排序的元素序列中从后向前扫描
            for( int j = i; j >= 0; j-- ) {
                if( j > 0 && array[j-1] > temp ) {
                    // 如果该元素（每次从已经排序的里面取出的元素）大于取出的元素 temp，则将该元素移到下一位置
                    array[j] = array[j-1];
                    System.out.println("Temping:  " + Arrays.toString(array));
                } else {
                    // 将新元素插入到该位置后
                    array[j] = temp;
                    System.out.println("Sorting:  " + Arrays.toString(array));
                    break;
                }
            }
        }
    }

    /**
     * 交换次数较多的实现
     * @param array 待排序的数组
     */
    public static void insertionSortManyTimes(int[] array){
        for( int i = 0; i < array.length - 1; i++ ) {
            for( int j = i + 1; j > 0; j-- ) {
                if( array[j-1] <= array[j] ) {
                    break;
                }
                // 交换操作
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
                System.out.println("Sorting:  " + Arrays.toString(array));
            }
        }
    }
}