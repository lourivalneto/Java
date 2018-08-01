package nome.do.pacote;

import android.app.Activity;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class ConexaoThread extends Thread {
    private StringBuilder retornoConexao;
    private ConversorMoedas activity;
    ConexaoThread(ConversorMoedas activity) {
        this.activity = activity;
        start();
    }

    @Override
    public void run() {
        super.run();
        this.retornoConexao = new StringBuilder();

        try {
            Document melhorcambio = Jsoup.connect("https://www.melhorcambio.com/dolar-hoje").get();
//            Document consulado = Jsoup.connect("http://capetown.itamaraty.gov.br/pt-br/")
//                    .get();
//            Elements body = consulado.getElementsByTag("body");
            //Elements dolarEmReal = melhorcambio.select("input");
            Elements dolarEmReal = melhorcambio.select("#comercial");

            Document googleCambio = Jsoup.connect("https://www.google.com/search?q=d%C3%B3lar+turismo+hoje&ie=utf-8&oe=utf-8&client=firefox-b-ab").get();
            Elements tdGoogleCambios = googleCambio.select("tr.td");
            //retornoConexao.append(tdGoogleCambios.text()); // Quase certo que pega só os textos
            // dentro das tags td
            retornoConexao.append(dolarEmReal.val()); // Quase certo que pega só os textos
        } catch (Exception e) {
            System.out.println("Segue erro abaixo: ");
            e.printStackTrace();
        }
        this.retornoConexao = retornoConexao;
//        this.activity.caixaTexto.setText(retornoConexao);
        this.activity.receberStringBuilder(this.retornoConexao);
    }
}
