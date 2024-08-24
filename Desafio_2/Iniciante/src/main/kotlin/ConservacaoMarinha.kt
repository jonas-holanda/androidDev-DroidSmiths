// Define a classe ConservacaoMarinha
class ConservacaoMarinha(
    // Propriedades com o construtor primário
    var tipoAmbiente: String,
    var areaProtegidaEmKm2: Double,
    var possuiProgramaMonitoramento: Boolean
) {
    // Função init para inicialização
    init {
        // Você pode adicionar validações ou lógica adicional aqui, se necessário
        require(areaProtegidaEmKm2 > 0) { "A área protegida deve ser maior que zero." }
    }

    // Construtor secundário
    constructor(tipoAmbiente: String, areaProtegidaEmKm2: Double) : this(
        tipoAmbiente,
        areaProtegidaEmKm2,
        false // Assume que não possui programa de monitoramento por padrão
    )

    // Método toString para exibir informações formatadas
    override fun toString(): String {
        return """
            Tipo de Ambiente: $tipoAmbiente
            Área Protegida: $areaProtegidaEmKm2 Km²
            Possui Monitoramento: ${if (possuiProgramaMonitoramento) "Sim" else "Não"}
        """.trimIndent()
    }
}

// Função principal para testar a classe
fun main() {
    // Cria uma instância da classe com o construtor primário
    val conservacao1 = ConservacaoMarinha("Coral", 100.0, true)
    println(conservacao1)

    // Cria uma instância da classe com o construtor secundário
    val conservacao2 = ConservacaoMarinha("Manguezal", 50.0)
    println(conservacao2)

    // Atualiza algumas propriedades
    conservacao2.possuiProgramaMonitoramento = true
    println(conservacao2)
}
