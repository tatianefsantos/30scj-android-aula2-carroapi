package br.com.tatianefsantos.carroapi.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Carro(@Id var id: String?,
                 var marca: String,
                 var modelo: String,
                 var ano: Int,
                 var placa: String) {
//    constructor() : this(id: "", marca: "", modelo: "", ano: "", placa: "")
}