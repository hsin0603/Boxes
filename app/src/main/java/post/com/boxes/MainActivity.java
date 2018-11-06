package post.com.boxes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText length;
    private EditText width;
    private EditText height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findviews();
    }

    private void findviews() {
        length = findViewById(R.id.ed_length);
        width = findViewById(R.id.ed_width);
        height = findViewById(R.id.ed_height);
    }
    public void check(View view){
        float l = Float.parseFloat(length.getText().toString());
        float w = Float.parseFloat(width.getText().toString());
        float h = Float.parseFloat(height.getText().toString());
        if (l <= 23 && w <= 14 && h <= 13) {
            Intent intent = new Intent(this, B3Activity.class);
            intent.putExtra("l", l);
            intent.putExtra("w", w);
            intent.putExtra("h", h);
            startActivity(intent);
        }else{
            Intent intent = new Intent(this, B5Activity.class);
            intent.putExtra("l", l);
            intent.putExtra("w", w);
            intent.putExtra("h", h);
            startActivity(intent);

        }
    }
}
