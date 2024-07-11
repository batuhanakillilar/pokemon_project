package com.batu.pokemon.gym;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gym")
public class GymController {

    private final GymService gymService;

    public GymController(GymService gymService) {
        this.gymService = gymService;
    }

    @GetMapping
    public List<Gym> getAll() {
        return gymService.findAll();
    }

    @GetMapping("/{id}")
    public Gym getById(@PathVariable Integer id) {

        return gymService.findGym(id);

    }
    @PostMapping
    public Gym create(@RequestBody GymRequest gymRequest) {
        return gymService.createGym(gymRequest);
    }

    @PutMapping("/{gymId}")
    public Gym update(@RequestBody Integer gymId, @RequestBody GymRequest gymRequest) {
        return gymService.updateGym(gymId,gymRequest);
    }

    @DeleteMapping("/{gymId}")
    public void delete(@PathVariable Integer gymId) {
        gymService.deleteGym(gymId);
    }


}
