package src.app;
import src.classes.*;
import src.enums.Prioridade;
import src.enums.TipoUsuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Joao", "joao@email.com", "2308", TipoUsuario.ALUNO));
        usuarios.add(new Usuario("Janio", "janio@email.com", "1234", TipoUsuario.PROFESSOR));
        usuarios.add(new Usuario("Admin", "admin@email.com", "0000", TipoUsuario.ADMIN));

        // Criando duas etiquetas
        Etiqueta etiqueta1 = new Etiqueta("Code", "Etiqueta para código");
        Etiqueta etiqueta2 = new Etiqueta("Book", "Etiqueta para livros");

        // Criando duas tarefas utilizando as etiquetas e prioridades definidas
        Tarefa tarefa1 = new Tarefa("Tarefa 1", "Descrição da Tarefa 1", etiqueta1, "Professor 1", LocalDate.now(), Prioridade.COMUM);
        Tarefa tarefa2 = new Tarefa("Tarefa 2", "Descrição da Tarefa 2", etiqueta2, "Professor 2", LocalDate.now(), Prioridade.IMPORTANTE);

        Usuario.autenticar(usuarios);
    }
}