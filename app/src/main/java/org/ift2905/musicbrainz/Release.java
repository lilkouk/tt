package org.ift2905.musicbrainz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class Release extends AppCompatActivity {
    public TextView track;
    public TextView duree;
    public ListView listView;
    public ImageView imageView;
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.release);
        track= (TextView) findViewById(R.id.track);
        duree=(TextView) findViewById(R.id.duree);
        listView =(ListView ) findViewById(R.id.listView);
        imageView=(ImageView) findViewById(R.id.imageView);
        assert imageView != null;
        imageView.getDrawable();
        track.setText("Track");
        duree.setText("Duree");
        Picasso.with(getApplicationContext()).load("https://backseatmafia.files.wordpress.com/2014/09/supertramp-4ff0a439422bd-e1375570320343.jpg").into(imageView);

       adapter=new MyAdapter();
        listView.setAdapter(adapter);
    }

    public class MyAdapter extends BaseAdapter {
        LayoutInflater inflateur;
        public  MyAdapter(){
            inflateur =(LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return 20;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View v= convertView;
            if(v==null){
                v=inflateur.inflate(R.layout.vue,parent,false);

            }
            TextView titre =(TextView) v.findViewById(R.id.titre);
            TextView  temps= (TextView) v.findViewById(R.id.temps);
            titre.setText(" track " + ((Integer)position).toString());
            temps.setText("xx:xx");
            return v;

        }

    }
}
