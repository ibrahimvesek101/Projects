package ArraysTasks;

public class Task21 {
    public static void main(String[] args) {
        /* TASK :
		ayna check sorusu: verilen Arrayın Ayna array olmasını
		kontrol eden code create ediniz
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */

        int arr[] = {1, 2, 3, 4, 4, 3, 2};
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
