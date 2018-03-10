package br.com.tatianefsantos.carroapi.controller

import br.com.tatianefsantos.carroapi.entity.Carro
import br.com.tatianefsantos.carroapi.service.CarroService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/carro")
class CarroController {

    @Autowired
    lateinit var carroService: CarroService

    @GetMapping
    fun buscarTodos(): List<Carro>{
        return carroService.buscarTodosCarros()
    }

    @PostMapping
    fun salvar(@RequestBody carro: Carro){
        carroService.salvar(carro)
    }

}