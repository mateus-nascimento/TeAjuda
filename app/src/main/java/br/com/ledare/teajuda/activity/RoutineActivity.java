package br.com.ledare.teajuda.activity;

import android.os.Bundle;
import android.view.View;

import br.com.ledare.teajuda.R;

public class RoutineActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine);

        setupToolbar(getString(R.string.activity_routine));

        findViewById(R.id.floating).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.floating:
                snackShort(view, "Nova Rotina em Jogo");
                break;
        }
    }
}
