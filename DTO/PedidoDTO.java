public class Pedidoido{

    private int idPedido;
    private String dtHoraPedido;
    private double valorTotalPedido;
    private String situacaoPedido;
    private String formaPagamentoPedido;


    public int IdPedido(){
        return idPedido;
    }
    public void setIdPedido(int idPedido){
        this.idPedido = idPedido;
    }


    public String getDtHoraPedido(){
        return dtHoraPedido;
    }
    public void setDtHoraPedido(String dtHoraPedido){
        this.dtHoraPedido = dtHoraPedido;
    }


    public double getValorTotalPedido(){
        return valorTotalPedido;
    }
    public void setValorTotalPedido(double valorTotalPedido){
        this.valorTotalPedido = valorTotalPedido;
    }


    public String getSituacaoPedido(){
        return situacaoPedido;
    }
    public void setSituacaoPedido(String situacaoPedido){
        this.situacaoPedido = situacaoPedido;
    }


    public String getFormaPagamentoPedido(){
        return formaPagamentoPedido;
    }
    public void setFormaPagamentoPedido(String formaPagamentoPedido){
        this.formaPagamentoPedido = formaPagamentoPedido;
    }




}