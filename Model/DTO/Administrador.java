package DTO;

public class Administrador extends Usuario{
    private String nivelAcesso;
    private String permissoesEspeciais;

    public Administrador(String nivelAcesso, String permissoesEspeciais, int idUsuario, String nomeUsuario, String emailUsuario, String senhaUsuario, String cpfUsuario, String enderecoUsuario, String telefoneUsuario, int idadeUsuario){
       super(idUsuario, nomeUsuario, emailUsuario, senhaUsuario, cpfUsuario, enderecoUsuario, telefoneUsuario, idadeUsuario);
       this.nivelAcesso = nivelAcesso;
       this.permissoesEspeciais = permissoesEspeciais;
    }

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

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Nivel de acesso: " + getNivelAcesso());
        System.out.println("Permissão especial: " + getPermissoesEspeciais());
    }

    public void setIdadeUsuario(int idadeUsuario) {
        if (idadeUsuario < 18) {
            throw new IllegalArgumentException("O usuário deve ser maior de 18 anos.");
        }
        super.setIdadeUsuario(idadeUsuario);
    }
}