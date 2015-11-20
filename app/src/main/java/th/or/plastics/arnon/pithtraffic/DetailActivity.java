package th.or.plastics.arnon.pithtraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    private TextView titleTextView, detailTextView;
    private ImageView trafficImageView;









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        bindWidget();

        // show view
        showView();

    } // Main Method

    private void showView() {

        //Show Title
        String strTitle = getIntent().getStringExtra("Title");
        titleTextView.setText(strTitle);

        //Show Image
        int intImaage = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        trafficImageView.setImageResource(intImaage);

        //show detail จาก xml > detail.xml
        // intindex คือ ตำแหน่งแรก ของ array
        int intIndex = getIntent().getIntExtra("Index", 0);
        String[] strDetail = getResources().getStringArray(R.array.detail);
        detailTextView.setText(strDetail[intIndex]);


    }

    private void bindWidget() {
        titleTextView = (TextView) findViewById(R.id.txtDetailTitle);
        trafficImageView = (ImageView) findViewById(R.id.imvDetailImage);
        detailTextView = (TextView) findViewById(R.id.txtDetail);

    }


} // Main Class
