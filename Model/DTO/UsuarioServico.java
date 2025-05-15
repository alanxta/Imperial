package DTO;

public class UsuarioServico {
    public static void mostrarInfoUsuario(Usuario usuario) {
        System.out.println("ID: " + usuario.getIdUsuario());
        System.out.println("Nome: " + usuario.getNomeUsuario());
        System.out.println("Email: " + usuario.getEmailUsuario());
        System.out.println("Senha: " + usuario.getSenhaUsuario());
        System.out.println("CPF: " + usuario.getCpfUsuario());
        System.out.println("Endereço: " + usuario.getEnderecoUsuario());
        System.out.println("Telefone: " + usuario.getTelefoneUsuario());
        System.out.println("Idade: " + usuario.getIdadeUsuario());
    }
}
