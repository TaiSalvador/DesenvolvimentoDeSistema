public class Exercicio03 {
    public static void main(String[] args) {
        Materias m1 = new Materias("Madeira",15.99,5000);
        Materias m2 = new Materias("Ferro",20.99,600);
        Materias m3 = new Materias("Tijolo",13.99,4500);
        Materias m4 = new Materias("Areia",5.99,6000);

        ListaMaterias l1 = new ListaMaterias();

        l1.adicionarMaterias(m1);
        l1.adicionarMaterias(m2);
        l1.adicionarMaterias(m3);
        l1.adicionarMaterias(m4);

    }
}
