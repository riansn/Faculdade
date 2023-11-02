package br.com.unicsul.ads.service;

import br.com.unicsul.ads.entity.Aparelho;
import br.com.unicsul.ads.repository.AparelhoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class AparelhoService {

    private final AparelhoRepository aparelhoRepository = null;

    @Transactional
    public Aparelho salvar(Aparelho aparelho) {

        return aparelhoRepository.save(aparelho);
    }
}
