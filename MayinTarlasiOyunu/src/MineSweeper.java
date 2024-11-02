import java.util.Scanner;
import java.util.Random;
public class MineSweeper {
    String[][] board;              //Mayınları gösterecek tablo
    String[][] displayBoard;      //Kullanıcıya gösterilecek tablo

    int rowCount;        //Satır sayısı
    int colCount;        //Sütun sayısı
    int mineCount;       //Mayın sayısı
    boolean gameOver;    //Oyun Kontrolü

    MineSweeper(){
        this.gameOver=false;
        setupGame();    //Bu metotda oyun kurulumu yapılcak
        placeMines();   //Mayınları yerleştirme
        playGame();
    }

    void setupGame(){
        Scanner sc = new Scanner(System.in);
        // Kullanıcıdan matris boyutunu alma, Minimum 2x2 boyutunda matris grişine izin verilmeli
        do{
            System.out.print("Satır sayısını giriniz (minimum 2) : ");
            rowCount = sc.nextInt();
            System.out.print("Sütun sayınısını giriniz (minimum 2) : ");
            colCount = sc.nextInt();

            if(rowCount < 2 || colCount < 2){
                System.out.println("Lütfen 2x2'den büyük boyutlar giriniz . ");
            }

        }while(rowCount < 2 || colCount < 2 );

        //tabloları oluşturma ve değerleri belirleme
        board = new String [rowCount][colCount];
        displayBoard = new String[rowCount][colCount];

        for(int i = 0; i < rowCount; i++){
            for(int j = 0; j < colCount; j++){
                board[i][j] = "-";
                displayBoard[i][j] = "-";

            }
        }

        mineCount=(rowCount*colCount)/4;

    }
    void placeMines(){
        Random rand = new Random();
        int minePlaced=0;

        while(minePlaced<mineCount){
            int row=rand.nextInt(rowCount);
            int col=rand.nextInt(colCount);
            if(!board[row][col].equals("*")){
                board[row][col]="*";
                minePlaced++;
            }

        }

    }

    void playGame(){
        Scanner sc = new Scanner(System.in);
        boolean[][] revealed = new boolean[rowCount][colCount];
        int revealedCount = 0;  //Açılan hücre sayısı

        while(!gameOver){
            printBoard(displayBoard);

            System.out.print("Bir hücre seçin (satır sütun): ");
            int selectedRow = sc.nextInt();
            int selectedCol = sc.nextInt();

            //Koordinat Kontrolü
            if(selectedRow < 0 || selectedRow >= rowCount || selectedCol < 0 || selectedCol >= colCount){
                System.out.println("Geçersiz koordinatlar, lütfen tekrar girin. ");
                continue;
            }
            //Önceden yazılmışsa
            if(revealed[selectedRow][selectedCol]){
                System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin. ");
                continue;
            }

            revealed[selectedRow][selectedCol] = true;

            //Mayınlara mı denk geldi diye bakıyoruz
            if (board[selectedRow][selectedCol].equals("*")) {
                System.out.println("Kaybettiniz! Mayına bastınız.");
                gameOver = true;
                break;
                //Oyun bittiği için break yazmalıyız
            }

            //Mayınları hesaplama
            int mineCountAround = countMinesAround(selectedRow, selectedCol);
            displayBoard[selectedRow][selectedCol] =Integer.toString(mineCountAround);
            revealedCount++;

            //Oyunu kazanma şartı
            if (revealedCount == (rowCount * colCount) - mineCount) {
                System.out.println("Tebrikler! Oyunu kazandınız.");
                gameOver = true;
            }

        }


        printBoard(board);

    }

    void printBoard(String[][] board){
        System.out.println("Oyun Tahtası : ");
        for(String[] row : board){
            for(String cell : row){
                System.out.print(cell+" ");
            }
            System.out.println();
        }

    }

    int countMinesAround(int row, int col){
        int count = 0;
        for(int i= row-1; i<= row+1; i++){
            for(int j= col-1; j<= col+1; j++){
                if(i >= 0 && i < rowCount && j >= 0 && j < colCount){
                    if(board[i][j].equals("*")){
                        count++;
                    }


                }

            }
        }

        return count;
    }

}