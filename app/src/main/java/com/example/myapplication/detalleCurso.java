package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class detalleCurso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_curso);
        /* showSelectedFragment(new calificar());
        BottomNavigationView q;
        q = (BottomNavigationView) findViewById(R.id.barra1p);
        q.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener()  {
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

            if (menuItem.getItemId() == R.id.btnTalleres) {
                showSelectedFragment(new calificar());
            } else if (menuItem.getItemId() == R.id.btnAsistencias) {
                showSelectedFragment(new llamar_lista());
            } else if (menuItem.getItemId() == R.id.btnNuevaEntrega) {
                showSelectedFragment(new crearEntrega());
            } else if (menuItem.getItemId() == R.id.btnCalendario) {
                showSelectedFragment(new calendario());
            }
            return true;
        }


                }); */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu1p, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.btnNoticias) {
                Intent per = new Intent(this, Noticias.class);
                startActivity(per);


        }else if(id == R.id.btnUserConfig){
                Intent per = new Intent(this, PerfilProfe.class);
                startActivity(per);

        }
        return super.onOptionsItemSelected(item);
    }


    private void showSelectedFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();
    }

}
