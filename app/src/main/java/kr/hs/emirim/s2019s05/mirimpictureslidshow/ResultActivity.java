package kr.hs.emirim.s2019s05.mirimpictureslidshow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        setTitle("투표 결과");
        Intent intent = getIntent();
        int[] voteCount = intent.getIntArrayExtra("voteCount");
        int[] imgFileNames = {R.drawable.r01,R.drawable.r02, R.drawable.r03,R.drawable.r04,R.drawable.r05, R.drawable.r06,R.drawable.r07,R.drawable.r08,R.drawable.r09 };
        String[] imgNames = intent.getStringArrayExtra("imgNames");
        TextView[] textVs = new TextView[imgNames.length];
        RatingBar[] ratingBars = new RatingBar[imgNames.length];

        for(int i=0; i<voteCount.length; i++){
           // for(int j=i+)
        }
    }
}