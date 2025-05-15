import DTO.*;

public class app {
    public static void main(String[] args) {

        System.out.println("Informações do administrador");
        Usuario administrador = new Administrador(
            "Nível 1", 
            "Permissão Total", 
            1, 
            "Alice", 
            "alice@admin.com", 
            "admin123", 
            "12345678900", 
            "Ceilândia", 
            "11 9999-9999", 
            30
        );
        administrador.mostrarInfo();

        try {
            Administrador admin = new Administrador(
                "Admin", 
                "Controlar usuários", 
                1, 
                "Alan", 
                "alan@gmail.com", 
                "231323", 
                "111.111.111-12", 
                "Rua 12", 
                "1111-1111", 
                10 
            );

            admin.mostrarInfo();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Admin criado");
        }

        // uso da interface do Produto
        Produto produto = new Produto(
            1,
            "Mouse",
            "redragon",
            50.0f,
            80.0f,
            60.0f,
            20,
            "102102111231",
            "Periférico",
            "Eletrônico",
            "Forn",
            "Redragon"
        );

        ProdutoServico.mostrarInfoProduto(produto);

        // uso da interface do Usuário
        Usuario usuario = new Usuario(
            1,
            "Alan",
            "alan@email.com",
            "123",
            "123.456.789-10",
            "ceilândia",
            "(61) 91234-5678",
            19
        );

        UsuarioServico.mostrarInfoUsuario(usuario);
    }
}
