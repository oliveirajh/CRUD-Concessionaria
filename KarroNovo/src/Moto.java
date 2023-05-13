import java.util.Scanner;

public class Moto extends Automotor{
    private boolean partidaEletrica;
    private Integer cilindradas;

    public Moto(boolean partidaEletrica, Integer cilindradas, String tipoCombustivel, Integer codigo, String cor, String marca, String modelo, Double valor){
        super(tipoCombustivel, codigo, cor, marca, modelo, valor);

    }

    Scanner scanner = new Scanner(System.in);

    public Moto(){
        super();
        System.out.println("A Moto possui partida Elétrica? \n 1- Sim \n 2- Nao ");
        Integer input = scanner.nextInt();
        if (input == 1){
            this.partidaEletrica = true;
        }else if(input == 2){
            this.partidaEletrica = false;
        }else{
            while(!(input == 1  || input == 2 )){
                System.out.println("Digite um valor valido!");
                System.out.println("A Moto possui partida Elétrica? \n 1- Sim \n 2- Nao ");
                input = scanner.nextInt();
                if (input == 1){
                    this.partidaEletrica = true;
                }else if(input == 2) {
                    this.partidaEletrica = false;
                }
            }
        }
        System.out.println("Digite a quantidade de Cilindradas da Moto: ");
        this.cilindradas = scanner.nextInt();
        this.exibir();
    }
    public Moto(Boolean partidaEletrica, Integer cilindradas, String tipoCombustivel, Integer codigo, String cor, String marca, String modelo, Double valor){
        super(tipoCombustivel, codigo, cor, marca, modelo, valor);
        this.partidaEletrica = partidaEletrica;
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibir(){
        System.out.println("--------Essa é uma Moto-------");
        super.exibir();
        if(this.partidaEletrica == true){
            System.out.println(" Partida Elétrica?: Sim");
        }else{
            System.out.println(" Partida Elétrica?: Não");
        }
        System.out.println(" Cilindradas: " + this.cilindradas + "\n");
    }
}
