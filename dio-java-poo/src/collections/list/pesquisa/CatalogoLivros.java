// package src.collections.list.pesquisa;

// import java.util.ArrayList;
// import java.util.List;

// public class CatalogoLivros {
//     // atributo
//     private List<Livro> livroList;

//     public CatalogoLivros() {
//         this.livroList = new ArrayList<>();
//     }

//     public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
//         livroList.add(new Livro(titulo, autor, anoPublicacao));
//     }

//     public List<Livro> pesquisarPorAutor(String autor) {
//         List<Livro> livrosPorAutor = new ArrayList<>();
//         if (!livroList.isEmpty()) {
//             for (Livro l : livroList) {
//                 if (l.getAutor().equalsIgnoreCase(autor)) {
//                     livrosPorAutor.add(l);
//                 }
//             }
//         }
//         return livrosPorAutor;
//     }

//     public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
//         List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
//         if (!livroList.isEmpty()) {
//             for (Livro l : livroList) {
//                 if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
//                     livrosPorIntervaloAnos.add(l);
//                 }
//             }
//         }
//         return livrosPorIntervaloAnos;
//     }

//     public Livro pesquisarPorTitulo(String titulo) {
//         Livro livroPorTitulo = null;
//         if (!livroList.isEmpty()) {
//             for (Livro l : livroList) {
//                 if (l.getTitulo().equalsIgnoreCase(titulo)) {
//                     livroPorTitulo = l;
//                     break;
//                 }
//             }
//         }
//         return livroPorTitulo;
//     }
    
//     public static void main(String[] args) {
//         CatalogoLivros catalogoLivros = new CatalogoLivros();
//         catalogoLivros.adicionarLivro{titulo: "Livro 1", autor: "Autor 1", anoPublicacao: 2020};
//         catalogoLivros.adicionarLivro{titulo: "Livro 1", autor: "Autor 2", anoPublicacao: 2021};
//         catalogoLivros.adicionarLivro{titulo: "Livro 2", autor: "Autor 2", anoPublicacao: 2022};
//         catalogoLivros.adicionarLivro{titulo: "Livro 3", autor: "Autor 3", anoPublicacao: 2023};
//         catalogoLivros.adicionarLivro{titulo: "Livro 4", autor: "Autor 4", anoPublicacao: 1994};

//         System.out.println(catalogoLivros.pesquisarPorAutor(null));
//         System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(null));
//         System.out.println(catalogoLivros.pesquisarPorTitulo(null));
//     }
// }
