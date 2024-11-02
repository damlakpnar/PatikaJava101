import java.util.Arrays;
public class Main {
    static boolean tekrarEtme(int[]arr,int n){
        boolean[] tekrar= new boolean[n];
        Arrays.fill(tekrar,false);

        for(int i=0 ; i< n; i++ ){

            if(tekrar[i]==true){
                continue;
            }
            int count=1;
            for(int j=i+1 ; j< n; j++ ){
                if(arr[j]==arr[i]){
                    tekrar[j]=true;
                    count++;
                }
            }

            if (count >= 1) {
                System.out.println(arr[i] + " sayısı " + count+" kere tekrar edildi. ");
            }

        }


        return false;
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int n=list.length;
        System.out.println("****************************************");
        System.out.println("DİZİ : "+Arrays.toString(list));
        System.out.println("****************************************");
        System.out.println("Tekrar Sayıları : ");
        tekrarEtme(list,n);

    }
}
//Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.