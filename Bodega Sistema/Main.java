import java.util.*;

public class Main {
    public static void main(String[] args) {
        
         int cliente=0;
         int bebida=0;
         int cod;


    
         Scanner entrada = new Scanner(System.in);
// criando um array aqui para conseguir criar uma lista de bebida
        List<Clientes> cachaceiros =new ArrayList<>();
        List<Bebida> bebidas =new ArrayList<>();

        int opt;
    
       Bodega empres=new Bodega("Joãozin da Bogeda","JDF000555879");
        System.out.println("--------------------------------------");
        System.out.println("Nome Da Empresa: "+empres.nomeDaEmpresa);
        System.out.println("CNPJ Da Empresa:"+empres.cnpjDaEmpresa);
        System.out.println("---------------------------------------");

        do{
            
            
             System.out.println("Digite 1. Cadastrar Bebidas;");
             System.out.println("Digite 2. Mostrar Bebidas;");
             System.out.println("Digite 3. Compra de Bebida;");
             System.out.println("Digite 4. Venda de Bebida;");
             System.out.println("Digite 5. Cadastrar clientes;");
             System.out.println("Digite 6. Mostrar clientes;");
             System.out.println("Digite 7. Sair do Sistema;");
             System.out.println("Escolher uma opção");
             
             opt = entrada.nextInt();

             if(opt==1){
               
                System.out.println("Digite o código da bebida: ");
                int codigoBeb = entrada.nextInt();
                System.out.println("Digite o nome da bebida: ");
                String nomeBeb = entrada.next();
                System.out.println("Digite o Teor Alc: ");
                float teorAlc =  entrada.nextFloat();
                System.out.println("Digite a quantidade em (ml): ");
                float qutml =entrada.nextFloat();
                System.out.println("Digite o preco de venda: ");
                float precoDeVenda = entrada.nextFloat();
                System.out.println("Digite a quantidade em estoque");
                int qutDispoEmEstoque = entrada.nextInt();
                
                Bebida beb = new Bebida (codigoBeb,nomeBeb,teorAlc,qutml,precoDeVenda,qutDispoEmEstoque);
                    bebidas.add(beb);
                    bebida+=1;
             
            }else if(opt==2){
                if(bebida>0){
                
             
             for(int i=0;i<bebidas.size();i++){
                 Bebida boisson = bebidas.get(i);
                    System.out.println("o código da bebida: "+boisson.codigoBeb );
                    System.out.println("O nome da Bebida: "+boisson.nomeBeb);
                    System.out.println("O Teor alcoolico: "+ boisson.teorAlc);
                    System.out.println("A quantidade (ml): "+boisson.qutml);
                    System.out.println("O preço de venda: "+boisson.precoDeVenda);
                    System.out.println("A quantidade em estoque disponível: "+boisson.qutDispoEmEstoque);
                    System.out.println("---------------------------------------");
             }
                }else{System.out.println("Não tem bebida");}
            }



        }while(opt!=7);

       
   
   
   
    }
    
}
