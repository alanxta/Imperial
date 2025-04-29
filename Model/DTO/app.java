import DTO.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class app {
    public static void main(String[] args) {

        System.out.println("Informaçoes do administrador");
       Usuario administrador = new Administrador(
            "Nível 1", 
            "Permissão Total", 
            1, 
            "Alice", 
            "alice@admin.com", 
            "admin123", 
            "12345678900", 
            "Ceilandia", 
            "11 9999-9999", 
            30
        );

        Administrador admin = null;
try {
    admin = new Administrador(
                "Nivel 2", 
                "Controlar usuários", 
                2, 
                "Alan", 
                "alan@gmail.com", 
                "231323", 
                "111.111.111-12", 
                "Rua 12", 
                "1111-1111", 
                20 
            );

        } catch (IllegalArgumentException e) {

            System.out.println("Erro: " + e.getMessage());
        } finally {

            System.out.println("Admin criado");
        }


        List<Usuario> listaUsuario = new ArrayList<>(); 
        if (admin != null) {
            listaUsuario.add(admin); 
            listaUsuario.add(administrador);
        }
       

        for (Usuario usuario : listaUsuario) {
            usuario.mostrarInfo();
        }

        HashMap<Integer, Usuario>listaUsuario2 = new HashMap<>();
        listaUsuario2.put(101,admin);
        listaUsuario2.put(102,administrador);

    int codigo = 102;

    System.out.println("Busca por codigo");
    Usuario encontrado = listaUsuario2.get(codigo);

    if(encontrado != null ){
        System.out.println("Usuario encontrado: ");
        encontrado.mostrarInfo();

    }else{
        System.out.println("Nenhum usuario encontrado");
    }

    }
}
