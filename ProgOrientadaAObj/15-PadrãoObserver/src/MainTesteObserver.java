public class MainTesteObserver {
    public static void main(String[] args) {
        ClassYoutuber felipe = new ClassYoutuber("Felipe Dechamps");
        ClassYoutuber guanabara = new ClassYoutuber("Gustavo Guanabara");
        ClassYoutuber ibere = new ClassYoutuber("Iberê");

        ClassEstudante fabio = new ClassEstudante("Fabio");
        ClassEstudante maria = new ClassEstudante("Maria");
        ClassEstudante pedro = new ClassEstudante("Pedro");
        ClassEstudante juliana = new ClassEstudante("Juliana");

        ibere.adicionar(fabio);
        guanabara.adicionar(maria);
        felipe.adicionar(pedro);
        guanabara.adicionar(juliana);
        ibere.adicionar(juliana);

        guanabara.notificar("Venha aprender HTML e CSS");
        ibere.notificar("Vamos colocar o submarino na agua");
        felipe.notificar("IA no dia a dia");
    }
}
