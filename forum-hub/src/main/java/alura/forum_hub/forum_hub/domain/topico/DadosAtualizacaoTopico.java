package alura.forum_hub.forum_hub.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoTopico(@NotNull
                                     Long id,

                                     @NotBlank(message = "{titulo.obrigatorio}")
                                     String titulo,

                                     @NotBlank(message = "{mensagem.obrigatorio}")
                                     String mensagem,

                                     @NotNull(message = "{curso.obrigatorio}")
                                     Curso curso,

                                     @NotNull(message = "{estado_topico.obrigatorio}")
                                     EstadoTopico estadoTopico
){}
