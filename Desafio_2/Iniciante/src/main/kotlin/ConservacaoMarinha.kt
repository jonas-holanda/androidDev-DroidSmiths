class ConservacaoMarinha(
    //construtor primário
    tipoAmbiente: String,
    areaProtegidaEmKm2: Double,
    possuiProgramaMonitoramento: Boolean
) {
    // Variável backing field para tipoAmbiente
    private var _tipoAmbiente: String = tipoAmbiente

    // Função init 
    init {
        // adicionar validações ou lógica adicional aqui, se necessário
        require(areaProtegidaEmKm2 > 0) { "A área protegida deve ser maior que zero." }
    }

    // Construtor secundário
    constructor(tipoAmbiente: String, areaProtegidaEmKm2: Double) : this(
        tipoAmbiente,
        areaProtegidaEmKm2,
        false // Assume que não possui programa de monitoramento por padrão
    )

    // Getter e Setter para tipoAmbiente
    var tipoAmbiente: String
        get() {
            return _tipoAmbiente
        }
        set(value) {
            // Validação opcional
            require(value.isNotEmpty()) { "O tipo de ambiente não pode ser vazio." }
            _tipoAmbiente = value
        }

    // TODO CRIAR GETTER E SETTER PARA areaProtegidaEmKm2


    // Getter de Setter para possuiProgramaMonitoramento
    var possuiProgramaMonitoramento: Boolean = possuiProgramaMonitoramento
        get() {
           return field
        }
        set(value) {
            field = value
        }

    override fun toString(): String {
        return """
            Tipo de Ambiente: $tipoAmbiente
            Área Protegida: $areaProtegidaEmKm2 Km²
            Possui Monitoramento: ${if (possuiProgramaMonitoramento) "Sim" else "Não"}
        """.trimIndent()
    }
}

fun main() {
    var tipoAmbiente: String = ""
    var areaProtegidaEmKm2: Double = 0.0
    var possuiProgramaMonitoramento: Boolean = false
    var respostaProgMonitoramento = ""

    // Entrada de dados para tipoAmbiente
    println("Digite o tipo de ambiente marinho:")
    tipoAmbiente = readln()

    // TODO Criar a entrada de dados para a variável areaProtegidaEmKm2 com as conversões de tipo

    // Entrada de dados de possuiProgramaMonitoramento
    println("Possui programas de monitoramento? (sim ou não)")
    respostaProgMonitoramento = readln().lowercase()
    if (respostaProgMonitoramento == "sim") {
        possuiProgramaMonitoramento = true
    } else if (respostaProgMonitoramento == "não" || respostaProgMonitoramento == "nao") {
        possuiProgramaMonitoramento = false
    }

    // TODO Adicionar as entradas de dados das variáveis tipoAmbiente e areaProtegidaEmKm2
    val conservacao1 = ConservacaoMarinha(tipoAmbiente, 100.0, possuiProgramaMonitoramento)
    println(conservacao1)


    val conservacao2 = ConservacaoMarinha("Manguezal", 50.0)
    println(conservacao2)

    // Atualiza algumas propriedades
    conservacao2.possuiProgramaMonitoramento = true
    println(conservacao2)
}