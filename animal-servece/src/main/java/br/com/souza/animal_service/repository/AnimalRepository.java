package br.com.souza.animal_service.repository;

import br.com.souza.animal_service.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    @Query("SELECT a FROM Animal a WHERE a.dataSaida IS NULL ORDER BY a.dataSaida")
    List<Animal> findNotAdopter();

    @Query("SELECT a FROM Animal a WHERE a.dataSaida IS NOT NULL")
    List<Animal> findAdopter();


}
