package com.biolab.todolist.Services;

import com.biolab.todolist.DTOs.TarefaRequest;
import com.biolab.todolist.DTOs.TarefaResponse;
import com.biolab.todolist.entities.Tarefa;
import com.biolab.todolist.entities.Usuario;
import com.biolab.todolist.repositories.TarefaRepository;
import com.biolab.todolist.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaServices {

    private final TarefaRepository tarefaRepository;
    private final UsuarioRepository usuarioRepository;

    public TarefaServices(
            TarefaRepository tarefaRepository,
            UsuarioRepository usuarioRepository) {

        this.tarefaRepository = tarefaRepository;
        this.usuarioRepository = usuarioRepository;
    }

    public TarefaRequest criarTarefa(TarefaRequest request) {

        Tarefa tarefa = new Tarefa();

        tarefa.setNomeTarefa(request.getNome());
        tarefa.setData(request.getData());
        tarefa.setDescricao(request.getDescricao());

        Usuario usuario = usuarioRepository
                .findById(request.getIdUsuario())
                .orElseThrow();

        tarefa.setUsuario(usuario);

        tarefaRepository.save(tarefa);

        return request;
    }

    public List<TarefaResponse> mostrarTarefa() {
        return tarefaRepository.findAll().stream()
                .map(tarefa -> new TarefaResponse(
                        tarefa.getId(),
                        tarefa.getNomeTarefa(),
                        tarefa.getData(),
                        tarefa.getDescricao()))
                .toList();
    }

    public TarefaResponse buscarID(long id) {

        Optional<Tarefa> tarefa = tarefaRepository.findById(id);

        TarefaResponse tarefaResponse = new TarefaResponse();

        tarefaResponse.setId(tarefa.get().getId());
        tarefaResponse.setNome(tarefa.get().getNomeTarefa());
        tarefaResponse.setData(tarefa.get().getData());
        tarefaResponse.setDescricao(tarefa.get().getDescricao());

        return tarefaResponse;
    }

    public String deletar(long id) {

        Optional<Tarefa> tarefa = tarefaRepository.findById(id);

        if (tarefa == null) {
            return "Tarefa não existe";
        } else {
            tarefaRepository.deleteById(id);
            return "Tarefa deletada";
        }
    }

    public String alterar(long id, TarefaRequest request) {

        Tarefa tarefa = tarefaRepository.findById(id).orElseThrow();

        tarefa.setNomeTarefa(request.getNome());
        tarefa.setData(request.getData());
        tarefa.setDescricao(request.getDescricao());

        Usuario usuario = usuarioRepository
                .findById(request.getIdUsuario())
                .orElseThrow();

        tarefa.setUsuario(usuario);

        tarefaRepository.save(tarefa);

        return "ok";
    }
}