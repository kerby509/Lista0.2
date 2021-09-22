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
    
}
