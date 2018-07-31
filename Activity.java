package nome.do.pacote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class NomeDaActivity extends AppCompatActivity {
    private EditText caixaTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor_moedas);
        setTitle("Título da Activity");
        ConexaoJsoup conexao = new ConexaoJsoup(this); // INSTÂNCIA DA CLASSE ASYNC TASK QUE FAZ A CONEXÃO
        StringBuilder retornoConexao = conexao.doInBackground(); // RETORNO DOS MEUS text() DENTRO DAS TAGS DOS SITES PESQUISADOS
        caixaTexto = findViewById(R.id.caixaTexto);
        try {
            caixaTexto.setText(retornoConexao);
        } catch (Exception e) {
            System.out.println("Erro da Caixa de Texto: ");
            e.printStackTrace();
        }

    }
}
