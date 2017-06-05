package wakeel.android.com.insertdisplaydata;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class DataListActivity extends AppCompatActivity {
    ListView listView;
    SQLiteDatabase sqLiteDatabase;
    UserDbHelper userDbHelper;
    Cursor cursor;
    ListDataAdapter listDataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_list_layout);
        listView = (ListView)findViewById(R.id.list_view);
        listDataAdapter = new ListDataAdapter(getApplicationContext(),R.layout.row_layout);
        listView.setAdapter(listDataAdapter);
        userDbHelper = new UserDbHelper(getApplicationContext());
        sqLiteDatabase = userDbHelper.getReadableDatabase();
        cursor = userDbHelper.getInformations(sqLiteDatabase);
        if(cursor.moveToFirst())
        {
            do {

                String name,mob,email;
                name = cursor.getString(0);
                mob = cursor.getString(1);
                email = cursor.getString(2);
                DataProvider dataProvider = new DataProvider(name,mob,email);
                //This line pass each row of data in the form of data provider object into the Adapter
                listDataAdapter.add(dataProvider);


            }while (cursor.moveToNext());
        }
        listView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });

    }
}
