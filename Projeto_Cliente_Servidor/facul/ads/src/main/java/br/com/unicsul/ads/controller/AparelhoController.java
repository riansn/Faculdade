package br.com.unicsul.ads.controller;

import br.com.unicsul.ads.entity.Aparelho;
import br.com.unicsul.ads.service.AparelhoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/aparelho")
public class AparelhoController {

    private final AparelhoService aparelhoService = null;

    @PostMapping
    public ResponseEntity<Aparelho> create(@RequestBody Aparelho aparelho) {
        Aparelho ap = aparelhoService.salvar(aparelho);
        return ResponseEntity.status(HttpStatus.CREATED).body(ap);
    }
}
