package post.com.boxes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class B5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b5);
        TextView result = findViewById(R.id.result);
        float l = getIntent().getFloatExtra("l",0);
        float w = getIntent().getFloatExtra("w",0);
        float h = getIntent().getFloatExtra("h",0);
        result.setText("Dimension:" + l + "/" + w + "/" + h);
    }
}
