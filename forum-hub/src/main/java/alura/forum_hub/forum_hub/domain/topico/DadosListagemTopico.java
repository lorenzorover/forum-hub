package alura.forum_hub.forum_hub.domain.topico;

import java.time.LocalDateTime;

public record DadosListagemTopico(String titulo, String mensagem, String autor, LocalDateTime dataCriacao, Curso curso, EstadoTopico estadoTopico) {

    public DadosListagemTopico(Topico topico) {
        this(topico.getTitulo(), topico.getMensagem(), topico.getAutor(), topico.getDataCriacao(), topico.getCurso(), topico.getEstadoTopico());
    }
}
