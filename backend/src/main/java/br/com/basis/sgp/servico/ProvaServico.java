package br.com.basis.sgp.servico;

<<<<<<< HEAD
import br.com.basis.sgp.dominio.Prova;
import br.com.basis.sgp.dominio.Usuario;
import br.com.basis.sgp.servico.dto.ProvaDTO;
import br.com.basis.sgp.servico.dto.ProvaDetalhadaDTO;
import br.com.basis.sgp.servico.dto.ProvaListagemDTO;
import br.com.basis.sgp.servico.dto.SelectDTO;
=======
import br.com.basis.sgp.servico.dto.*;
>>>>>>> 3c5f0f3ae58980e6107ebc8792b9e5f1153b798d
import br.com.basis.sgp.servico.filtro.ProvaFiltro;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ProvaServico {

    public Page<ProvaListagemDTO> listarProvas(ProvaFiltro provaFiltro, Pageable pageable);

    public ProvaDTO exibirPorId(Long id);

    public ProvaDetalhadaDTO exibirProvaDetalhada(Long id);

    public ProvaDTO salvar(ProvaDTO provaDTO);

    public List<SelectDTO> filtrarAutocomplete(String query);

    public void excluir(Long id);

    public ProvaDetalhadaDTO exibirProvaDetalhada(Long id);

    public ProvaRespostaDTO buscarRespostas(Long id);

    public List<SelectDTO> listarProvaDropDown();

}
