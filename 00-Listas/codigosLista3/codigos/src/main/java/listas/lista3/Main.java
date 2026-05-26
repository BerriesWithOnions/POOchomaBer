package listas.lista3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno("Carlos", 20, "2024001", "Ciência da Computação");
        a.exibirAluno();

        Professor p = new Professor("Dra. Ana", 45, "Estrutura de Dados", 7500.00);
        p.exibirProfessor();
        
        // ___________________________________________________________________________________________________________________________
        
        Carro c = new Carro("Toyota", "Corolla", 4);
        c.exibirCarro();
        
        Moto m = new Moto("Honda", "CB 500", 500);
        m.exibirMoto();
        
        Gerente g = new Gerente("Roberto", 9000.00, "TI");
        g.exibirGerente();
        
        // ___________________________________________________________________________________________________________________________

        Scanner sc = new Scanner(System.in); // Scanner para as operações com arrays dos próximos 4 exercícios


        int[] numeros = new int[5];
        int soma = 0;
        
        System.out.println("Agora vou precisar que tu insiras 5 números pra gente seguir com o código.");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Insira o Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }

        System.out.println("Valores digitados:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println("Soma total: " + soma);

        // ___________________________________________________________________________________________________________________________

        Aluno[] alunos = new Aluno[3];
        alunos[0] = new Aluno("Lucas", 19, "2024001", "Ciência da Computação");
        alunos[1] = new Aluno("Fernanda", 21, "2024002", "Engenharia de Software");
        alunos[2] = new Aluno("Rodrigo", 20, "2024003", "Sistemas de Informação");

        System.out.println("Alunos cadastrados:");
        for (Aluno adalberto : alunos) {
            adalberto.exibir();
        }

        // ___________________________________________________________________________________________________________________________

        Carro[] carros = new Carro[4];
        carros[0] = new Carro("Fiat", "Uno", 2);
        carros[1] = new Carro("Volkswagen", "Gol", 4);
        carros[2] = new Carro("Chevrolet", "Onix", 4);
        carros[3] = new Carro("Honda", "Civic", 4);

        System.out.println("Carros cadastrados:");
        for (Carro vrumvrum : carros) {
            vrumvrum.exibir();
        }

        // ___________________________________________________________________________________________________________________________
        
        Pessoa[] pessoas = new Pessoa[4];
        pessoas[0] = new Aluno("Ana", 19, "2024010", "CC");
        pessoas[1] = new Aluno("Bruno", 22, "2024011", "ES");
        pessoas[2] = new Professor("Prof. Carlos", 38, "POO", 6500.00);
        pessoas[3] = new Professor("Profa. Débora", 42, "Banco de Dados", 7200.00);
        
        System.out.println("Pessoas cadastradas:");
        for (Pessoa jubileu : pessoas) {
            jubileu.exibir(); // polimorfismo: chama o método certo de cada subclasse
        }
        
        sc.close();

        // ___________________________________________________________________________________________________________________________

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Alice");
        nomes.add("Bruno");
        nomes.add("Carla");
        nomes.add("Diego");
        nomes.add("Elisa");

        System.out.println("Menções e contagem de nomes:");
        for (String n : nomes) {
            System.out.println(n);
        }
        System.out.println("Total de nomes: " + nomes.size());

        // ___________________________________________________________________________________________________________________________

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Notebook", 3500.00));
        produtos.add(new Produto("Mouse", 89.90));
        produtos.add(new Produto("Teclado", 149.99));
        produtos.add(new Produto("Monitor", 1200.00));
        produtos.add(new Produto("Headset", 299.90));

        System.out.println("Produtos registrados:");
        for (Produto coisinha : produtos) {
            coisinha.exibir();
        }

        // Produto mais caro
        Produto maisCaro = produtos.get(0);
        for (Produto coisinha : produtos) {
            if (coisinha.getPreco() > maisCaro.getPreco()) {
                maisCaro = coisinha;
            }
        }
        System.out.println("Produto mais caro: " + maisCaro.getNome() + " (R$" + maisCaro.getPreco() + ")");

        // ___________________________________________________________________________________________________________________________

        ArrayList<Professor> professores = new ArrayList<>();
        professores.add(new Professor("Ana Lima", 40, "POO", 7000.00));
        professores.add(new Professor("Carlos Souza", 35, "Algoritmos", 6500.00));
        professores.add(new Professor("Mariana Costa", 50, "Banco de Dados", 8000.00));

        System.out.println("Professores cadastrados:");
        for (Professor ademar : professores) {
            ademar.exibir();
        }

        // Busca por nome
        String nomeBusca = "Carlos Souza";
        System.out.println("Buscando: " + nomeBusca);
        boolean encontrado = false;
        for (Professor pericles : professores) {
            if (pericles.getNome().equalsIgnoreCase(nomeBusca)) {
                System.out.println("Encontrado! ");
                pericles.exibirProfessor();
                encontrado = true;
                break;
            }
        }
        if (encontrado == false) {
            System.out.println("Professor não encontrado.");
        }

        // ___________________________________________________________________________________________________________________________
        
        ArrayList<Aluno> alunoz = new ArrayList<>();
        alunoz.add(new Aluno("João", 19, "2024001", "CC"));
        alunoz.add(new Aluno("Maria", 20, "2024002", "ES"));
        alunoz.add(new Aluno("Pedro", 21, "2024003", "SI"));
        
        System.out.println("Alunos antes da remoção:");
        for (Aluno alencar : alunos) {
            alencar.exibir();
        }

        // Remove o aluno com matrícula "2024002"
        String matriculaRemover = "2024002";
        Aluno alunoParaRemover = null;
        for (Aluno alvarez : alunos) {
            if (alvarez.getMatricula().equals(matriculaRemover)) {
                alunoParaRemover = alvarez;
                break;
            }
        }

        if (alunoParaRemover != null) {
            alunoz.remove(alunoParaRemover);
            System.out.println("Aluno com matrícula " + matriculaRemover + " removido.");
        } else {
            System.out.println("Matrícula não encontrada.");
        }

        System.out.println("Alunos após a remoção:");
        for (Aluno aldo : alunos) {
            aldo.exibir();
        }

        // ___________________________________________________________________________________________________________________________
        
        System.out.println(" Exercício 13 (array) ");
        Pessoa[] pessoasArray = new Pessoa[4];
        pessoasArray[0] = new Aluno("Gustavo", 18, "2024001", "CC");
        pessoasArray[1] = new Aluno("Isabela", 20, "2024002", "ES");
        pessoasArray[2] = new Professor("Prof. Hélio", 45, "POO", 7000.00);
        pessoasArray[3] = new Professor("Profa. Júlia", 38, "Redes", 6800.00);
        
        for (Pessoa principeDaPersia : pessoasArray) {
            principeDaPersia.exibir();
        }
        
        // ___________________________________________________________________________________________________________________________
        
        System.out.println(" Exercício 13 (ArrayList) ");
        ArrayList<Pessoa> pessoasList = new ArrayList<>();
        pessoasList.add(new Aluno("Kaue", 19, "2024005", "SI"));
        pessoasList.add(new Aluno("Larissa", 21, "2024006", "CC"));
        pessoasList.add(new Professor("Prof. Marco", 50, "Cálculo", 7500.00));
        pessoasList.add(new Professor("Profa. Nadia", 41, "Física", 7200.00));
        
        for (Pessoa pentacampeao : pessoasList) {
            pentacampeao.exibir();
        }
        
        // ___________________________________________________________________________________________________________________________

        // Array com 3 livros
        Livro[] arrayLivros = new Livro[3];
        arrayLivros[0] = new Livro("O Senhor dos Anéis", "Tolkien");
        arrayLivros[1] = new LivroDidativo("Algoritmos", "Cormen", "Estrutura de Dados");
        arrayLivros[2] = new LivroDidativo("Java: Como Programar", "Deitel", "POO");

        System.out.println("-- Array de livros --");
        for (Livro l : arrayLivros) {
            l.exibir();
        }

        // ArrayList de livros (tamanho dinâmico)
        ArrayList<Livro> listaLivros = new ArrayList<>();
        listaLivros.add(new Livro("Clean Code", "Robert C. Martin"));
        listaLivros.add(new LivroDidativo("Banco de Dados", "Ramakrishnan", "BD"));
        listaLivros.add(new Livro("O Programador Apaixonado", "Chad Fowler"));
        listaLivros.add(new LivroDidativo("Redes de Computadores", "Tanenbaum", "Redes"));

        System.out.println("-- ArrayList de livros --");
        for (Livro l : listaLivros) {
            l.exibir();
        }

        // ___________________________________________________________________________________________________________________________

        Funcionario[] arrayFunc = new Funcionario[3];
        arrayFunc[0] = new Gerente("Roberto", 9000.00, "TI");
        arrayFunc[1] = new Estagiario("Sofia", 1800.00, "UEM");
        arrayFunc[2] = new Funcionario("Thiago", 3500.00);

        System.out.println("---Funcionarios---");
        for (Funcionario f : arrayFunc) {
            f.exibir();
        }
        
        ArrayList<Funcionario> listaFunc = new ArrayList<>();
        listaFunc.add(new Gerente("Vanessa", 11000.00, "Financeiro"));
        listaFunc.add(new Estagiario("Wesley", 1500.00, "UEL"));
        listaFunc.add(new Funcionario("Xavier", 4000.00));
        listaFunc.add(new Estagiario("Yasmin", 1300.00, "UTFPR"));
        
        System.out.println("---Funcionarios---");
        for (Funcionario f : listaFunc) {
            f.exibir();
        }
    }
}