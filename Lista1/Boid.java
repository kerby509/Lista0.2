package Lista1;

public class Boid extends Entidade {
    private int energia;
    private Forca velocidade;
    
    public int getEnergia(){
        return this.energia;
    }

    public void setEnergia(int energia){
        this.energia = energia;
    }

    public Forca getVelocidade(){
        return this.velocidade;
    }

    public void setVelocidade( Forca v){
        this.velocidade = v;
    }
}
