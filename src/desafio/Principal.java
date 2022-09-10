package desafio;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        List<Growdever> list = new ArrayList<>();

        int resposta;

        do {

            System.out.println("------------------------");
            System.out.println("Informe a opção desejada");
            System.out.println("|   1-Adicionar  |");
            System.out.println("|   2-Listar     |");
            System.out.println("|   3-Atualizar  |");
            System.out.println("|   4-Remover    |");
            System.out.println("|   5-Sair       |");
            System.out.println("------------------------");

            resposta = sc.nextInt();
            sc.nextLine();

            switch (resposta) {
                case 1:

                    Growdever growdevers = new Growdever();

                    System.out.println("Informe o nome do aluno: ");
                    String nome = sc.nextLine();
                    growdevers.setNome(nome);

                    System.out.println("Informe a area: ");
                    String area = sc.nextLine();
                    growdevers.setArea(area);

                    list.add(growdevers);

                    System.out.println();
                    System.out.println("Aluno cadastrado com sucesso !");
                    System.out.println();

                    break;

                case 2:

                    System.out.println();
                    System.out.println("Listar alunos");
                    System.out.println();

                    for (Growdever lista : list) {
                        System.out.println(lista);
                    }
                    System.out.println();
                    break;

                case 3:

                    System.out.println("Atualizar nome: ");
                    String editNome = sc.nextLine();

//                    System.out.println("Numero da matricula: ");
//                    int matricula = sc.nextInt();
//                    int index = list.indexOf(matricula);

//                    List<Growdever> resultado = list.stream()
//                            .filter(grow -> grow.getNome().equals(nomeAtualizado) && index != -1)
//                            .collect(Collectors.toList());

                    List<Growdever> resultado = list.stream().filter(grow -> grow.getNome().equals(editNome)).collect(Collectors.toList());

                    for (Growdever item : resultado) {
                        System.out.println(item.toString());

                        if (item.getNome() != "") {
                            int posicao = list.indexOf(item);

                            System.out.println();
                            System.out.println("Digite o novo nome");
                            String novoNome = sc.nextLine();

                            System.out.println("Digite a nova area");
                            String novaArea = sc.nextLine();

                            Growdever upGrow = new Growdever(novoNome, novaArea);
                            System.out.println(upGrow.toString());
                            list.set(posicao, upGrow);

                            System.out.println();
                            System.out.println("Atualizado");
                            System.out.println();


                            for (Growdever growdever : list){
                                System.out.println(growdever);
                            }



                        }
                    }
                    break;


                case 4:
                    System.out.println();
                    System.out.println("Informe quem voce deseja deletar: ");
                    String delete = sc.nextLine();

                    List<Growdever> res = list.stream().filter(grow -> grow.getNome().equals(delete)).collect(Collectors.toList());

                    for (Growdever item : res){
                        System.out.println(item.toString());

                        if(item.getNome() != ""){
                            int i = list.indexOf(item);
                            list.remove(i);
                        }
                    }

                    System.out.println("Voce removeu " + delete + " da lista");


                    break;


                case 5:
                    System.out.println("Saindo do sistema");
                    break;


                default:
                    System.out.println("Opção invalida");
                    break;


            }


        } while (resposta != 5);


    }
}
