package Graf;

import java.util.ArrayList;
import java.util.List;

public class DFS extends PrzegladanieGrafu {
    public List<Integer> s=new ArrayList<Integer>();

    public DFS(Graf g){
        przegladaj(g);
    }

    @Override
    public void wstaw(Integer v, Graf g){
        if(!g.odwiedzony.get(v)){
            g.odwiedzony.set(v,true);
            g.wyjscie.add(v);
            for (int i=0;i<g.odwiedzony.size();i++){
                if(g.macierzSasiedztwa[v][i]==1){
                    s.add(i);
                }
            }
        }
    }

    @Override
    public int pobierz(){
        int x=s.get(s.size()-1);
        s.remove(s.size()-1);
        return x;
    }

    @Override
    public void przegladaj(Graf g){
        s.add(g.start);
        while(s.size()!=0){
            int v=pobierz();
            wstaw(v,g);
        }

        }
}

