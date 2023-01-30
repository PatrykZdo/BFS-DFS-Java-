Poniższy projekt jest rozwiązaniem zadania którego treść brzmi następująco:

Utworzyć klasę abstrakcyjną PrzegladanieGrafu realizującą algorytm przeglądania grafu. Klasa ta ma zawierać:

- abstrakcyjną metodę wstaw(args) - metoda ta ma dodawać kolejne wierzchołki do odwiedzenia - implementacja tej metody jest kluczowa i będzie różnie wyglądać w zależności od sposobu przeglądania grafu (wszech lub w głąb). Argumentem dla tej metody ma być wierzchołek do wstawienia, ale może zawierać też więcej argumentów.

- abstrakcyjną metodę pobierz() - metoda ma zwracać kolejny wierzchołek do odwiedzenia z listy

- metodę przegladaj() - która jako argument ma otrzymywać reprezentację grafu. W metodzie tej ma się odbywać właściwe przeglądanie grafu otrzymanego jako argument, w metodzie tej należy użyć metod wstaw() i pobierz(). Metoda te może ale nie musi być abstrakcyjna - w zależności od wyboru osoby piszącej kod.

Reprezentacja grafu: graf ma być wczytywany z pliku (nazwa pliku może być wpisana w kodzie "na sztywno"). Graf można reprezentować w dowolny sposób, na przykład jak listę sąsiedztwa (użycie List), jako macierz sąsiedztwa (użycie tablicy), jako osobną klasę (w klasie tej należy zawrzeć listę sąsiedztwa lub macierz sąsiedztwa), można też stworzyć klasę reprezentującą wierzchołek i graf reprezentować jako listę obiektów tej klasy.

Następnie napisz klasy DFS oraz BFS dziedziczące z PrzegladanieGrafu i realizujące algorytmy przeglądania grafu w głąb oraz wszerz. Kluczowym elementem w obu klasach będzie jakiś rodzaj listy (może to być modyfikacja listy reprezentującej graf, w zależności od implementacji, lista ta może znajdować się już w klasie PrzegladanieGrafu i być z niej dziedziczona), która będzie zawierać kolejne wierzchołki do odwiedzenia, a wierzchołki, które zostaną już odwiedzone mają być z tej listy usuwane lub oznaczane w jakiś sposób jako odwiedzone. To do tej listy elementy ma dodawać metoda wstaw(), a zwracać metoda pobierz(). Obsługa tej listy (czyli działanie metody wstaw() i pobierz()) jest kluczowym elementem programu oraz będzie elementem rozróżniającym DFS i BFS.

Pobierz dane z pliku o następującej formie:

linia 1: lista N wierzchołków grafu oddzielona spacjami (każdy wierzchołek to litera

linie 2-N+1: listy sąsiedztwa oddzielone spacjami (wierzchołek lista sąsiadów)

linia N+2: wierzchołek startowy

linia N+3: algorytm (DFS lub BFS)

Wyświetl wierzchołki w kolejności odwiedzin.

Przykład

Plik:

A B C D E

A B

B A C D

C B E

D B

E C

A

BFS

Wyjście:

A B C D E