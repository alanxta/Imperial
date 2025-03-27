public class Alimento extends Produto{

    private String tipoAlimento;
    private String dataValidade;
    private String valorNutricional;

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