public class Main {
    public static void main(String[] args){
        
        Circulo c1 = new Circulo( 22,7.00,8.00);
        

        System.out.println("O raio eh : " + c1.getRaio());
        System.out.println("A area eh : " + c1.area);
        System.out.println("A circunf eh : " + c1.circunf);
// aqui tentando dar um valor que não pode inferior ao valor principal do raio
        c1.setRaio(21);
        System.out.println("Raio: " + c1.getRaio());


    }
    
}
