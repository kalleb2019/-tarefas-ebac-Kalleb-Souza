package br.com.souza.animal_service.test;

import br.com.souza.animal_service.entities.Animal;
import br.com.souza.animal_service.entities.enums.TipoAnimal;
import br.com.souza.animal_service.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.sql.Date;
import java.time.LocalDate;



@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    private AnimalRepository repository;

    @Override
    public void run(String... args) throws Exception {

        Animal a1 = new Animal();
        a1.setCodigo("A123");
        a1.setNome("Max");
        a1.setTipoAnimal(TipoAnimal.OUTROS);
        a1.setPorte("Médio");
        a1.setCordenada("Lat: 45.123, Lon: -93.123");
        a1.setIsCastrado(true);
        a1.setIdadeEstimada(5);
        a1.setRaca("Labrador");
        a1.setSexo("Macho");
        LocalDate ld1 = LocalDate.parse("2024-07-22");
        Date sqlDate1 = Date.valueOf(ld1);
        a1.setDataEntrada(sqlDate1);
        a1.setDataSaida(null);
        a1.setDescricao("Animal amigável e ativo.");
        a1.setMausTrato(false);
        a1.setRecebedor("João Silva");
        a1.setDataObito(null);
        repository.save(a1);

        // Exemplo 2
        Animal a2 = new Animal();
        a2.setCodigo("B456");
        a2.setNome("Bella");
        a2.setTipoAnimal(TipoAnimal.GATO);
        a2.setPorte("Pequeno");
        a2.setCordenada("Lat: 46.123, Lon: -94.123");
        a2.setIsCastrado(false);
        a2.setIdadeEstimada(3);
        a2.setRaca("Siamês");
        a2.setSexo("Fêmea");
        LocalDate ld2 = LocalDate.parse("2024-08-15");
        Date sqlDate2 = Date.valueOf(ld2);
        a2.setDataEntrada(sqlDate2);
        a2.setDataSaida(null);
        a2.setDescricao("Gato curioso e brincalhão.");
        a2.setMausTrato(false);
        a2.setRecebedor("Maria Oliveira");
        a2.setDataObito(null);
         repository.save(a2);

        // Exemplo 3
        Animal a3 = new Animal();
        a3.setCodigo("C789");
        a3.setNome("Rex");
        a3.setTipoAnimal(TipoAnimal.CACHORRO);
        a3.setPorte("Grande");
        a3.setCordenada("Lat: 47.123, Lon: -95.123");
        a3.setIsCastrado(true);
        a3.setIdadeEstimada(7);
        a3.setRaca("Pastor Alemão");
        a3.setSexo("Macho");
        LocalDate ld3 = LocalDate.parse("2024-06-01");
        Date sqlDate3 = Date.valueOf(ld3);
        a3.setDataEntrada(sqlDate3);
        a3.setDataSaida(null);
        a3.setDescricao("Cachorro leal e protetor.");
        a3.setMausTrato(true);
        a3.setRecebedor("Carlos Pereira");
        a3.setDataObito(null);
         repository.save(a3);

        // Exemplo 4
        Animal a4 = new Animal();
        a4.setCodigo("D012");
        a4.setNome("Luna");
        a4.setTipoAnimal(TipoAnimal.GATO);
        a4.setPorte("Médio");
        a4.setCordenada("Lat: 48.123, Lon: -96.123");
        a4.setIsCastrado(true);
        a4.setIdadeEstimada(4);
        a4.setRaca("Persa");
        a4.setSexo("Fêmea");
        LocalDate ld4 = LocalDate.parse("2024-09-10");
        Date sqlDate4 = Date.valueOf(ld4);
        a4.setDataEntrada(sqlDate4);
        a4.setDataSaida(null);
        a4.setDescricao("Gato calmo e afetuoso.");
        a4.setMausTrato(false);
        a4.setRecebedor("Ana Souza");
        a4.setDataObito(null);
         repository.save(a4);

        // Exemplo 5
        Animal a5 = new Animal();
        a5.setCodigo("E345");
        a5.setNome("Charlie");
        a5.setTipoAnimal(TipoAnimal.CACHORRO);
        a5.setPorte("Pequeno");
        a5.setCordenada("Lat: 49.123, Lon: -97.123");
        a5.setIsCastrado(false);
        a5.setIdadeEstimada(2);
        a5.setRaca("Poodle");
        a5.setSexo("Macho");
        LocalDate ld5 = LocalDate.parse("2024-10-05");
        Date sqlDate5 = Date.valueOf(ld5);
        a5.setDataEntrada(sqlDate5);
        a5.setDataSaida(null);
        a5.setDescricao("Cachorro ativo e alegre.");
        a5.setMausTrato(true);
        a5.setRecebedor("Fernanda Lima");
        a5.setDataObito(null);

        repository.save(a5);



    }
}
