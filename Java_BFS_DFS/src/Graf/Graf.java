package Graf;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Graf {
    public List<String> wierzcholki;
    public List<Integer> wyjscie;
    public List<Boolean> odwiedzony;
    public int [][]macierzSasiedztwa;
    public int start;
    public String metoda;

    public Graf(String name) {
        this.wierzcholki=new ArrayList<String>();
        this.odwiedzony=new ArrayList<Boolean>();
        this.wyjscie=new ArrayList<Integer>();
        wczytywanieGrafu(name);
        for(int i=0;i<wierzcholki.size();i++){
            odwiedzony.add(false);
        }
    }

    public void wczytywanieGrafu(String name){
        try {

            File plik = new File(name);
            FileReader fr = new FileReader(plik);
            BufferedReader br=new BufferedReader(new FileReader(plik));

            if(!fr.ready())return;




            String st;
            int linia=1;
            while((st=br.readLine())!=null){
                if(linia==1){
                    for(int i=0;i<st.length();i++){
                        if((int)st.charAt(i)==32){
                            continue;
                        }
                        else {
                            wierzcholki.add(Character.toString(st.charAt(i)));
                        }
                    }
                    this.macierzSasiedztwa=new int[wierzcholki.size()][wierzcholki.size()];
                }
                else if(linia<=(wierzcholki.size()+1)){
                    int w=0;
                    for (int i=0;i<wierzcholki.size();i++){
                        if((Character.toString(st.charAt(0))).equals(wierzcholki.get(i))) {
                            w=i;
                            break;
                        }
                    }
                    for (int i=2;i<st.length();i+=2){
                        int s=0;
                        for (int j=0;j<wierzcholki.size();j++){
                            if((Character.toString(st.charAt(i))).equals(wierzcholki.get(j))) {
                                s=j;
                                break;
                            }
                        }
                        macierzSasiedztwa[w][s]=1;
                        macierzSasiedztwa[s][w]=1;
                    }
                }
                else if(linia==(wierzcholki.size()+2)){
                    for(int i=0;i<wierzcholki.size();i++){
                        if((Character.toString(st.charAt(0))).equals(wierzcholki.get(i))){
                            this.start=i;
                            break;
                        }
                    }

                }
                else if(linia==(wierzcholki.size()+3)){
                    this.metoda=st;
                }
                linia=linia+1;
            }


            fr.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void wypiszOdwiedzonych(){
        for(int i=0;i<this.wyjscie.size();i++){
            System.out.print(this.wierzcholki.get(this.wyjscie.get(i))+" ");
        }
    }


}
