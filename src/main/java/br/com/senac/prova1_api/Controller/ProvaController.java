package br.com.senac.prova1_api.Controller;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/prova")
@CrossOrigin


public class ProvaController {

    @GetMapping("/validarNumero")
    public ResponseEntity<String> parImpar(@RequestParam double numero) {
        if ((numero % 2) == 0) {
            return ResponseEntity.ok("par");
        }
        return ResponseEntity.ok("Impar");
    }

}
