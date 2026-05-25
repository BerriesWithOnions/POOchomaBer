package listas.lista2;

public class Main {
    public static void main(String[] args) {
        CPF meuCpf = new CPF("123.456.789-00", "Regular");
        Pessoa joao = new Pessoa("João", 25, meuCpf);
        
        joao.exibirDados();
// ####################################################################################################
    
        Carteirinha carteirinha = new Carteirinha("2023001","15/02/2023");
        Aluno maria = new Aluno("Maria", "Sistemas de informação", carteirinha);

        maria.exibirAluno();
// ####################################################################################################

        Motor motorV8 = new Motor("V8", 450, "SN987654");
        Carro mustang = new Carro("Ford", "Mustang", motorV8);
    
        mustang.ligarCarro();
        mustang.exibirFichaTecnica();

// ####################################################################################################

        PlacaMae placa = new PlacaMae("ASUS ROG Strix", "B550");
        Computador pc = new Computador("Montado", "AMD Ryzen 5", placa);
        
        pc.exibirConfiguracao();

// ####################################################################################################

        ISBN codigo = new ISBN("978-85-359-0277-8", "Companhia das Letras");
        Livro livro = new Livro("Ensaio sobre a Cegueira", "José Saramago", codigo);
        
        livro.exibirLivro();

// ####################################################################################################

        Cracha c1 = new Cracha("C-100", "12/2025");
        Cracha c2 = new Cracha("C-101", "12/2026");

        Funcionario f1 = new Funcionario("Carlos", "Desenvolvedor", c1);
        Funcionario f2 = new Funcionario("Ana", "Gerente de Projetos", c2);
        
        f1.exibirFuncionario();
        f2.exibirFuncionario();

// #####################################################################################################

        Prontuario prontuario = new Prontuario(5050, "O+", "Dipirona");
        Paciente paciente = new Paciente("Roberto", 42, prontuario);
        
        paciente.exibirPaciente();

// #####################################################################################################

        Endereco endereco = new Endereco("Avenida Morangueira", 777, "Vila Esperança", "Maringá");
        Casa minhaCasa = new Casa("Verde", 1, endereco);
        
        minhaCasa.exibirCasa();

// #####################################################################################################

        CNPJ cnpj = new CNPJ("12.345.678/0001-99", "Ativa");
        Empresa techCorp = new Empresa("Tech Corp Solutions LTDA", "TechCorp", cnpj);
        
        techCorp.exibirEmpresa();

// #####################################################################################################

        Perfil perfil = new Perfil("Apaixonado por tecnologia.", "foto_perfil.png", "Público");
        Usuario user = new Usuario("dev_ninja", "ninja@email.com", perfil);
        
        user.exibirUsuario();
}
}