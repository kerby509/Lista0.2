public class Bebida {
    int codigoBeb;
    String nomeBeb;
    float teorAlc;
    float qutml;
    float precoDeVenda;
    int qutDispoEmEstoque;


    Bebida(int a,String b,float c,float d, float e, int f){

        this.codigoBeb= a;
        this.nomeBeb=b;
        this.teorAlc=c;
        this.qutml=d;
        this.precoDeVenda=e;
        this.qutDispoEmEstoque=f;
        
    }

    void ComprarBebida(int qutComp){
        if(qutComp>0){
            this.qutDispoEmEstoque+=qutComp;
        }

    }
    void VenderBebida(int venda){
         if(this.qutDispoEmEstoque>=venda){
             this.qutDispoEmEstoque-=venda;
         System.out.println("Venda realizada com sucesso");
        }else{
            System.out.println("Estoque insuficiente");
        }

    }
    


}
