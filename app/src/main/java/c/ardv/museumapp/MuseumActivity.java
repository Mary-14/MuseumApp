package c.ardv.museumapp;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by arov on 16.04.2018.
 */

public class MuseumActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);


        Museum museum = (Museum) getIntent().getSerializableExtra("Museum");
        getSupportActionBar().setTitle(museum.title);
    }
}
