class ConservacaoMarinha(
    tipoAmbiente: String,
    areaProtegidaEmKm2: Double,
    possuiProgramaMonitoramento: Boolean
) {
    private var _tipoAmbiente: String = tipoAmbiente

    init {
        require(areaProtegidaEmKm2 > 0) { "A área protegida deve ser maior que zero." }
    }

    constructor(tipoAmbiente: String, areaProtegidaEmKm2: Double) : this(
        tipoAmbiente,
        areaProtegidaEmKm2,
        false
    )

    var tipoAmbiente: String
        get() = _tipoAmbiente
        set(value) {
            require(value.isNotEmpty()) { "O tipo de ambiente não pode ser vazio." }
            _tipoAmbiente = value
        }

    var areaProtegidaEmKm2: Double = areaProtegidaEmKm2
        get() = field
        set(value) {
            field = value
        }

    var possuiProgramaMonitoramento: Boolean = possuiProgramaMonitoramento
        get() = field
        set(value) {
            field = value
        }

    override fun toString(): String {
        return """
            +-------------------------------+
            |    Conservação Marinha        |
            +-------------------------------+
            | Tipo de Ambiente: $tipoAmbiente
            | Área Protegida: $areaProtegidaEmKm2 Km²
            | Possui Monitoramento: ${if (possuiProgramaMonitoramento) "Sim" else "Não"}
            +-------------------------------+
        """.trimIndent()
    }
}

fun printSectionHeader(title: String) {
    val line = "+${"-".repeat(30)}+"
    println(line)
    println("| ${title.padEnd(28)} |")
    println(line)
}

fun main() {
    var tipoAmbiente: String
    var areaProtegidaEmKm2: Double
    var possuiProgramaMonitoramento = false
    var respostaProgMonitoramento: String

    // Entrada de dados para tipoAmbiente
    printSectionHeader("Entrada de Dados")
    println("Digite o tipo de ambiente marinho:")
    tipoAmbiente = readln()
    println("-".repeat(32))

    // Entrada de dados para a variável areaProtegidaEmKm2
    println("Digite a área protegida em Km²:")
    areaProtegidaEmKm2 = readlnOrNull()?.toDouble() ?: 0.0
    println("-".repeat(32))

    // Entrada de dados de possuiProgramaMonitoramento
    println("Possui programas de monitoramento? (sim ou não)")
    respostaProgMonitoramento = readln()
    println("-".repeat(32))

    if (respostaProgMonitoramento.equals("sim", ignoreCase = true)) {
        possuiProgramaMonitoramento = true
    } else if (respostaProgMonitoramento.equals("não", ignoreCase = true) || respostaProgMonitoramento.equals("nao", ignoreCase = true)) {
        possuiProgramaMonitoramento = false
    }

    // Criando objetos de ConservacaoMarinha
    println()
    printSectionHeader("Resultado")
    val conservacao1 = ConservacaoMarinha(tipoAmbiente, areaProtegidaEmKm2, possuiProgramaMonitoramento)
    println(conservacao1)

    val conservacao2 = ConservacaoMarinha("Manguezal", 50.0)
    println(conservacao2)

    // Atualiza algumas propriedades
    conservacao2.possuiProgramaMonitoramento = true
    println(conservacao2)
}