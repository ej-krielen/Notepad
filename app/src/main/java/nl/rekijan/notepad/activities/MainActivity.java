package nl.rekijan.notepad.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import nl.rekijan.notepad.R;
import nl.rekijan.notepad.data.DatabaseHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHelper databaseHelper = new DatabaseHelper(this);
        databaseHelper.getWritableDatabase();
    }
}
