package br.senai.sp.jandira.retrofitviacep

import com.google.gson.annotations.SerializedName

data class Cep(
    var cep: String,
    var logradouro:String,
    var complemento: String,
    @SerializedName("localidade")
    var bairro: String,
    var cidade: String,
    var uf: String,
    var ibge: String,
    var gia: String,
    var ddd: String,
    var siafi: String



)

