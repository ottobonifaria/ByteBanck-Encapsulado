public class Conta {
     private double saldo;
     private int agencia;
     private int numero;
     private Cliente titular;

     public Conta(int agencia, int numero) {
          this.agencia = agencia;
          this.numero = numero;
          System.out.println("Criando uma conta : Agencia:" + this.agencia + " Numero: "+ this.numero);

     }

     public void deposita(double valor){
          this.saldo += valor;
     }
     public boolean saca(double valor){
          if(saldo>= valor){
               saldo -= valor;
               return true;
          }
          return false;
     }
     public boolean transfere(double valor, Conta destino){
          if(saldo>= valor){
               saldo -= valor;
               destino.deposita(valor);
               return true;
          }
          return false;
     }
     public double getSaldo(){
          return this.saldo;
     }
     public int getNumero(){
          return this.numero;
     }
     public void setNumero(int numero){
          if(numero<=0){
               System.out.println("Não pode numero negativo");
               return;
          }
          this.numero = numero;
     }

     public int getAgencia() {

          return this.agencia;
     }

     public void setAgencia(int agencia) {
          if(agencia <=0){
               System.out.println("Não pode valor menor ou igual a 0");
               return;
          }
          this.agencia = agencia;
     }

     public void setTitular(Cliente titular) {
          this.titular = titular;
     }

     public Cliente getTitular() {
          return titular;
     }
}
