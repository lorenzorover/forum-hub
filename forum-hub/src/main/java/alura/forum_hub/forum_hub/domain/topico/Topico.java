package alura.forum_hub.forum_hub.domain.topico;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensagem;
    private String autor;
    private LocalDateTime dataCriacao;
    @Enumerated(EnumType.STRING)
    private Curso curso;
    @Enumerated(EnumType.STRING)
    private EstadoTopico estadoTopico;

    private Boolean ativo;

    public Topico(DadosCadastroTopico dadosCadastroTopico) {
        this.titulo = dadosCadastroTopico.titulo();
        this.mensagem = dadosCadastroTopico.mensagem();
        this.autor = dadosCadastroTopico.autor();
        this.dataCriacao = LocalDateTime.now();
        this.curso = dadosCadastroTopico.curso();
        this.estadoTopico = EstadoTopico.NAO_RESPONDIDO;
        this.ativo = true;
    }

    public void atualizarInformacoes(DadosAtualizacaoTopico dadosAtualizacaoTopico) {
        this.titulo = dadosAtualizacaoTopico.titulo();
        this.mensagem = dadosAtualizacaoTopico.mensagem();
        this.curso = dadosAtualizacaoTopico.curso();
        this.estadoTopico = dadosAtualizacaoTopico.estadoTopico();
    }

    public void excluir() { this.ativo = false; }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getAutor() {
        return autor;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public Curso getCurso() {
        return curso;
    }

    public EstadoTopico getEstadoTopico() {
        return estadoTopico;
    }

    public Boolean getAtivo() {
        return ativo;
    }
}
