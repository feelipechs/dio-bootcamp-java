// package src.collections.list.ordenacao;

// import java.util.ArrayList;
// import java.util.List;

// public class OrdenacaoPessoa {
//     private List<Pessoa> pessoaList;

//     public OrdenacaoPessoa() {
//         this.pessoaList = new ArrayList<>();
//     }

//     public void adicionarPessoa(String nome, int idade, double altura) {
//         pessoaList.add(new Pessoa(nome, idade, altura));
//     }

//     public List<Pessoa> ordenarporIdade() {
//         List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
//         Collections.sort(pessoasPorIdade);
//         return pessoasPorIdade;
//     }

//     public List<Pessoa> ordenarPorAltura() {
//         List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
//         Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
//         return pessoasPorAltura;
//     }

//     public static void main(String[] args) {
//         OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
//         ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
//         ordenacaoPessoa.adicionarPessoa("Nome 2", 21, 1.57);
//         ordenacaoPessoa.adicionarPessoa("Nome 3", 22, 1.58);
//         ordenacaoPessoa.adicionarPessoa("Nome 4", 23, 1.59);

//         System.out.println(ordenacaoPessoa.pessoaList);

//         System.out.println(ordenacaoPessoa.ordenarporIdade());
//         System.out.println(ordenacaoPessoa.ordenarPorAltura());
//     }
// }
