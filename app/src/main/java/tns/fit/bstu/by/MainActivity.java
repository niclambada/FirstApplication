package tns.fit.bstu.by;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

import tns.fit.bstu.by.text.TextFunction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < 10; i++) {
            Log.d("MainActivity", " counter =" + i);

        }
        extracted();
    }

    private void extracted() {
        TextFunction tf = new TextFunction();
        TextView nt = findViewById(R.id.newtest);
        nt.setText(tf.getValue());
    }
}