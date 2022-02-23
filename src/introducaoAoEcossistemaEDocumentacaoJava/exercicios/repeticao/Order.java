package introducaoAoEcossistemaEDocumentacaoJava.exercicios.repeticao;

public class Order {

    private final String code;
    private String [] items;
    private final int totalValue;

    public Order(String code, int totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }


    public void printItems() {
        //vamos percorrer a lista para exibir ela
        /* COM WHILE
        while (i <items.length) {
            System.out.println(items[i]);
            i++;
         */

        /*COM DO WHILE

        do {
            System.out.println(items[i]);
            i++;
        } while (i < items.length);
         */


        /*COM FOR
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
         */

        /*COM  Enhanced for
         */

        for (String i : items) { //dessa forma o java ja entende que precisa pegar os items e atribuir a essa variavel i
            System.out.println(i);
        }
    }
}
