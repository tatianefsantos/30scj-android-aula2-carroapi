package br.com.tatianefsantos.carroapi.service

import br.com.tatianefsantos.carroapi.entity.Carro
import br.com.tatianefsantos.carroapi.repository.CarroRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CarroService {
    @Autowired
    lateinit var carroRepository: CarroRepository

    fun buscarCarroPorMarca(marca: String): List<Carro>{
        return carroRepository.findByMarcaContaining(marca)
    }

    fun buscarCarroPorAno(ano: Int): List<Carro>{
        return carroRepository.findByAno(ano)
    }

    fun buscarCarroPorPlaca(placa: String): List<Carro>{
        return carroRepository.findByPlacaContaining(placa)
    }

    fun salvar(carro: Carro){
        carroRepository.save(carro)
    }

    fun deletar(carro: Carro){
        carroRepository.delete(carro)
    }

    fun buscarTodosCarros(): List<Carro>{
        return carroRepository.findAll()
    }
}