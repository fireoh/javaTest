/*
比较两个数组内容是否完全一致。
 */
public class Test38 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {1,2,3,4,5,6,7};

        boolean flag = true;//假设一致
        if(arr1.length!=arr2.length){
            flag = false;
        }else{
            for (int i = 0; i < arr2.length; i++) {
                if(arr1[i] != arr2[i]){
                    flag = false;
                    break;
                }
            }
        }
        System.out.println("是否一致：" + flag);
    }
}
