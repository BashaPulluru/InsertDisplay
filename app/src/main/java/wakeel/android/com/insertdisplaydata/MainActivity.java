package wakeel.android.com.insertdisplaydata;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnMove;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMove = (Button)findViewById(R.id.btnMove);
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,NewContactActivity.class);
                startActivity(intent);
            }
        });
    }

    public void viewContact(View view)
    {

        Intent intent = new Intent(MainActivity.this,DataListActivity.class);
        startActivity(intent);

    }


}

