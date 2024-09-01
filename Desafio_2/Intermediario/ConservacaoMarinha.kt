// Enumerador TipoAmbiente
enum class TipoAmbiente {
    CORAL, MANGUEZAL
}

// DataClass base para conservação marinha
open class ConservacaoMarinha(
    open val tipoAmbiente: TipoAmbiente,
    open val areaProtegidaEmKm2: Double,
    open val possuiProgramaMonitoramento: Boolean
) {
    override fun toString(): String {
        return """
            Tipo de Ambiente: $tipoAmbiente
            Área Protegida: $areaProtegidaEmKm2 Km²
            Possui Programa de Monitoramento: ${if (possuiProgramaMonitoramento) "Sim" else "Não"}            
        """.trimIndent()
    }
}

// TODO: Herança e DataClass para ReservaMarinha


// TODO: Herança e DataClass para AreaProtegidaMarinha


// Uso de lateinit para inicializar as instâncias posteriormente
lateinit var reserva: ReservaMarinha
lateinit var areaProtegida: AreaProtegidaMarinha

fun main() {
    // Inicializando as variáveis usando lateinit
    reserva = ReservaMarinha(TipoAmbiente.MANGUEZAL, 50.0, true, "Reserva Biológica")
    areaProtegida = AreaProtegidaMarinha(TipoAmbiente.CORAL, 100.0, false, "Proteção Integral")

    // TODO Comando with para trabalhar com os objetos

}