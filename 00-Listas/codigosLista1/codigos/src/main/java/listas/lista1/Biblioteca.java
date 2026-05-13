package listas.lista1;

public class Biblioteca {

    public static void main(String[] args) {
        // Criando objetos da classe LivroBiblioteca
        LivroBiblioteca livro1 = new LivroBiblioteca("Java: Como Programar", "Deitel & Deitel", 2017);
        LivroBiblioteca livro2 = new LivroBiblioteca("Clean Code", "Robert C. Martin", 2008);
        LivroBiblioteca livro3 = new LivroBiblioteca("Dog Whistle Politics", "Ian Haney López", 2008);

        // Exibindo informações dos livros
        System.out.println("Livro 1: " + livro1.getTitulo() + " por " + livro1.getAutor());
        System.out.println("Livro 2: " + livro2.getTitulo() + " por " + livro2.getAutor());
        System.out.println("Livro 3: " + livro3.getTitulo() + " por " + livro3.getAutor());

        // Emprestando o primeiro livro
        livro1.emprestar();

        // Tentando emprestar o mesmo livro novamente
        livro1.emprestar();

        // Devolvendo o livro
        livro1.devolver();

        // Tentando emprestar o livro novamente
        livro1.emprestar();
    }
}
