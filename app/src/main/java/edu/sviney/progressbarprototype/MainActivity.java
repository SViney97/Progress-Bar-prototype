package edu.sviney.progressbarprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //example 1

    // youtube video Available at: https://www.youtube.com/watch?v=SaTx-gLLxWQ

   /*

   private ProgressBar progressBarLoading;
    private TextView loadingText;

    private int progessStatus = 0;

    private Handler Phandler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBarLoading = findViewById(R.id.proBarLoading);
        loadingText = findViewById(R.id.tvLoading);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (progessStatus <100){
                    progessStatus++;
                    android.os.SystemClock.sleep(50);
                    Phandler.post(new Runnable() {
                        @Override
                        public void run() {
                            progressBarLoading.setProgress(progessStatus);
                        }
                    });
                }
                Phandler.post(new Runnable() {
                    @Override
                    public void run() {
                        loadingText.setVisibility(View.VISIBLE);
                    }
                });
            }
        }).start();

*/
        //=====================================================================================================================================================

        //example 2
        // link at : https://stackoverflow.com/questions/19646113/android-filling-a-horizontal-progress-bar-with-user-input

    Button addToProTracker, minusFromProTacker;
    ProgressBar ProTracker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ProTracker = findViewById(R.id.proBarTracker);

        minusFromProTacker = findViewById(R.id.btnMinus);
        addToProTracker = findViewById(R.id.btnAdd);

        ProTracker.setProgress(0);
        ProTracker.setMax(100);


        addToProTracker.setOnClickListener(new View.OnClickListener() {
            EditText etNumInput;
            String InputNum;
            int PlusNumber;
            @Override
            public void onClick(View v) {

                etNumInput = findViewById(R.id.etNumberInputAdd);
                InputNum = etNumInput.getText().toString();
                PlusNumber = Integer.parseInt(InputNum);

                ProTracker.incrementProgressBy(PlusNumber);
            }
        });

        minusFromProTacker.setOnClickListener(new View.OnClickListener() {

            EditText etNumInput;
            String InputNum;
            int MinusNumber;
            @Override
            public void onClick(View v) {

                etNumInput = findViewById(R.id.etNumberInputMinus);

                InputNum = etNumInput.getText().toString();
                MinusNumber = Integer.parseInt(InputNum);

                ProTracker.incrementProgressBy(- MinusNumber);

            }
        });

    }
}