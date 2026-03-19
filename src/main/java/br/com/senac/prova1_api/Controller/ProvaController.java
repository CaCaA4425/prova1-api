package br.com.senac.prova1_api.Controller;

import br.com.senac.prova1_api.Controller.dtos.ProvaResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/prova")
@CrossOrigin
public class ProvaController {

    @GetMapping("/validarNumero")
    public ResponseEntity<ProvaResponse> imparPar(@RequestParam int numero) {

        int restoDivisao = numero % 2;

        ProvaResponse retorno = new ProvaResponse();
        retorno.setRestoDivisao(restoDivisao);

        if (restoDivisao == 0) {
            retorno.setImparPar("Par");
        } else {
            retorno.setImparPar("Ímpar");
        }

        return ResponseEntity.ok(retorno);
    }
}
