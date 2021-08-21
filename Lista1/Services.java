package Lista1;

public class Services extends Entidade {
    public static int contaPossiveisCandidatos(Inimigo i[]){
        int cont = 0;

        for(int j=0; j<i.length; j++){
            Posicao posicao = i[j].getPosicao();
            Forca velocidade = i[j].getVelocidade();
            int energia = i[j].getEnergia();

            if(posicao.getX()>100 || posicao.getY()>100 && energia<= 50 && velocidade.tamanho()==200){
                cont++;
            }

        }
        return cont;   
    }
}
