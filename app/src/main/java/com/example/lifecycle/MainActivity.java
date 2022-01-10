package com.example.lifecycle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast t= Toast.makeText(MainActivity.this,"ON CREATE",Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast t= Toast.makeText(MainActivity.this,"ON START",Toast.LENGTH_SHORT);
              t.setGravity(Gravity.TOP,0,0);
              t.show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this,"ON RESUME",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this, "ON PAUSE", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this,"ON STOP",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(MainActivity.this,"ON RESTART",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this,"ON DESTROY",Toast.LENGTH_SHORT).show();
    }
}

