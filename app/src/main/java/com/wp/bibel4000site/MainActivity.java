package com.wp.bibel4000site;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.webkit.WebChromeClient;
        import android.webkit.WebSettings;
        import android.webkit.WebView;
        import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webb =(WebView)findViewById(R.id.web1);
        webb.setWebViewClient(new WebViewClient());
        webb.loadUrl("https://bibel4000site.wordpress.com");


        WebSettings webSettings = webb.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webb.setWebChromeClient(new WebChromeClient());


    }
}