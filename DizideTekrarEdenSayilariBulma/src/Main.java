public class Main {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] list={5,7,18,2,0,5,18,5,6,6,6,92,0,4};
        int[] duplicate = new int[list.length];
        int startIndex=0;

        for(int i=0;i<list.length;i++){
            for(int j=0 ; j<list.length;j++){
                if((i!=j)&& (list[i]==list[j])){
                    if(list[i] % 2 == 0 && !isFind(duplicate,list[i])){
                        duplicate[startIndex++]=list[i];

                    }
                    break;
                }
            }
        }

        for(int value: duplicate){
            if(value!=0){
                System.out.println(value);
            }
        }


    }
}
//Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program yazalım.