public class Administrador extends Usuario{
    private String nivelAcesso;
    private String permissoesEspeciais;

    public String getNivelAcesso(){
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso){
        this.nivelAcesso = nivelAcesso;
    }

    public String getPermissoesEspeciais(){
        return permissoesEspeciais;
    }

    public void setPermissoesEspeciais(String permissoesEspeciais){
        this.permissoesEspeciais = permissoesEspeciais;
    }

}