import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/*
知识点：方法的重载
案例：
声明一个数组工具类MyArrays，包含如下方法：
1、int binarySearch(int[] arr, int value)：
使用二分查找法在arr数组中查找value的下标，如果value不存在，就返回-1，如果数组arr不是有序的，结果将不一定正确
2、int binarySearch(char[] arr, char value)：
使用二分查找法在arr数组中查找value的下标，如果value不存在，就返回-1，如果数组arr不是有序的，结果将不一定正确
3、int binarySearch(double[] arr, double value)：
使用二分查找法在arr数组中查找value的下标，如果value不存在，就返回-1，如果数组arr不是有序的，结果将不一定正确
4、int[] copy(int[] arr , int length)：
从指定的arr数组的arr[0]开始复制得到一个新数组，新数组的长度为length。
5、double[] copy(double[] arr , int length)：
从指定的arr数组的arr[0]开始复制得到一个新数组，新数组的长度为length。
6、char[] copy(char[] arr , int length)：
从指定的arr数组的arr[0]开始复制得到一个新数组，新数组的长度为length。
7、void sort(int[] arr)：可以给arr数组从小到大排序，用冒泡排序实现
8、void sort(char[] arr)：可以给arr数组从小到大排序，用冒泡排序实现
9、void sort(double[] arr)：可以给arr数组从小到大排序，用冒泡排序实现
 */
public class Test53 {
    public static void main(String[] args) {
        MyArrays01 myArrays01 = new MyArrays01();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(myArrays01.binarySearch(arr, 11));
        int[] arr1 = {3,7,2,5,1};
        myArrays01.sort(arr1);
    }
}


class MyArrays01{
    public int binarySearch(int[] arr, int value){
        int left = 0;
        int right = arr.length-1;
        int mid = (right-left)/2;
        while(right>left){
            for (int i = left; i <= right; i++,left++) {
                if(value==arr[left]){
                    return left;
                }else if(value>arr[mid]){
                    left = mid;
                    mid = (right-left)/2+left;
                }else if(value<arr[mid]){
                    right = mid;
                    mid = (right-left)/2;
                }
            }
        }
        return -1;
    }

    public int[] copy(int[] arr , int length){
        int[] arr1 = new int[length];
        for (int i = 0; i < arr.length; i++) {
            if(arr1.length>i+1){
                arr1[i]=arr[i];
            }
        }
        return arr1;
    }

    public void sort(int[] arr){
        int temp;
        for(int i=1;i<arr.length;i++){
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}