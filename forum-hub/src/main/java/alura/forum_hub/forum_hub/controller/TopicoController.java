package alura.forum_hub.forum_hub.controller;

import alura.forum_hub.forum_hub.domain.topico.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    // Método de cadastrar tópico
    @PostMapping
    @Transactional
    public ResponseEntity cadastrarTopico(@RequestBody @Valid DadosCadastroTopico dadosCadastroTopico, UriComponentsBuilder uriComponentsBuilder) {
        var topico = new Topico(dadosCadastroTopico);
        topicoRepository.save(topico);

        var uri = uriComponentsBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();

        return ResponseEntity.created(uri).body(new DadosDetalhamentoTopico(topico));
    }

    // Método de puxar TODOS os tópicos
    @GetMapping("/listar/todos")
    public ResponseEntity<Page<DadosListagemTopico>> listarTopicos(@PageableDefault() Pageable paginacao) {
        var page = topicoRepository.findAllByAtivoTrue(paginacao).map(DadosListagemTopico::new);

        return ResponseEntity.ok(page);
    }

    // Método de puxar 10 tópicos
    @GetMapping("/listar/10")
    public ResponseEntity<Page<DadosListagemTopico>> listar10Topicos(@PageableDefault(size = 10) Pageable paginacao) {
        var page = topicoRepository.findAllByAtivoTrue(paginacao).map(DadosListagemTopico::new);

        return ResponseEntity.ok(page);
    }

    // Método de puxar um tópico especifico pelo id
    @GetMapping("/{id}")
    public ResponseEntity buscarTopico(@PathVariable Long id) {
        var topico = topicoRepository.getReferenceById(id);

        return ResponseEntity.ok(new DadosDetalhamentoTopico(topico));
    }

    // Método de atualizar tópico
    @PutMapping
    @Transactional
    public ResponseEntity atualizarTopico(@RequestBody @Valid DadosAtualizacaoTopico dadosAtualizacaoTopico) {
        var topico = topicoRepository.getReferenceById(dadosAtualizacaoTopico.id());
        topico.atualizarInformacoes(dadosAtualizacaoTopico);

        return ResponseEntity.ok(new DadosDetalhamentoTopico(topico));
    }

    // Método de exclusão de tópico por id
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity excluirTopico(@PathVariable Long id) {
        var topico = topicoRepository.getReferenceById(id);
        topico.excluir();

        return ResponseEntity.noContent().build();
    }

}
