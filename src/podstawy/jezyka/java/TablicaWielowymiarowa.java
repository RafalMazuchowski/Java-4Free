package podstawy.jezyka.java;
// Tablice wielowymiarowe 1.15

public class TablicaWielowymiarowa {
    public static void main(String[] args) {
        int[][] tablica = new int[2][3];
        int licznik=0;
        int k=0;
        
        for(int i=0;i<tablica.length;i++){
            for(int j=0;j<tablica[k].length;j++){
                
                //i=0, i<tablica.length, j=0, <j<tablica[i].length, (wnętrze), j++, i++, i<tablica.length, <j<tablica[i].length, (wnętrze), j++, i++ ...
                System.out.println(tablica[i].length);
                tablica[i][j]=licznik++;
                System.out.printf("tab[%d][%d]=%d \n", i, j, tablica[i][j]);
            }
            
        }
    }

}