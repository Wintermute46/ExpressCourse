package m2a.com.expresscourse;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEdit = (EditText)findViewById(R.id.editText2);
    }

    public void onClick(View view) {
        for (int i = 9; i > -1; i--) {
            mEdit.append("\nУ кошки осталось жизней: " + i);
        }


    }


}
