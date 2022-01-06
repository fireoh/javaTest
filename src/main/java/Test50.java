/*
案例：

声明一个数组管理工具类MyArrays，包含如下方法：
void sort(int[] arr)：可以为任意一维整型数组arr实现从小到大排序
int indexOf(int[] arr, int value)：
可以在任意一维整型数组arr中查找value值的下标，如果不存在返回-1
int[] copy(int[] arr, int len)：
可以实现从任意一维数组arr中复制一个新数组返回，新数组的长度为len，从arr[0]开始复制
void print(int[] arr)：可以打印数组的元素，效果：[1,2,3,4,5]
 */
public class Test50 {
    public static void main(String[] args) {
        MyArrays myArrays = new MyArrays();
        int[] arr = {1,4,2,6,5};
        myArrays.sort(arr);
        myArrays.print(arr);
        myArrays.indexOf(arr,6);
        myArrays.print(myArrays.copy(arr,3));
    }
}

class MyArrays {
    void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    int indexOf(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                return i;
            }
        }
        return 0;
    }

    int[] copy(int[] arr, int len){
        int[] newArray = new int[len];
        for (int i = 0; i < arr.length; i++) {
            if(newArray.length>=i+1){
                newArray[i] = arr[i];
            }
        }
        return newArray;
    }

    void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print("\t");
        }
    }
}