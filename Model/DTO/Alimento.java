package DTO;
public class Alimento extends Produto{

    private String tipoAlimento;
    private String dataValidade;
    private String valorNutricional;

    public Alimento(int idProduto, String descricaoProduto, String codigoProduto, float precoCompraProduto, float precoVendaProduto, float margemLucroProduto, int estoqueProduto, String codigoDeBarrasProduto, String grupoProduto, String categoriaProduto, String fornecedorProduto, String marcaProduto, String tipoAlimento, String dataValidade, String valorNutricional) {
        super(idProduto, descricaoProduto, codigoProduto, precoCompraProduto, precoVendaProduto, margemLucroProduto, estoqueProduto, codigoDeBarrasProduto, grupoProduto, categoriaProduto, fornecedorProduto, marcaProduto);
        this.tipoAlimento = tipoAlimento;
        this.dataValidade = dataValidade;
        this.valorNutricional = valorNutricional;
    }

    public String getTipoAlimento(){
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento){
        this.tipoAlimento = tipoAlimento;
    }

    public String getDataValidade(){
        return dataValidade;
    }

    public void setDataValidade(String dataValidade){
        this.dataValidade = dataValidade;
    }

    public String getValorNutricional(){
        return valorNutricional;
    }

    public void setValorNutricional(String valorNutricional){
        this.valorNutricional = valorNutricional;
    }




}
