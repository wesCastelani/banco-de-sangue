package bancodesangue.bancodesangue.api.services;

import bancodesangue.bancodesangue.api.dto.doadoresDTO;
import bancodesangue.bancodesangue.api.entities.Doadores;
import bancodesangue.bancodesangue.api.repositories.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class service {

    @Autowired
    private Repository repository;

    @Transactional(readOnly = true)
    public List<doadoresDTO> findAll(){
        List<Doadores> list =repository.findAll();
        List<Doadores> possiveisDoadores = new ArrayList<Doadores>();
        list.forEach(doador -> {
            Calendar now = Calendar.getInstance();
            int anos = now.get(Calendar.YEAR) - doador.getData_nasc().get(Calendar.YEAR);;
            if (anos > 16 && anos < 65){
                possiveisDoadores.add(doador);
            }
        });
        return possiveisDoadores.stream().map(x -> new doadoresDTO(x)).collect(Collectors.toList());
    }
    @Transactional
    public doadoresDTO insert(doadoresDTO doadoresDTO){
        Doadores doadores = new Doadores(doadoresDTO.getNome(), doadoresDTO.getCpf(), doadoresDTO.getRg(), doadoresDTO.getData_nasc(), doadoresDTO.getSexo(), doadoresDTO.getMae(), doadoresDTO.getPai(), doadoresDTO.getEmail(), doadoresDTO.getCep(), doadoresDTO.getEndereco(), doadoresDTO.getNumero(), doadoresDTO.getBairro(), doadoresDTO.getCidade(), doadoresDTO.getEstado(), doadoresDTO.getTelefone_fixo(), doadoresDTO.getCelular(), doadoresDTO.getAltura(), doadoresDTO.getPeso(), doadoresDTO.getTipo_sanguineo(), doadoresDTO.getConfirmado());

        doadores = repository.save(doadores);
        return new doadoresDTO(doadores);
    }

    @Transactional
    public doadoresDTO setConfirmado(String cpf){
        Doadores doadores = repository.getOne(cpf);
        doadores.setConfirmado(true);
        doadores = repository.save(doadores);
        return new doadoresDTO(doadores);
    }

    @Transactional
    public void delete(String cpf){
        Doadores doadores = repository.getOne(cpf);
        repository.delete(doadores);
    }
}
