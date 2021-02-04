package bancodesangue.bancodesangue.api.controller;

import bancodesangue.bancodesangue.api.dto.doadoresDTO;
import bancodesangue.bancodesangue.api.services.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="doadores")
public class StatusController {

    @Autowired
    private service service;

    @GetMapping(path = "/api/status")
    public String check() {
        return "Online";
    }


    @GetMapping
    public List<doadoresDTO> getDoadores(){
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<doadoresDTO> insert(@RequestBody doadoresDTO dto){
        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{cpf}").buildAndExpand(dto.getCpf()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    @PutMapping("/{cpf}/confirmado")
    public ResponseEntity<doadoresDTO> setDelivered(@PathVariable String cpf){
        doadoresDTO dto = service.setConfirmado(cpf);
        return ResponseEntity.ok().body(dto);
    }

    @DeleteMapping("/{cpf}")
    public ResponseEntity<String> delete(@PathVariable String cpf){
        service.delete(cpf);
        return ResponseEntity.ok().body(cpf + " deletado com sucesso");
    }

}
