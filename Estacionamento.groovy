import javax.swing.JOptionPane;
import javax.swing.JFrame;


class Estacionamento
{   
       public static void main(String[] args){
           double tempoentrada;
           double temposaida;
           double taxaPagar;
           int estacionamento = 0;
           
           if(estacionamento <=50){
               estacionamento = estacionamento +1;
               JFrame tela = new JFrame();
               Veiculos carro = new Veiculos();
           
               //ler carros na entrada
               carro.numeroPlaca = JOptionPane.showInputDialog(tela, "Informe o numero da placa");
               carro.tipoVeiculo = JOptionPane.showInputDialog(tela, "Informe o tipoVeiculo");
               carro.modelo = JOptionPane.showInputDialog(tela, "Informe o modelo");
               carro.cor = JOptionPane.showInputDialog(tela, "Informe a cor");
               tempoentrada = carro.tempoEntrada();
                                  
           
           
               //Saida de carros
               estacionamento = estacionamento -1;
               temposaida =carro.tempoSaida(tempoentrada);
               taxaPagar = carro.calculaTaxa(temposaida);
               System.out.println("O carro de placa "+ carro.numeroPlaca +" do tipo " + carro.tipoVeiculo + " de modelo " + carro.modelo);
               System.out.println("e cor " + carro.cor + "Deve pagar " + taxaPagar + " reais ");
                                   }
           
           else
               System.out.println("Estacionamento lotado");
           
          
           
                                             }
}

public class Veiculos
{

    String numeroPlaca;
    String tipoVeiculo;
    String modelo;
    String cor;
    
    long tempoEntrada(){
        long tempoEntrada = System.currentTimeMillis();
        return tempoEntrada;
                      }
    long tempoSaida(double tempoDeEntrada){
        long tempoSaida = System.currentTimeMillis();
        long tempoTotal = tempoSaida - tempoDeEntrada;
        return tempoTotal;
                                        }
                    
                    
    long calculaTaxa(double tempoFinal){
        float taxa=0;
        //tempoFinal/1000F; Segundos
        //tempoFinal/(60*1000F); minutos
        tempoFinal/(60*60*1000F);
        for(long i=0;i<=tempoFinal;i++){
            if(tempoFinal <= i ){
                taxa = taxa + 5;
                                }
                                       }
         return taxa;
                                     }
                      
                    
}
