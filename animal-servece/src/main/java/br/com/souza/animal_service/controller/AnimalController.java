package br.com.souza.animal_service.controller;

import br.com.souza.animal_service.entities.Animal;
import br.com.souza.animal_service.repository.AnimalRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    private AnimalRepository repository;

    public AnimalController(AnimalRepository repository){
        this.repository = repository;
    }

    @GetMapping
    private List<Animal> findAll(){
        return repository.findAll();
    }

    @PostMapping
    private Animal save(@RequestBody Animal animal){
        return repository.save(animal);
    }

    @GetMapping("/not_adopted")
    private List<Animal> findNotAdopter(){
        return repository.findNotAdopter();
    }

    @GetMapping("/adopted")
    private List<Animal> findAdopter(){
        return repository.findAdopter();
    }



}
