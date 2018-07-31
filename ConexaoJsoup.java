package nome.do.pacote;

import android.os.AsyncTask;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.lang.ref.WeakReference;

public class ConexaoJsoup extends AsyncTask<String,Integer,StringBuilder> {
    //private WeakReference<ConversorMoedas> activity;
    private ConversorMoedas conversorActivity;
    private StringBuilder retornoConexao;

    public ConexaoJsoup(ConversorMoedas conversorMoedas) {
        this.conversorActivity = conversorMoedas;
    }

    @Override
    protected StringBuilder doInBackground(String... strings) {
        this.retornoConexao = new StringBuilder();
        try {
//            Document melhorcambio = Jsoup.connect("https://www.melhorcambio.com/dolar-hoje").get();
//            Elements dolarEmReal = melhorcambio.select("input#taxa-comercial");

            Document googleCambio = Jsoup.connect("https://www.google.com/search?q=d%C3%B3lar+turismo+hoje&ie=utf-8&oe=utf-8&client=firefox-b-ab").get();
            Elements tdGoogleCambios = googleCambio.select("tr.td");
            //retornoConexao.append(tdGoogleCambios.text()); // Quase certo que pega só os textos
            // dentro das tags td
            retornoConexao.append(tdGoogleCambios.text()); // Quase certo que pega só os textos
        } catch (Exception e) {
            System.out.println("Segue erro abaixo: ");
            e.printStackTrace();
        }
        this.retornoConexao = retornoConexao;
        return retornoConexao;
    }

    @Override
    protected void onPostExecute(StringBuilder stringBuilder) {
        //conversorActivity.setRetornoConexao(this.retornoConexao);
        conversorActivity.caixaTexto.setText(stringBuilder);
        super.onPostExecute(stringBuilder);

    }
}
