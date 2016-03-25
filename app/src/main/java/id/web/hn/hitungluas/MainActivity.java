package id.web.hn.hitungluas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtPanjang, edtLebar;
    private Button btnHitung;
    private TextView txtLuas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Hitung Luas Persegi Panjang");

        edtLebar = (EditText) findViewById(R.id.edt_lebar);
        edtPanjang = (EditText) findViewById(R.id.edt_panjang);
        btnHitung = (Button) findViewById(R.id.btn_hitung);
        txtLuas = (TextView) findViewById(R.id.txt_luas);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String panjang = "";
                panjang = edtPanjang.getText().toString().trim();
                String lebar = "";
                lebar = edtLebar.getText().toString().trim();
                if(!panjang.equals("") && !lebar.equals("") && !panjang.equals(".") && !panjang.equals(".")){
                    Double p = Double.parseDouble(panjang);
                    Double l = Double.parseDouble(lebar);

                    Double luas = p * l;

                    txtLuas.setText("Luas: "+luas);

                }else {
                    Toast.makeText(MainActivity.this, "Panjang dan luas harus diisi!", Toast.LENGTH_LONG ).show();
                    txtLuas.setText("");
                }
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
