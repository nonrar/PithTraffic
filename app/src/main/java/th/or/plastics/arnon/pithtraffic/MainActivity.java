package th.or.plastics.arnon.pithtraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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



    } // Main Method

    private void bindWidget() {

        aboutMeButton = (Button) findViewById(R.id.button);
        trafficListView = (ListView) findViewById(R.id.listView);


    }

} // Main Class


