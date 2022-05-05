package br.com.etecia.mypets;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        cardView = findViewById(R.id.idCardView);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Cliquei no cardView",
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_pets, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.icCadastrar:
                Toast.makeText(
                        getApplicationContext(),
                        "Cadastrado com sucesso!!!",
                        Toast.LENGTH_LONG
                ).show();
                break;
            case R.id.icAlterar:
                Toast.makeText(
                        getApplicationContext(),
                        "Alterado com sucesso!!!",
                        Toast.LENGTH_LONG
                ).show();
                break;
            case R.id.icExcluir:
                Toast.makeText(
                        getApplicationContext(),
                        "Excluido com sucesso!!!",
                        Toast.LENGTH_LONG
                ).show();
                break;
            case R.id.icPesquisar:
                Toast.makeText(
                        getApplicationContext(),
                        "Pesquisado com sucesso!!!",
                        Toast.LENGTH_LONG
                ).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }


}