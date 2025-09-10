public class Exercicio02 {
    public static void main(String[] args) {

        Floricultura f1 = new Floricultura("Jasmim", 2.55,"João", true);
        Floricultura f2 = new Floricultura("Tulipia", 5.99,"Jessica", false);
        Floricultura f3 = new Floricultura("Rosa", 10.99, "Tainá", true);
        Floricultura f4 = new Floricultura("Orquidea", 15.99,"Thomas", true);

        ListaFloricultura l1 = new ListaFloricultura();

        l1.adicionarFlor(f1);
        l1.adicionarFlor(f2);
        l1.adicionarFlor(f3);
        l1.adicionarFlor(f4);

        System.out.println(l1.obterListaFlores());

    }
}
