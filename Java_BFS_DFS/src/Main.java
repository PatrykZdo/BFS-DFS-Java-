import Graf.Graf;
import Graf.DFS;
import Graf.BFS;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Graf graf= new Graf("plik3.txt");
        if(graf.metoda.equals("DFS")){
            DFS dfs=new DFS (graf);
        }
        else if (graf.metoda.equals("BFS")) {
            BFS bfs=new BFS (graf);
        }

        graf.wypiszOdwiedzonych();

    }
}