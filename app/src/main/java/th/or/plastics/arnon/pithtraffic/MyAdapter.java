package th.or.plastics.arnon.pithtraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Admin on 11/19/2015.
 */
public class MyAdapter extends BaseAdapter{

    //Explicit
    // context คือ การต่อท่อ ถ่ายเทข้อมูลระหว่างกัน
    private Context objContext;
    private int[] iconInts;
    private String[] titleStrings;

    //สร้าง constructor


    public MyAdapter(Context objContext, int[] iconInts, String[] titleStrings) {
        this.objContext = objContext;
        this.iconInts = iconInts;
        this.titleStrings = titleStrings;
    }//Constructor

    @Override
    public int getCount() {
        return titleStrings.length;
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

        //Open service อนุญาติโยนค่าไป xml

        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView1 = objLayoutInflater.inflate(R.layout.traffic_listview, parent, false);

        //Setup Icon
        ImageView iconImageView = (ImageView) objView1.findViewById(R.id.imvIcon);
        iconImageView.setImageResource(iconInts[position]);

        //setup Title
        TextView titleTextView = (TextView) objView1.findViewById(R.id.txtShowTitle);
        titleTextView.setText(titleStrings[position]);





        return objView1;
    }
}//Main Class
