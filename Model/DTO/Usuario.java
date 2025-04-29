package DTO;

public class Usuario {

	private int idUsuario;
	private String nomeUsuario;
	private String emailUsuario;
	private String senhaUsuario;
	private String cpfUsuario;
    private String enderecoUsuario;
    private String telefoneUsuario;
    private int idadeUsuario;

   public Usuario(int idUsuario, String nomeUsuario, String emailUsuario, String senhaUsuario, String cpfUsuario, String enderecoUsuario, String telefoneUsuario, int idadeUsuario){
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
        this.senhaUsuario = senhaUsuario;
        this.cpfUsuario = cpfUsuario;
        this.enderecoUsuario = enderecoUsuario;
        this.telefoneUsuario = telefoneUsuario;
        this.idadeUsuario = idadeUsuario;
    }

    public Usuario() {

    }

    public int getIdUsuario(){
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario){
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario(){
        return nomeUsuario;
    }
    public void setNomeUsuario(String nomeUsuario){
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmailUsuario(){
        return emailUsuario;
    }
    public void setEmailUsuario(String emailUsuario){
        this.emailUsuario = emailUsuario;
    }

    public String getSenhaUsuario(){
        return senhaUsuario;
    }
    public void setSenhaUsuario(String senhaUsuario){
        this.senhaUsuario = senhaUsuario;
    }

    public String getCpfUsuario(){
        return cpfUsuario;
    }
    public void setCpfUsuario(String cpfUsuario){
        this.cpfUsuario = cpfUsuario;
    }

    public String getEnderecoUsuario(){
        return enderecoUsuario;
    }
    public void setEnderecoUsuario(String enderecoUsuario){
        this.enderecoUsuario = enderecoUsuario;
    }

    public String getTelefoneUsuario(){
        return telefoneUsuario;
    }
    public void setTelefoneUsuario(String telefoneUsuario){
        this.telefoneUsuario = telefoneUsuario;
    }

    public int getIdadeUsuario(){
        return idadeUsuario;
    }
    public void setIdadeUsuario(int idadeUsuario){
        this.idadeUsuario = idadeUsuario;
    }


    public void mostrarInfo() {
        System.out.println("ID: " + getIdUsuario());
        System.out.println("Nome: " + getNomeUsuario());
        System.out.println("Email: " + getEmailUsuario());
        System.out.println("Senha: " + getSenhaUsuario());
        System.out.println("CPF: " + getCpfUsuario());
        System.out.println("Endereço: " + getEnderecoUsuario());
        System.out.println("Telefone: " + getTelefoneUsuario());
        System.out.println("Idade: " + getIdadeUsuario());
    }

}
