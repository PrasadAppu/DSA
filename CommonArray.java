public class CommonArray {
    
    public static void main(String[] args) {
     int[] arr1 ={1,3,5,7,8,9};
     int[] arr2  ={9,8,5,6};
     int[] result =commonArray(arr1,arr2);
    }

    private static int[] commonArray(int[] arr1, int[] arr2) {
        int[] result = arr1.length>arr2.length?new int[arr1.length]: new int[arr2.length];

        

        return result;
    }

    

}
