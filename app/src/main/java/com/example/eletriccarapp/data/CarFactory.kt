package com.example.eletriccarapp.data

import com.example.eletriccarapp.domain.Carro

object CarFactory {

    val list = listOf(
        Carro(
            id = 1,
            preco = "R$ 300.000,00",
            bateria = "300 kWh",
            potencia = "200cv",
            recarga = "30 min",
            urlPhoto = "www.google.com.br",
            isFavorite = false,
        ),
        Carro(
            id = 2,
            preco = "R$ 200.000,00",
            bateria = "200 kWh",
            potencia = "150cv",
            recarga = "40 min",
            urlPhoto = "www.google.com.br",
            isFavorite = false
        )
    )

    // VERBOS HTTP
    // - GET -> Pare recuperar informaçoes
    // - POST -> Para enviar infomacoes para um servidor
    // - DELETE -> Que pra deletar algum recurso
    // - PUT -> Alterar uma entidade como um todo
    // - PATCH -> Alterar um atributo da entidade
}