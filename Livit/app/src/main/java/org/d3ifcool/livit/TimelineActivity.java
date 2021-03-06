package org.d3ifcool.livit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class TimelineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        UserSummary userSummary = new UserSummary("Novia Robynson", "noviarinanti97@gmail.com", "300 m", "42 Kmph", "2800 cal");
        TextView nameTextView = (TextView) findViewById(R.id.name_profile);
        nameTextView.setText(userSummary.getName());
        TextView emailTextView = (TextView) findViewById(R.id.email_profile);
        emailTextView.setText(userSummary.getEmail());
        TextView trackTextView = (TextView) findViewById(R.id.track_profile);
        trackTextView.setText(userSummary.getTrack());
        TextView avgSpeedTextView = (TextView) findViewById(R.id.avg_speed);
        avgSpeedTextView.setText(userSummary.getAvgSpeed());
        TextView caloriBurnedTextView = (TextView) findViewById(R.id.calori_burned_profile);
        caloriBurnedTextView.setText(userSummary.getCaloriBurned());

        ArrayList<Log> data = new ArrayList<>();
        data.add(new Log("09.00", "Breakfast with bread"));
        data.add(new Log("16.00", "Run"));
        data.add(new Log("21.00", "Sleep"));
        data.add(new Log("09.00", "Breakfast with bread"));
        data.add(new Log("16.00", "Run"));
        data.add(new Log("21.00", "Sleep"));
        data.add(new Log("09.00", "Breakfast with bread"));
        data.add(new Log("16.00", "Run"));
        data.add(new Log("21.00", "Sleep"));
        data.add(new Log("09.00", "Breakfast with bread"));
        data.add(new Log("16.00", "Run"));
        data.add(new Log("21.00", "Sleep"));
        data.add(new Log("09.00", "Breakfast with bread"));
        data.add(new Log("16.00", "Run"));
        data.add(new Log("21.00", "Sleep"));

        ListView listView = (ListView) findViewById(R.id.log_listview);
        listView.setAdapter(new LogAdapter(this, data));
    }
}
