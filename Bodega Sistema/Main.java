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



        }while(opt!=7);

       
   
   
   
    }
    
}
