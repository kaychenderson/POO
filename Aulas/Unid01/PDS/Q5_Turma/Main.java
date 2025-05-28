package Q5_Turma;
import java.util.Scanner;

public class Main {
    private static Aluno[] alunos = new Aluno[3];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        alunos[0] = new Aluno();
        alunos[1] = new Aluno();
        alunos[2] = new Aluno();

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    cadastrarAlunos();
                    break;
                case 2:
                    cadastrarNotas();
                    break;
                case 3:
                    calcularMedias();
                    break;
                case 4:
                    informarSituacoes();
                    break;
                case 5:
                    informarDadosAluno();
                    break;
                case 6:
                    alterarNota();
                    break;
                case 7:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 7);
    }

    private static void exibirMenu() {
        System.out.println("\nMENU PRINCIPAL");
        System.out.println("1 - CADASTRAR ALUNOS");
        System.out.println("2 - CADASTRAR NOTAS");
        System.out.println("3 - CALCULAR MÉDIAS");
        System.out.println("4 - INFORMAR SITUAÇÕES");
        System.out.println("5 - INFORMAR DADOS DE UM ALUNO");
        System.out.println("6 - ALTERAR NOTA");
        System.out.println("7 - SAIR");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarAlunos() {
        System.out.println("\nCADASTRO DE ALUNOS");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("\nAluno " + (i + 1));
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Matrícula: ");
            int matricula = scanner.nextInt();
            scanner.nextLine(); 

            alunos[i].setNome(nome);
            alunos[i].setMatricula(matricula);
        }
        System.out.println("Cadastro concluído!");
    }

    private static void cadastrarNotas() {
        System.out.println("\nCADASTRO DE NOTAS");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("\nAluno: " + alunos[i].getNome() + " (Matrícula: " + alunos[i].getMatricula() + ")");
            System.out.print("Nota 1: ");
            float n1 = scanner.nextFloat();
            System.out.print("Nota 2: ");
            float n2 = scanner.nextFloat();
            System.out.print("Nota 3: ");
            float n3 = scanner.nextFloat();
            scanner.nextLine(); 

            alunos[i].setNotas(n1, n2, n3);
        }
        System.out.println("Notas cadastradas com sucesso!");
    }

    private static void calcularMedias() {
        System.out.println("\nCÁLCULO DE MÉDIAS");
        for (Aluno aluno : alunos) {
            aluno.calcularMedia();
            System.out.printf("%s - Média: %.2f\n", aluno.getNome(), aluno.getMedia());
        }
    }

    private static void informarSituacoes() {
        System.out.println("\nSITUAÇÕES DOS ALUNOS");
        for (Aluno aluno : alunos) {
            System.out.printf("%s - Situação: %s\n", aluno.getNome(), aluno.getSituacao());
        }
    }

    private static void informarDadosAluno() {
        System.out.print("\nInforme a matrícula do aluno: ");
        int matricula = scanner.nextInt();
        scanner.nextLine(); 

        for (Aluno aluno : alunos) {
            if (aluno.buscarAluno(matricula)) {
                System.out.println("\nDADOS DO ALUNO");
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Matrícula: " + aluno.getMatricula());
                System.out.printf("Notas: %.2f, %.2f, %.2f\n", aluno.getNota1(), aluno.getNota2(), aluno.getNota3());
                System.out.printf("Média: %.2f\n", aluno.getMedia());
                System.out.println("Situação: " + aluno.getSituacao());
                return;
            }
        }
        System.out.println("Aluno não encontrado!");
    }

    private static void alterarNota() {
        System.out.print("\nInforme a matrícula do aluno: ");
        int matricula = scanner.nextInt();
        scanner.nextLine(); 

        for (Aluno aluno : alunos) {
            if (aluno.buscarAluno(matricula)) {
                System.out.println("Aluno: " + aluno.getNome());
                System.out.print("Qual nota deseja alterar (1, 2 ou 3)? ");
                int codNota = scanner.nextInt();
                System.out.print("Novo valor: ");
                float valorNota = scanner.nextFloat();
                scanner.nextLine(); 

                String resultado = aluno.alterarNota(codNota, valorNota);
                System.out.println(resultado);
                return;
            }
        }
        System.out.println("Aluno não encontrado!");
    }
}

class Aluno {
    private String nome;
    private int matricula;
    private float nota1;
    private float nota2;
    private float nota3;
    private float media;
    private String situacao;

    public Aluno() {
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setMatricula(int novaMatricula) {
        this.matricula = novaMatricula;
    }

    public void setNotas(float n1, float n2, float n3) {
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
    }

    public void calcularMedia() {
        this.media = (nota1 + nota2 + nota3) / 3;
        
        if (media >= 7) {
            situacao = "Aprovado";
        } else if (media >= 4) {
            situacao = "Recuperação";
        } else {
            situacao = "Reprovado";
        }
    }

    public boolean buscarAluno(int matricula) {
        return this.matricula == matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public float getNota1() {
        return nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public float getMedia() {
        return media;
    }

    public String getSituacao() {
        return situacao;
    }

    public String alterarNota(int codNota, float valorNota) {
        switch (codNota) {
            case 1:
                nota1 = valorNota;
                break;
            case 2:
                nota2 = valorNota;
                break;
            case 3:
                nota3 = valorNota;
                break;
            default:
                return "Código de nota inválido!";
        }
        calcularMedia();
        return "Nota alterada com sucesso! Média recalculada.";
    }
}