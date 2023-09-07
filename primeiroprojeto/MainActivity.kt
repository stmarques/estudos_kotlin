// O Jetpack Compose é uma toolkit oficial do Google para o desenvolvimento de aplicativos nativos para dispositivos Android.
// Ele foi criado com base em funções que podem ser compostas que definem a IU do app de maneira programática,
// descrevendo as depedências de dados e formato.
// Este nome formato não separa mais a regra de negócio do desenvolvimento da tela.
// Ou seja, ao desenvolver o formato da tela, também aplicamos a lógica do aplicativo.
// Também é possível componentizar o aplicativo, ou seja é possível reutilizar um componente.

// Conceito de State: temos algumas variáveis importantes que vão se lembrar de como a tela estava.
// Dependendo de alguma ação do usuário que mudo o valor dessa variável e o estado da aplicação, os componentes irão reagir.
// Este recurso garante a agilidade e diminuição de erros de atualização de componentes de tela.
// Nunca mais vamos nos esquecer algum componente desatualizado na interface.
// No Jetpack Compose o estado é declarativo e reativo.
// Isso quer dizer que definimos os estado inicial dos componentes e qualquer mudança resultará em uma
// atualização total da IU de forma automática.
// Vantagem: o desenvolvedor foca no que realmente é importante, como a lógica da IU e não mais na
// manipulação direta dos componentes de tela.

package br.com.fiap.primeiroprojeto

import android.os.Bundle
import androidx.activity.ComponentActivity

import androidx.activity.compose.setContent
// Tradução de set content = definir conteúdo
// O bloco setContent define o layout da atividade em que as funções de composição são chamadas.
// Elas podem ser chamadas usando outras funções desse tipo.
// O método setContent é uma função que recebe como parâmetro um composable.

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface // composable
// Tradução de surface = superfície
// Container/recipiente principal da interface que envolve outros composables.
// Surface é como uma caixinha de componentes de estilização de outros componentes, similar a uma DIV no HTML.
// Ex.: um componente que tenha uma elevação, que fica em uma camada mais alta, com uma borda arredondada e tem um efeito de sombra.

import androidx.compose.material3.Text // composable
import androidx.compose.runtime.Composable // composable
// Blocos de construção
// Ao construir uma interface para Android, utilizando o Jetpack Compose, nós "quebramos" essa interface
// em pequenos "pedaços", que depois são combinados e reutilizados de modo a criar interfaces mais complexas.
// O composable representa cada pedacinho do aplicativo, cada elemento visual do aplicativo.
// Ex.: textos, botões, imagens, listas, check-box, etc.
// Em resumo, um composable é responsável por definir o conteúdo da IU,
// ou seja, descrever como o elemento da tela deve ser renderizado (aparência do componente)
// e se comportar (lógica de interação).
// Um composable pode ser construído através de outros composables, reutilizar componetes,
// ou seja, criar composables mais genéricos que serão utilizados em diferentes partes da interface.
// O Jetpack Compose possui composables predefinidos, praticamente todos os componentes de interfaces
// mais comuns em apps Android já estão disponíveis e prontos.
// Para criar uma função que pode ser composta, basta adicionar a anotação @Composable ao nome da função.

import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.fiap.primeiroprojeto.ui.theme.PrimeiroProjetoTheme

// Assim que o Android Studio finalizar a configuração do projeto, temos um arquivo chamado "MainActivity.kt".
// Esse arquivo será o ponto de partida da aplicação.
// A tela do app pode ser declarada dentro do próprio arquivo "MainActivity.kt".
// A "MainActivity" é uma subclasse de "ComponentActivity".
// Isso é necessário para que a MainActivity utilize métodos e propriedades do Jetpack Compose, como o "setContect".
class MainActivity : ComponentActivity() {

    // A tela MainActivity executará a função onCreate
    // A função onCreate inicia a aplicação fazendo chamada ao método setContent.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // O método setContent é uma função que recebe como parâmetro alguns composables responsáveis por definir o conteúdo da IU.
        setContent {
            PrimeiroProjetoTheme { // 1º composabe
                // Recebe como parâmetro outros composables.
                // Sempre que criamos um projeto, ele cria um arquivo de tema com o mesmo nome do projeto.
                // Esse arquivo de tema define toda a parte visual do aplicativo: dimensões, paleta de cores.
                // Essa paleta é aplicada ao componente, assim centralizamos toda a configuração de cores.
                // O arquivo também engloba (embrulha) outros componentes.
                Surface( // 2º composable
                    // Envolve outros composables e recebe dois parâmetros,
                    // A surface container using the 'background' color from the theme
                    modifier = Modifier.fillMaxSize(), //1º parâmetro: tamanho da tela.
                    color = MaterialTheme.colorScheme.background //2º parâmetro: cor de fundo padrão.
                ) {
                    Greeting("Android") //3º composable
                    // Função que recebe como parâmetro uma String.
                    // Tem como objetivo renderizar o componente, é declarada abaixo no código.
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // Por padrão, os nomes das funções de composição são escritos com a inicial maiúscula.
    // Isso é importante para diferenciar as funções de composição (desenhar os elementos visuais do app) das funções regulares (executam cálculos, fazem chamada para uma API).
    // A função "Greeting" foi anotada como @Composable para identificar como a função responsável por definir a aparência e o comportamento visual.
    // A função "Greeting" está declarando um composable "Text".
    Text( //função de texto
        text = "Hello $name!", // composable de texto
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PrimeiroProjetoTheme {
        Greeting("Android")
    }
}