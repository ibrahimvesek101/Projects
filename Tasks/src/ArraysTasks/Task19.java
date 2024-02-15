package ArraysTasks;

public class Task19 {
    public static void main(String[] args) {
        //Task-> Asagidaki multi dimensional array'lerin ic array'lerinde ayni index'e sahip
        // elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru)
        // arr1 = { {1,2},  {3,4,5}, {6} } ve
        // arr2 = { {7,8,9},{10,11}, {12}
        // output: 64
        int arr1[][]={ {1,2}, {3,4,5}, {6} };
        int arr2[][]={ {7,8,9}, {10,11}, {12} };

        //ilk parantezin içi
        // arr1={1,2}, arr2={7,8,9} = 1 ve 7 aynı konumda (konum: 0,0), 2 ve 8 aynı konumda (konum: 0,1) , 9 la aynı konumda olan bir eleman yok (9un konumu: 0,2)
        //ikinci parantezin içi
        // arr1= {3,4,5}, arr2= {10,11} = 3 ve 10 aynı konumda (konum: 1,0),  4 ve 11 aynı konumda (konum: 1,1) , 5 le aynı konumda olan bir eleman yok (5in konumu: 1,2)
        //üçüncü parantezin içi
        // arr1= {6}, arr2= {12} = 6 ve 12 aynı konumda (konum: 2,0)

        int sum=0;
        for (int i = 0; i < arr1.length; i++){
            for (int k = 0; k< arr2.length ; k++) {
                if (i==k) {
                    for (int j = 0; j < arr1[i].length; j++) {
                        for (int l = 0; l < arr2[k].length; l++) {
                            if (j == l) {sum=sum+arr1[i][j]+arr2[k][l];
                            } } } } } } System.out.println(sum);
    }
}
