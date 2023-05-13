import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    public Menu(){
        this.veiculos.add(new Carro(4, "G", 01, "Preto", "Honda", "Civic", 23000.00));
        this.veiculos.add(new Carro(2, "E", 02, "Azul", "Honda", "City", 24990.90));
        System.out.println("Veiculos do Banco de Dados carregados! \n");
    }
    public List<Veiculo> veiculos = new ArrayList<Veiculo>();
    Scanner scanner = new Scanner(System.in);
    public void menu(){

        System.out.println("O que deseja fazer?\n1 - Cadastrar novo veículo\n2 - Editar veículo\n3 - Ver informações de um veículo específico\n4 - Excluir um veículo\n5 - Ver todos os veículos\n6 - Sair\n");

        Integer menu_input = scanner.nextInt();

        if(menu_input == 1){
            menuCadastro();
        } else if (menu_input == 2) {
            editarVeiculo();
        } else if (menu_input == 3) {
            obterVeiculo();
        } else if (menu_input == 4) {
            deletarVeiculo();
        } else if (menu_input == 5) {
            for (Veiculo a: veiculos) {
                a.exibir();
            }
        } else if (menu_input == 6) {
            return ;
        }else{
            System.out.println("Opção Invalida");
        }
        menu();
    }

    public void menuCadastro(){
        System.out.println("Qual veículo deseja cadastrar?\n 1- Carro\n 2- Moto\n 3- Caminhão\n 4- Bicicleta\n 5- Voltar ao menu inicial");
        Integer input = scanner.nextInt();

        if(input == 1){
            this.veiculos.add(new Carro());
        } else if (input == 2) {
            this.veiculos.add(new Moto());
        } else if (input == 3) {

        } else if (input == 4) {

        } else if (input == 5) {
            return ;
        }
    }

    public void obterVeiculo(){
        Integer indice = this.getIndiceVeiculo();

        if(indice != -1){
            this.veiculos.get(indice).exibir();
        }else{
            System.out.println("Veiculo não encontrado");
        }
    }

    public void deletarVeiculo(){
        Integer indice = this.getIndiceVeiculo();

        if(indice != -1){
            System.out.println("Você tem certeza que deseja excluir esse veiculo?");
            this.veiculos.get(indice).exibir();
            System.out.println("Para confirmar digite SIM");
            Scanner obterValores = new Scanner(System.in);
            String valorDigitado = obterValores.nextLine();
            if(valorDigitado.equals("SIM")){
                this.veiculos.remove(this.veiculos.get(indice));
                System.out.println("Veiculo Excluido!");
            }else{
                System.out.println("Operação cancelada");
            }
        }else{
            System.out.println("Veiculo não localizado");
        }
    }

    public void editarVeiculo(){
        System.out.println("Edição de Veiculos");
        Integer indice = this.getIndiceVeiculo();

        if(indice != -1){
            System.out.println("Você estará editando o veiculo abaixo");
            this.veiculos.get(indice).exibir();
            this.veiculos.get(indice).editar();
        }else{
            System.out.println("Veiculo não encontrado");
        }
    }

    public Integer getIndiceVeiculo(){
        System.out.println("Digite o Nome ou o Codigo do veiculo");
        Scanner obterValores = new Scanner(System.in);
        Integer codigo = obterValores.nextInt();

        Integer indice = 0;
        for(Veiculo veiculo:this.veiculos){
            if(veiculo.getCodigo().equals(codigo)){ //Verifica se o CPF da conta é igual ao cpf passado
                return indice;
            }else{
                indice++;
            }
        }
        return -1;
    }
}
