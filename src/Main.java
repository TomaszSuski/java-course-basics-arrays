public class Main {

    public static void main(String[] args) {

        /*
        tablice się typuje i rezerwuje miejsce w pamięci:
            int[] tab; - deklaracja tablicy intów o nazwie tab
            tab = new int[5]; - rezerwacja miejsca w pamięci dla tablicy z pięcioma intami

        deklaracja i rezerwacja w jednej linii:
            int[] tab = new int[5];

        indeksowanie tablic od 0

            tab[0] = 20; - przypisanie wartości pierwszego elementu


        deklaracja z przypisaniem wartości od razu:
            int[] tab2 = {4, 12, 3, 9}; - tablica czteroelementowa z przypisanymi wartościami


        długość tablicy: length
        tab2.length = 4

        odwołanie do ostatniego elementu:
        tab2[tab2.length-1]
         */

//         =========================================================

            /*
            Tablice WIELOWYMIAROWE

            dwa indeksy (lub więcej)
            ------------------------------------
               [0][0]   |  [0][1] |   [0][2]   |
            ------------------------------------
            ------------------------------------
               [1][0]   |  [1][1] |   [1][2]   |
            ------------------------------------
            ------------------------------------
               [2][0]   |  [2][1] |   [2][2]   |
            ------------------------------------
            ------------------------------------
               [3][0]   |  [3][1] |   [3][2]   |
            ------------------------------------


        */

//      indeks pierwszy - wiersze; drugi - kolumny
//      poniżej tablica 4 wiersze 3 kolumny - jak na schemacie wyżej
        int[][] tab = new int[4][3];

        tab[0][0] = 25;
        tab[3][2] = 70;

        System.out.println(tab[3][2]);

        int[][] tab2 =
                {
                        {4, 15, 17},
                        {5, 12, 125},
                        {651, 1256, -24},
                        {6555, 2, -2444}
                };

        System.out.println(tab2[3][0]);
    }
}
