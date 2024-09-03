/**
 *
 * Enumerador TipoAmbiente
 * Represents the types of marine environments.
 */
 
/**
 * DataClass base para conservação marinha
 * Represents the base class for marine conservation.
 *
 * @property tipoAmbiente The type of environment.
 * @property areaProtegidaEmKm2 The protected area in square kilometers.
 * @property possuiProgramaMonitoramento Indicates if there is a monitoring program.
 */
 
/**
 * Herança e DataClass para ReservaMarinha
 * Represents a marine reserve.
 *
 * @property tipoAmbiente The type of environment.
 * @property areaProtegidaEmKm2 The protected area in square kilometers.
 * @property possuiProgramaMonitoramento Indicates if there is a monitoring program.
 * @property tipoReserva The type of reserve.
 */
 
/**
 * Herança e DataClass para AreaProtegidaMarinha
 * Represents a marine protected area.
 *
 * @property tipoAmbiente The type of environment.
 * @property areaProtegidaEmKm2 The protected area in square kilometers.
 * @property possuiProgramaMonitoramento Indicates if there is a monitoring program.
 * @property tipoProtecao The type of protection.
 */
 
/**
 * Uso de lateinit para inicializar as instâncias posteriormente
 * Initializes the instances later using lateinit.
 */
 
/**
 * main function
 * The entry point of the program.
 */
 
/**
 * Comando with para trabalhar com os objetos
 * Uses the with command to work with the objects.
 *
 * @param reserva The marine reserve object.
 * @param areaProtegida The marine protected area object.
 */
 
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
data class ReservaMarinha(
    override val tipoAmbiente: TipoAmbiente,
    override val areaProtegidaEmKm2: Double,
    override val possuiProgramaMonitoramento: Boolean,
    val tipoReserva: String
) : ConservacaoMarinha(tipoAmbiente, areaProtegidaEmKm2, possuiProgramaMonitoramento) {
    override fun toString(): String {
        return super.toString() + "\nTipo de Reserva: $tipoReserva"
    }
}

// TODO: Herança e DataClass para AreaProtegidaMarinha
data class AreaProtegidaMarinha(
    override val tipoAmbiente: TipoAmbiente,
    override val areaProtegidaEmKm2: Double,
    override val possuiProgramaMonitoramento: Boolean,
    val tipoProtecao: String
) : ConservacaoMarinha(tipoAmbiente, areaProtegidaEmKm2, possuiProgramaMonitoramento) {
    override fun toString(): String {
        return super.toString() + "\nTipo de Proteção: $tipoProtecao"
    }
}

// Uso de lateinit para inicializar as instâncias posteriormente
lateinit var reserva: ReservaMarinha
lateinit var areaProtegida: AreaProtegidaMarinha

fun main() {
    // Inicializando as variáveis usando lateinit
    reserva = ReservaMarinha(TipoAmbiente.MANGUEZAL, 50.0, true, "Reserva Biológica")
    areaProtegida = AreaProtegidaMarinha(TipoAmbiente.CORAL, 100.0, false, "Proteção Integral")

    // TODO Comando with para trabalhar com os objetos
    with(reserva) {
        println("Detalhes da Reserva Marinha:")
        println(this)
    }

    with(areaProtegida) {
        println("\nDetalhes da Área Protegida Marinha:")
        println(this)
    }
}