package spcgroup.damrong.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by damrong.da on 12/06/2015.
 */
public class MyAdapter extends BaseAdapter{
    //Explicit
    private Context objContext;
    private String[] titleStrings, detailStrings;
    private int[] iconInts;

    public MyAdapter(Context objContext, String[] titleStrings, String[] detailStrings, int[] iconInts) {
        this.objContext = objContext;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
        this.iconInts = iconInts;
    } // Constructor

    @Override
    public int getCount() {
        return titleStrings.length;
    } //ใช้ในการนับจำนวนข้อมูลที่ใช้แสดง เช่นมีข้อมูล 20 แถว

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

        //Open Service
        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE); // คือการนำเอา Context มาไว้ที่ LayoutInflater (Layout เสมือน) ก่อนเอาไปไว้ที่ Layout จริง
        View view = objLayoutInflater.inflate(R.layout.my_listview, parent, false);

        //Setup TextView
        TextView titleTextView = (TextView) view.findViewById(R.id.textView2);
        titleTextView.setText(titleStrings[position]);

        TextView detailTextView = (TextView) view.findViewById(R.id.textView3);
        detailTextView.setText(detailStrings[position]);

        //Setup Image
        ImageView iconImageView = (ImageView) view.findViewById(R.id.imageView);
        iconImageView.setImageResource(iconInts[position]);

        return view;
    }
} // Main Class
