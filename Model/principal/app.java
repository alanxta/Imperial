package principal;

import Model.DTO.*;

 public static void main(String[] args) {

        Administrador admin = new Administrador();


        admin.setIdUsuario(1);
        admin.setNomeUsuario("João Silva");
        admin.setEmailUsuario("joao.silva@example.com");
        admin.setCpfUsuario("123.456.789-00");
        admin.setEnderecoUsuario("Rua das Flores, 123");
        admin.setTelefoneUsuario("(11) 1111-1111");
        admin.setIdadeUsuario(35);

        admin.setNivelAcesso("Admin");
        admin.setPermissoesEspeciais("Gerenciar usuários");

        mostrarAdministrador(admin);
    }


    public static void mostrarAdministrador(Administrador admin) {
        System.out.println("ID: " + admin.getIdUsuario());
        System.out.println("Nome: " + admin.getNomeUsuario());
        System.out.println("Email: " + admin.getEmailUsuario());
        System.out.println("CPF: " + admin.getCpfUsuario());
        System.out.println("Endereço: " + admin.getEnderecoUsuario());
        System.out.println("Telefone: " + admin.getTelefoneUsuario());
        System.out.println("Idade: " + admin.getIdadeUsuario());
        System.out.println("Nível de Acesso: " + admin.getNivelAcesso());
        System.out.println("Permissões Especiais: " + admin.getPermissoesEspeciais());
    }
