package jrl.deint.deportesfavoritos;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import jrl.deint.deportesfavoritos.Adapter.SportsAdapter;
import jrl.deint.deportesfavoritos.Modelo.Repository;

public class DeportesFavoritosActivity extends AppCompatActivity {

    TextView txvMessage;
    Button btnOk;
    ListView lsvSports;
    Repository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deportes_favoritos);

        repository = new Repository();
        txvMessage = (TextView)findViewById(R.id.txvMessage);
        btnOk = (Button)findViewById(R.id.btnOk);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        lsvSports = (ListView)findViewById(R.id.lsvSports);
        SportsAdapter adapter = new SportsAdapter(DeportesFavoritosActivity.this, R.layout.item_sport);
        lsvSports.setAdapter(adapter);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

    }
}
