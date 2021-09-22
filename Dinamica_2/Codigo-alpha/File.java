public class File {
    private String nome;
    private String caminho;
    private String[] linhas;

    private boolean ehIndiceValido(int indice) {
        if(indice < 0 || indice > quantasLinhas()) {
            return false;
        } else {
            return true;
        }
    }

    public File() {
        this("?", "?", new String[1]);
        setLinha(0, "?");
    }

    public File(String nome, String caminho) {
        this(nome, caminho, new String[1]);
    }

    public File(String nome, String caminho, String[] linhas) {
        this.nome = nome;
        this.caminho = caminho;
        this.linhas = linhas;
    }
    
}
