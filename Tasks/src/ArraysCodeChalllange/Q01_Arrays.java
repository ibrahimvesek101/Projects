package ArraysCodeChalllange;

public class Q01_Arrays {
        //Type a method to check if an int Array is symmetrical or not.

        public static void main(String[] args) {
            int arr[] = {1, 2, 3, 4, 4, 3, 2, 1};
            String dizininBasi= "";
            String dizininSonu= "";

            for (int i = 0; i < arr.length/2; i++) {
                dizininBasi+=String.valueOf(arr[i]);
            }
            for (int i = arr.length-1; i >= arr.length/2 ; i--) {
                dizininSonu+=String.valueOf(arr[i]);
            }
            if (dizininBasi.equals(dizininSonu)) {
                System.out.println("simetriktir");
            } else {
                System.out.println("simetrik değildir");
            }
        }
    }

