package th.or.plastics.arnon.pithtraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // Explicit ทำการประกาศตัวแปล
    // public ใช้นอก class ได่้
    // private ใช้ภายใน class เท่านั้น

    private Button aboutMeButton;
    private ListView trafficListView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //Statement จะจบด้วย ;
        setContentView(R.layout.activity_main);

        //Bind Widget

        //การตั้งชื่อ method อักษรตัวแรกควรเป็นตัวเล็ก
        bindWidget();
        //Button Controller

        buttonController();



    } // Main Method


    //private void << ทำงานแล้วไม่ return ค่ากลับ
    private void buttonController() {
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // sound Effect
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sheep);
                buttonMediaPlayer.start();

                //intent to webview เปิด browser defualt มา
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/AFmWqLIqDZA"));
                startActivity(objIntent);


            } // event
        });

    }

    private void bindWidget() {

        aboutMeButton = (Button) findViewById(R.id.button);
        trafficListView = (ListView) findViewById(R.id.listView);


    }

} // Main Class


