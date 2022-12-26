package isetb.tp3;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class PlayerListAdapter extends ArrayAdapter {
    Activity context ;
    Integer [] portrait;
    String [] nom;
    String [] equipe;

    public PlayerListAdapter(  Activity context, Integer[] portrait, String[] nom, String[] equipe) {
        super(context , R.layout.element,nom);
        this.context = context;
        this.portrait = portrait;
        this.nom = nom;
        this.equipe = equipe;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View view=layoutInflater.inflate(R.layout.element ,null,true);
        ImageView img=view.findViewById(R.id.image);
        TextView t1=view.findViewById(R.id.nom);
        TextView t2=view.findViewById(R.id.description);
        img.setImageResource(portrait[position]);
        t1.setText(nom[position]);
        t2.setText(equipe[position]);
        return view;

    }
}



