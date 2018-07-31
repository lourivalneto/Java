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
        setContentView(R.layout.nome_da_activity);
        setTitle("Título da Activity");
        caixaTexto = findViewById(R.id.caixaTexto);
        ConexaoJsoup conexao = new ConexaoJsoup(this);

    }
}
