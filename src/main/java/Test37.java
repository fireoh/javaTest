/*
判断数组中的元素值是否对称.
 */
public class Test37 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,3,2,1};
        int[] arr2 = {1,1,2,1,2};
        boolean b1 = true;
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i]==arr2[arr2.length-i-1]){
                b1=true;
            }else {
                b1=false;
            }
        }
        System.out.println(b1);
    }
}
