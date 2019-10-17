package com.example.secondroughwork;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public void generateTable(int  timestable)
    {
        final ArrayList<String> content=new ArrayList<String>();
        for(int i=1;i<=10;i++)
        {
            content.add(Integer.toString(i*timestable));
        }

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,content);
        list.setAdapter(arrayAdapter);
    }
SeekBar seek;
ListView list;
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seek=findViewById(R.id.seek);
list=findViewById(R.id.list);
seek.setMax(20);
seek.setProgress(1);
seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
    @Override

    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
int timestable;
        int min = 1;
if(i<1)
{
    timestable=min;
    seek.setProgress(min);

}
else
    timestable=i;
       generateTable(timestable);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
});

    }
}