package DTO;
public class Bebida extends Produto{

    private String tipoBebida;
    private String volumeBebida;

    public Bebida(int idProduto, String descricaoProduto, String codigoProduto, float precoCompraProduto, float precoVendaProduto, float margemLucroProduto, int estoqueProduto, String codigoDeBarrasProduto, String grupoProduto, String categoriaProduto, String fornecedorProduto, String marcaProduto, String tipoBebida, String volumeBebida) {
        super(idProduto, descricaoProduto, codigoProduto, precoCompraProduto, precoVendaProduto, margemLucroProduto, estoqueProduto, codigoDeBarrasProduto, grupoProduto, categoriaProduto, fornecedorProduto, marcaProduto);
        this.tipoBebida = tipoBebida;
        this.volumeBebida = volumeBebida;
    }

    public String getTipoBebida(){
        return tipoBebida;
    }

    public void setTipoBebida(String tipoBebida){
        this.tipoBebida = tipoBebida;
    }

    public String getVolumeBebida(){
        return volumeBebida;
    }

    public void setVolumeBebida(String volumeBebida){
        this.volumeBebida = volumeBebida;
    }


}