package br.com.ledare.teajuda.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import br.com.ledare.teajuda.R;

public class TaskActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        setupToolbar(getString(R.string.activity_task));

        findViewById(R.id.floating).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.floating:
                startActivity(new Intent(TaskActivity.this, NewTaskActivity.class));
                break;
        }
    }
}
