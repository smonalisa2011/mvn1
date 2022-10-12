public class a2 {
//    input = ,
//    24 = sum of a triplet
public static void main(String[] args) throws Exception {
    int arr[] = {10,11,1,2,8,5,6,3};
    int sum = 24;

    int[][] triplet = new int[10][3];
    int q=0;
    for(int i=0; i<arr.length;i++){

//        for (int j=1;j<arr.length;j++){  <-- Here for i=3 i.e. arr[2] it was still starting the j from 1 i.e. arr[1]

        for(int j=i+1;j<arr.length;j++){  // so changed the logic to -> j will not take lesser/same value than i.
//            if(arr[i]!=arr[j]){
//            for(int k=2;k<arr.length;k++) {

            for(int k=j+1;k<arr.length;k++){ // same change done here for k
//                if (arr[j] != arr[k] && arr[i]!=arr[k]) {
                    if (sum == arr[i] + arr[j] + arr[k] ) {

//                        a = arr[i];
//                        b = arr[j];
//                        c = arr[k];
//                        System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);

                        triplet[q][0] = arr[i];
                        triplet[q][1] = arr[j];
                        triplet[q][2] = arr[k];

                    /*    System.out.println();
                        System.out.print(triplet[q][0]+",");
                        System.out.print(triplet[q][1]+",");
                        System.out.print(triplet[q][2]);
                        System.out.println();
                        System.out.println(); */
                        q++;
                    }

//                else System.out.println("False");
//                }
            }
//            }
        }
    }
    System.out.println();
    if( q!=0){
        System.out.println("triplets found for the sum (24) are: ");
        for(int x = 0;x< 3;x++){
            System.out.print(x+" ->  ");
            for(int y = 0;y< 3;y++){
                System.out.print(triplet[x][y]+"  ");
            }
            System.out.println();
        }
    }

    else System.out.println("false");
}
}
