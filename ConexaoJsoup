package nome.do.pacote;

import android.os.AsyncTask;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.lang.ref.WeakReference;

public class ConexaoJsoup extends AsyncTask<String,Integer,StringBuilder> {
    private WeakReference<NomeDaActivity> activity;

    public ConexaoJsoup(NomeDaActivity activity) {
        this.activity = new WeakReference<>(activity);
    }

    @Override
    protected StringBuilder doInBackground(String... strings) {
        StringBuilder retornoConexao = new StringBuilder();
        try {
            Document melhorcambio = Jsoup.connect("https://www.melhorcambio.com/dolar-hoje").get();
            Elements dolarEmReal = melhorcambio.select("input#comercial");

            Document googleCambio = Jsoup.connect("https://www.google.com/search?q=d%C3%B3lar+turismo+hoje&ie=utf-8&oe=utf-8&client=firefox-b-ab").get();
            Elements tdGoogleCambios = googleCambio.select("tr.td");
            retornoConexao.append(tdGoogleCambios.text()); // Quase certo que pega só os textos
            // dentro das tags td
//            for(int i = 0; i < tdGoogleCambios.size(); i++) {
//
//            }
        } catch (Exception e) {
            System.out.println("Segue erro abaixo: ");
            e.printStackTrace();
        }
        return retornoConexao;
    }
}
