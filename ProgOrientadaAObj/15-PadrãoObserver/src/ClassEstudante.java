public class ClassEstudante implements InterfaceAssinante {
    private String nome;

    public ClassEstudante(String nome) {
        this.nome = nome;
    }

    @Override
    public void receberMensagem(String msg) {
        System.out.printf("%s está lendo a mensagem %s no intervalo da aula%n", this.nome, msg);
    }
}