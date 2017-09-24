package rowser.tjc.dk.rowser;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText url;
    WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.statusTekst);
        webView = (WebView) findViewById(R.id.rowserView);
        webView.setWebViewClient(new WebViewClient());
        url = (EditText) findViewById(R.id.urlInput);
    }

    public void showVejledning(View view) {
        textView.setText("Forklaring foelger");
    }

    public void showIndstillinger(View view) {
        textView.setText("Indstillinger\nTekststoerrelse\nJonastilstand");
    }
    public void goBotton(View view) {
        webView.loadUrl(url.getText().toString());
    }
}
