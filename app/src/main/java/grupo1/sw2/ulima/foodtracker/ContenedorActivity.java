package grupo1.sw2.ulima.foodtracker;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import butterknife.Bind;
import grupo1.sw2.ulima.foodtracker.fragments.BuscarFragment;
import grupo1.sw2.ulima.foodtracker.fragments.CuponesFragment;
import grupo1.sw2.ulima.foodtracker.fragments.RankingFragment;

public class ContenedorActivity extends AppCompatActivity implements View.OnClickListener{

    @Bind(R.id.toolbar)Toolbar toolbar;
    @Bind(R.id.claContenedor)CoordinatorLayout claContenedor;
    @Bind(R.id.iviCupones)ImageView iviCupones;
    @Bind(R.id.iviBuscar)ImageView iviBuscar;
    @Bind(R.id.iviRanking)ImageView iviRanking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor);

        //setSupportActionBar(toolbar);

        Fragment buscarFragment = BuscarFragment.newInstance();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.flaContenido, buscarFragment);
        ft.commit();

        //iviCupones.setOnClickListener(this);
        //iviBuscar.setOnClickListener(this);
        //iviRanking.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        switch (v.getId()){
            case R.id.iviRanking:
                Fragment rankingFragment = RankingFragment.newInstance();
                ft.replace(R.id.flaContenido, rankingFragment);
                ft.commit();
            case R.id.iviBuscar:
                Fragment buscarFragment = BuscarFragment.newInstance();
                ft.replace(R.id.flaContenido, buscarFragment);
                ft.commit();
            case R.id.iviCupones:
                Fragment cuponesFragment = CuponesFragment.newInstance();
                ft.replace(R.id.flaContenido, cuponesFragment);
                ft.commit();
        }

    }
}
