package isetb.tp3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView List;


    String [] nom={"Mohamed Salah","Lionel Messi","Cristiano Ronaldo","Kylian Mbappé","Paul pogba","Neymar","Antoine Griezmann","Youssef Msakni"};
    String [] equipe={"Liverpool","Barcelone","Juventus","Paris saint-germain","Manchester united","Brazil","Barcelone","Tunis"};
    Integer [] portrait={R.drawable.meds,R.drawable.messi,R.drawable.cristiano,R.drawable.mbappe,R.drawable.pogba,R.drawable.neymar,R.drawable.griezmann,R.drawable.msekni};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List=findViewById(R.id.l);



        PlayerListAdapter adapter=new PlayerListAdapter(this,portrait,nom,equipe);
        List.setAdapter(adapter);





        List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                AlertDialog.Builder a=new AlertDialog.Builder(MainActivity.this);
                a.setTitle("JOUYEUR PRéféré");
              a.setIcon(portrait[i]);
                a.setMessage(nom[i]+".........<>"+equipe[i]);
                a.setPositiveButton("ok",null);
                a.show();

            }
        });

    }
}
