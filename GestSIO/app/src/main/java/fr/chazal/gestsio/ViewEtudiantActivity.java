package fr.chazal.gestsio;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ViewEtudiantActivity extends AppCompatActivity {

    TextView aDdn;
    TextView prenom;
    TextView date;
    TextView code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_etudiant);

        aDdn = (TextView)findViewById(R.id.aDdn);
        prenom= (TextView)findViewById(R.id.prenom);
        date = (TextView)findViewById(R.id.date);
        code= (TextView)findViewById(R.id.code);
    }

    @Override
    protected void onResume() {
        super.onResume();

        aDdn.setText(".......");
        prenom.setText("Phillipe");
        date.setText("30/11/2001");
        code.setText("97400");
    }
}
