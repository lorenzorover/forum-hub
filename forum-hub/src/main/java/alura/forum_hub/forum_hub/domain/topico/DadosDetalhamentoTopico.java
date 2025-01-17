package alura.forum_hub.forum_hub.domain.topico;

import java.time.LocalDateTime;

public record DadosDetalhamentoTopico(Long id, String titulo, String mensagem, String autor, LocalDateTime dataCriacao, Curso curso, EstadoTopico estadoTopico) {

    public DadosDetalhamentoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getAutor(), topico.getDataCriacao(), topico.getCurso(), topico.getEstadoTopico());
    }
}
