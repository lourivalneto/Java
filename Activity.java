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
    EditText caixaTexto;
    private StringBuilder retornoConexao;
    private Handler handler = new Handler();
    ConexaoThread conexaoT;

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        verificarTerminoConexao();

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nome_da_activity);
        setTitle("Título da Activity");
        caixaTexto = findViewById(R.id.caixaTexto);
        //        ConexaoJsoup conexao = new ConexaoJsoup(this);
//        conexao.doInBackground();
        conexaoT = new ConexaoThread(this);
    }

    void receberStringBuilder(StringBuilder retorno) {
        this.retornoConexao = retorno;

    }

    private void verificarTerminoConexao() {
        if (conexaoT.isAlive()) {
            verificarTerminoConexao();
        } else {
            if (retornoConexao != null) {
                caixaTexto.setText(retornoConexao);
            } else {
                caixaTexto.setText("Não foi possível estabelecer conexão com o servidor.");
            }
        }
    }


}


    }
}
