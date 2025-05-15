package DTO;

public class ProdutoServico {
    public static void mostrarInfoProduto(Produto produto) {
        System.out.println("ID: " + produto.getIdProduto());
        System.out.println("Descrição: " + produto.getDescricaoProduto());
        System.out.println("Código: " + produto.getCodigoProduto());
        System.out.println("Preço de Compra: R$ " + produto.getPrecoCompraProduto());
        System.out.println("Preço de Venda: R$ " + produto.getPrecoVendaProduto());
        System.out.println("Margem de Lucro: " + produto.getMargemLucroProduto() + "%");
        System.out.println("Estoque: " + produto.getEstoqueProduto());
        System.out.println("Código de Barras: " + produto.getCodigoDeBarrasProduto());
        System.out.println("Grupo: " + produto.getGrupoProduto());
        System.out.println("Categoria: " + produto.getCategoriaProduto());
        System.out.println("Fornecedor: " + produto.getFornecedorProduto());
        System.out.println("Marca: " + produto.getMarcaProduto());
    }
}
