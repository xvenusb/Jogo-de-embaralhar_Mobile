import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Collections;


public class MainActivity extends AppCompatActivity {
    private Button buttonEmbaralhar;
    private Button buttonResetar;
    private TextView textView;
    private ArrayList<String> list;
    private int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEmbaralhar = findViewById(R.id.buttonEmbaralhar);
        buttonResetar = findViewById(R.id.buttonResetar);
        textView = findViewById(R.id.textView);

        list = new ArrayList<>();
        list.add("MARIA CLARA FERREIRA MENDES");

        index = list.size() - 1;

        textView.setText(list.get(index));

        buttonEmbaralhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Collections.shuffle(list);
                textView.setText(list.get(index));
            }
        });

        buttonResetar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.clear();
                list.add("MARIA CLARA FERREIRA MENDES");
                textView.setText(list.get(index));
            }
        });
    }
}