package alura.forum_hub.forum_hub.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroTopico (@NotBlank(message = "{titulo.obrigatorio}")
                                   String titulo,

                                   @NotBlank(message = "{mensagem.obrigatorio}")
                                   String mensagem,

                                   @NotBlank(message = "{autor.obrigatorio}")
                                   String autor,

                                   @NotNull(message = "{curso.obrigatorio}")
                                   Curso curso){}
