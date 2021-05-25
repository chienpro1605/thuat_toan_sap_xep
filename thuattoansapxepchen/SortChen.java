package thuattoansapxepchen;

public class SortChen {
    public static void main(String[] args) {
//        int[] list = {25,5,1,6,8,9,18,23};
        int [] list = new int[6];
        list[0] = -34;
        list[1] = 3;
        list[2] = -3;
        list[3] = 6;
        list[4] = -1;
        list[5] = 2;
        inseartSort(list);

        for (int i = 0; i<list.length; i++){
            System.out.print(list[i] + " ");
        }
    }
    public static void inseartSort(int [] list){
        for (int i = 1; i<list.length; i++){
            int currenelement = list[i];
            int k;
            for (k = i-1;k>=0 && list[k] > currenelement; k--){
                list[k+1] = list[k];
            }
            list[k+1] = currenelement;
        }
    }
}
