package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    Button mbuttonTop,mbuttonBottom;
    TextView mstoryTextView;
    int mStoryIndex=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mstoryTextView=(TextView)findViewById(R.id.storyTextView);
        mbuttonTop=(Button)findViewById(R.id.buttonTop);
        mbuttonBottom=(Button)findViewById(R.id.buttonBottom);







        mbuttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex==1 || mStoryIndex==3) {
                    mstoryTextView.setText(R.string.T3_Story);
                    mbuttonTop.setText(R.string.T3_Ans1);
                    mbuttonBottom.setText(R.string.T3_Ans2);
                    mStoryIndex=2;
                }
                else if(mStoryIndex==2)
                {
                    mstoryTextView.setText(R.string.T6_End);
                    mbuttonTop.setVisibility(View.GONE);
                    mbuttonBottom.setVisibility(View.GONE);
                }
                /*else if(mStoryIndex==3)
                {
                    storyTextView.setText(R.string.T3_Story);
                    buttonTop.setText(R.string.T3_Ans1);
                    buttonBottom.setText(R.string.T3_Ans2);
                    mStoryIndex=2;
                }
*/
            }
        });


        mbuttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mStoryIndex==1) {
                    mstoryTextView.setText(R.string.T2_Story);
                    mbuttonTop.setText(R.string.T2_Ans1);
                    mbuttonBottom.setText(R.string.T2_Ans2);
                    mStoryIndex=3;
                }
                else if(mStoryIndex==2)
                {
                    mstoryTextView.setText(R.string.T5_End);
                   mbuttonTop.setVisibility(View.GONE);
                    mbuttonBottom.setVisibility(View.GONE);
                }
                else if(mStoryIndex==3)
                {
                    mstoryTextView.setText(R.string.T4_End);
                    mbuttonTop.setVisibility(View.GONE);
                    mbuttonBottom.setVisibility(View.GONE);
                }
            }
        });








    }
}
