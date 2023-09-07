package br.com.fiap.minhaidade

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Column // coluna
// Column é container/recipiente que posiciona os composables verticalmente na ordem em que são inseridos, de cima para baixo.

import androidx.compose.foundation.layout.Row // composable
// Row é um container/recipiente que posiciona os composables horizontalmente na ordem em que estão inseridos, da esquerda para direita.

import androidx.compose.foundation.layout.Spacer // configurar espaço
import androidx.compose.foundation.layout.fillMaxSize // configurar tamanho máximo
import androidx.compose.foundation.layout.fillMaxWidth // configurar preenchimento máximo largura
import androidx.compose.foundation.layout.height // configurar altura
import androidx.compose.foundation.layout.size // configurar tamanho
import androidx.compose.foundation.layout.width // configurar largura
import androidx.compose.foundation.shape.CircleShape // formato de circulo
import androidx.compose.foundation.shape.RoundedCornerShape // formato com os cantos arredondados
import androidx.compose.material3.Button // botão
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface // superfície
import androidx.compose.material3.Text // texto
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
// Parâmetro usado para aplicar modificações aos composables.
// Tais como espaçamento, cor, tamanho, etc.

import androidx.compose.ui.graphics.Color // cor do texto
import androidx.compose.ui.graphics.RectangleShape // formato de retângulo
import androidx.compose.ui.text.font.FontWeight // estilizar com negrito, itálico
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.minhaidade.ui.theme.MinhaIdadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MinhaIdadeTheme { // 1º composable
                // A surface container using the 'background' color from the theme
                Surface( // 2º composable
                    modifier = Modifier.fillMaxSize(), // modificar o tamanho da tela.
                    color = MaterialTheme.colorScheme.background // cor de fundo.
                ) {
                   MeuComponente() // 3º composable
                }
            }
        }
    }
}

@Composable
fun MeuComponente() {
// A função "MeuComponente" está declarando alguns composables.

    var idade = remember { // função para criar variáveis de estado
        mutableStateOf(0) // função que torna a variável mutável e determina o valor inicial, no caso zero
    }


    Column( // composable de coluna
        horizontalAlignment = Alignment.CenterHorizontally, // parâmetro que define o alinhamento horizontal da coluna, no caso centralizado
        verticalArrangement = Arrangement.Center // parâmetro que defini a disposição vertical da coluna, no caso no centro da vertical
        // As duas configurações acima posicionam o conteúdo no centro da IU.

    ){
        Text( // composable de texto
            text = "Qual a sua idade?",
            color = Color(0xFFE91E63), // parâmetro que defini a cor do texto usando o código hexadecimal
            fontSize = 24.sp, // parâmetro que defini o tamanho da fonte
            fontWeight = FontWeight.Bold, // parâmetro que defini estilização, no caso negrito
            textAlign = TextAlign.Center,
            //modifier = Modifier.fillMaxWidth(), // modificador para preencher a largura máxima com o texto
        )
        Text( // composable de texto
            text = "Pressione os botões para informar a sua idade",
            fontSize = 20.sp, // parâmetro que defini o tamanho da fonte
            color = Color.Gray, // parâmetro que defini a cor do texto
            textAlign = TextAlign.Center,
            //modifier = Modifier.fillMaxWidth() // modificador para preencher a largura máxima com o texto
        )
        Spacer(modifier = Modifier.height(50.dp)) // modificar o tamanho do espaço entre os textos
        Text( // composable de texto
            text = "${idade.value}",
            fontSize = 48.sp, // parâmetro que defini o tamanho da fonte
            fontWeight = FontWeight.Bold, // estilo negrito
            color = Color(0xFFE91E63), // parâmetro que defini a cor do texto usando o código hexadecimal
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth() // modificador para preencher a largura máxima com o texto
        )
        Spacer(modifier = Modifier.height(50.dp)) // modificar o tamanho do espaço entre o texto e a linha que contém os botões
            Row ( // composable de linha
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()){// modificador para preencher o tamanho máximo da linha
                Button( // composable de botão
                    onClick = { // método para capturar o clique do botão
                              idade.value-- // operador "--" para decrementar o número exibido na tela e método "value" para acessar o valor da variável de estado
                    },
                    modifier = Modifier.size(84.dp), // parâmetro que modifica o tamanho do botão
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE91E63)), // parâmetro que aplica cor ao botão usando o código hexadecimal
                    shape = CircleShape, // parâmetro que aplica o formato ao botão, no caso retângulo

                ){
                    Text( // composable de texto
                        text = "-",
                        fontSize = 40.sp, // parâmetro que defini o tamanho da fonte
                        fontWeight = FontWeight.Bold, // parâmetro que defini a estilização, no caso negrito
                    )
                }
                Spacer(modifier = Modifier.width(50.dp)) // modificador o tamanho do espaço entre os botões
                Button( // composable de botão
                    onClick = { // método para capturar o clique do botão
                        idade.value++ // operador para incrementar o número exibido na tela
                        Log.i("FIAP","MeuComponente: ${idade.value}")
                    },
                    modifier = Modifier.size(84.dp), // modificar o tamanho do botão
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE91E63)), // cor do botão usando o código hexadecimal
                    shape = RoundedCornerShape(8.dp), // alterar o formato do botão com os cantos arredondados, raio da curvatura de 8 dps
                ){
                    Text( // composable de texto
                        text = "+",
                        fontSize = 40.sp, // composable para tamanho da fonte
                        fontWeight = FontWeight.Bold, // estilo negrito
                    )
                }

            }
    }
    
}

@Preview (showBackground = true, showSystemUi = true)
@Composable
fun MeuComponentePreview() {
    MeuComponente()
}
