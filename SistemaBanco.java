import java.util.Scanner; 
public class SistemaBanco {
    Scanner teclado = new Scanner(System.in);
    double saldo;
    double deposito;
    double saque;
    public void depositar(){

    System.out.println("Quanto deseja depositar ?");
    deposito = teclado.nextDouble();
    System.out.println("Saldo antigo: "+ saldo);
    saldo = deposito;

    System.out.println("novo Saldo: "+ saldo);






    }
    public void sacar(){

        System.out.println("Quanto deseja sacar? ");
        saque = teclado.nextDouble();
        if(saque > saldo){ 
        System.out.println("Saldo insuficiente!");
        System.out.println("Seu saldo é de: "+ saldo);
        }else
            System.out.println("Saque Realizado com sucesso!");
            saldo = saldo - saque;
            System.out.println("Novo saldo: "+ saldo);
    



    }
















} 
