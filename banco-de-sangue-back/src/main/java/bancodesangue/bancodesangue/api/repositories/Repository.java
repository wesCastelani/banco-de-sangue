package bancodesangue.bancodesangue.api.repositories;

import bancodesangue.bancodesangue.api.entities.Doadores;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface Repository extends JpaRepository<Doadores, String> {
}
