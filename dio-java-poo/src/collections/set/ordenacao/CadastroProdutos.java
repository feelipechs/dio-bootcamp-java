// package src.collections.set.ordenacao;

// import java.util.HashSet;
// import java.util.Set;
// import java.util.TreeSet;

// public class CadastroProdutos {
//     private Set<Produto> produtoSet;

//     public CadastroProdutos() {
//         this.produtoSet = new HashSet<>();
//     }

//     public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
//         produtoSet.add(new Produto(cod, nome, preco, quantidade));
//     }

//     public Set<Produto> exibirProdutosPorNome() {
//         Set<Produto> produtosPorNome = new TreeSet<>();
//     }

//     public Set<Produto> exibirProdutosPorPreco() {
//         Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco);
//         produtoSet.addAll(produtoSet);
//         return produtosPorPreco;
//     }

//     public static void main(String[] args) {
//         CadastroProdutos cadastroProdutos = new CadastroProdutos();

//         cadastroProdutos.adicionarProduto(1L, "Produto 1", 15d, 6);
//         cadastroProdutos.adicionarProduto(2L, "Produto 2", 16d, 7);
//         cadastroProdutos.adicionarProduto(3L, "Produto 3", 17d, 8);
//         cadastroProdutos.adicionarProduto(4L, "Produto 4", 18d, 9);

//         System.out.println(cadastroProdutos.produtoSet);
//     }
// }
