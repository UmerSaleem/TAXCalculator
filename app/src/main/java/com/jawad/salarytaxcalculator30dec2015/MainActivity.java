            /*Salary and TAX Calculator 2015-2016 Pakistan */
/*
Income Tax Slabs - Financial Year 2015-2016 Pakistan

Taxable Income (Rs.)

From

To

Fixed Amount Addition

Rate of Tax %

Up to 400,000	 	 	0.00%
400,001	500,000	-	2% of the amount exceeding Rs. 400,000
500,001	750,000	Rs. 2,000 +	5% of the amount exceeding Rs. 500,000
750,001	1,400,000	Rs. 14,500 +	10% of the amount exceeding Rs. 750,000
1,400,001	1,500,000	Rs. 79,500 +	12.5% of the amount exceeding Rs. 1,400,000
1,500,001	1,800,000	Rs.92,000 +	15% of the amount exceeding Rs. 1,500,000
1,800,001	2,500,000	Rs. 137,000 +	17.5% of the amount exceeding Rs. 1,800,000
2,500,001	3,000,000	Rs. 259,500 +	20% of the amount exceeding Rs. 2,500,000
3,000,001	3,500,000	Rs. 359,500 +	22.5% of the amount exceeding Rs. 3,000,000
3,500,001	4,000,000	Rs. 472,000 +	25% of the amount exceeding Rs. 3,500,000
4,000,001	7,000,000	Rs. 597,000 +	27.5% of the amount exceeding Rs. 4,000,000
Above 7,000,000	 	Rs. 1,422,000 +	30% of the amount exceeding Rs. 7,000,000

*/

package com.jawad.salarytaxcalculator30dec2015;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loadNewActivity = (Button) findViewById(R.id.TAXSlabbutton);
        //final Button miscbutton = (Button) findViewById(R.id.editText2);
        loadNewActivity.setOnClickListener(new View.OnClickListener()

           {

            @Override
            public void onClick(View view) {

          //      if( miscbutton.getText() == "0" )
            //        miscbutton.setText("");

                Intent intent = new Intent(MainActivity.this, TAXActivity.class);
//                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent);
                                            }
           }


        );

    }

//this is test msg



    /*
    EditText firstNumber = (EditText)findViewById(R.id.editText);
    if( firstNumber.getText().toString().length() == 0 )
            firstNumber.setError( "First name is required!" );


    EditText secondNumber = (EditText)findViewById(R.id.editText2);
    if( secondNumber.getText().toString().length() == 0 )
            secondNumber.setError( "First name is required!" );
*/

/*public void onMonSalaryButtonClick(View view)
    {
        ((EditText) findViewById(R.id.editText)).setText("");
    }
*/
    public void OnButtonClick(View v) {
        EditText MonthSALNumber = (EditText) findViewById(R.id.editText);
        EditText MISCSALNumber = (EditText) findViewById(R.id.editText2);
        TextView results = (TextView) findViewById(R.id.textView5);
        TextView results1 = (TextView) findViewById(R.id.textView7);
        TextView results2 = (TextView) findViewById(R.id.textView9);


        MonthSALNumber = (EditText) findViewById(R.id.editText);
        if( MonthSALNumber.getText().toString().length() == 0 )
            MonthSALNumber.setText("0");

        MISCSALNumber = (EditText) findViewById(R.id.editText2);
        if( MISCSALNumber.getText().toString().length() == 0 )
            MISCSALNumber.setText("0");

/*
          if (MonthSALNumber.getText().toString().length() == 0) {
            if (MISCSALNumber.getText().toString().length() == 0) {
                MonthSALNumber.setError("Please Enter  Monthly and MISC salary!");
            }
        }
        if (MonthSALNumber.getText().toString().length() != 0) {
            if (MISCSALNumber.getText().toString().length() == 0) {
                MISCSALNumber.setError("Please Enter MISC amount!");
            }
        }
        if (MonthSALNumber.getText().toString().length() == 0) {
            if (MISCSALNumber.getText().toString().length() != 0) {
                MonthSALNumber.setError("Please Enter MOnthly Salary!");
            }

        }

*/
        int num1 = Integer.parseInt(MonthSALNumber.getText().toString());
        int num2 = Integer.parseInt(MISCSALNumber.getText().toString());


        int AnnualSAL = (num1 * 12) + num2;

        int AnnualTax = AnnualSAL;
        //int MonthlyTAX = AnnualTax/12;

        results.setText(Integer.toString(AnnualSAL));

        //results2.setText(Integer.toString(AnnualTax));

        if (AnnualSAL <= 400000) {
            AnnualTax = 0;

            results1.setText(Integer.toString(AnnualTax));
            int MonthlyTAX = AnnualTax / 12;
            results2.setText(Integer.toString(MonthlyTAX));
        } else if (AnnualSAL > 400000 & AnnualSAL <= 500000) {
            AnnualTax = (int) (((AnnualSAL - 400000)) * 0.02);
            results1.setText(Integer.toString(AnnualTax));
            int MonthlyTAX = AnnualTax / 12;
            results2.setText(Integer.toString(MonthlyTAX));
        } else if (AnnualSAL > 500000 & AnnualSAL <= 750000) {
            AnnualTax = (int) (((AnnualSAL - 500000)) * 0.05) + 2000;
            results1.setText(Integer.toString(AnnualTax));
            int MonthlyTAX = AnnualTax / 12;
            results2.setText(Integer.toString(MonthlyTAX));
        } else if (AnnualSAL > 750000 & AnnualSAL <= 1400000) {
            AnnualTax = (int) (((AnnualSAL - 750000)) * 0.10) + 14500;
            results1.setText(Integer.toString(AnnualTax));
            int MonthlyTAX = AnnualTax / 12;
            results2.setText(Integer.toString(MonthlyTAX));
        } else if (AnnualSAL > 1400000 & AnnualSAL <= 1500000) {
            AnnualTax = (int) (((AnnualSAL - 1400000)) * 0.125) + 79500;
            results1.setText(Integer.toString(AnnualTax));
            int MonthlyTAX = AnnualTax / 12;
            results2.setText(Integer.toString(MonthlyTAX));
        } else if (AnnualSAL > 1500000 & AnnualSAL <= 1800000) {
            AnnualTax = (int) (((AnnualSAL - 1500000)) * 0.15) + 92000;
            results1.setText(Integer.toString(AnnualTax));
            int MonthlyTAX = AnnualTax / 12;
            results2.setText(Integer.toString(MonthlyTAX));
        } else if (AnnualSAL > 1800000 & AnnualSAL <= 2500000) {
            AnnualTax = (int) (((AnnualSAL - 1800000)) * 0.175) + 137000;
            results1.setText(Integer.toString(AnnualTax));
            int MonthlyTAX = AnnualTax / 12;
            results2.setText(Integer.toString(MonthlyTAX));
        } else if (AnnualSAL > 2500000 & AnnualSAL <= 3000000) {
            AnnualTax = (int) (((AnnualSAL - 2500000)) * 0.20) + 259500;
            results1.setText(Integer.toString(AnnualTax));
            int MonthlyTAX = AnnualTax / 12;
            results2.setText(Integer.toString(MonthlyTAX));
        } else if (AnnualSAL > 3000000 & AnnualSAL <= 3500000) {
            AnnualTax = (int) (((AnnualSAL - 3000000)) * 0.225) + 359500;
            results1.setText(Integer.toString(AnnualTax));
            int MonthlyTAX = AnnualTax / 12;
            results2.setText(Integer.toString(MonthlyTAX));
        } else if (AnnualSAL > 3500000 & AnnualSAL <= 4000000) {
            AnnualTax = (int) (((AnnualSAL - 3500000)) * 0.25) + 472000;
            results1.setText(Integer.toString(AnnualTax));
            int MonthlyTAX = AnnualTax / 12;
            results2.setText(Integer.toString(MonthlyTAX));
        } else if (AnnualSAL > 4000000 & AnnualSAL <= 7000000) {
            AnnualTax = (int) (((AnnualSAL - 4000000)) * 0.275) + 597000;
            results1.setText(Integer.toString(AnnualTax));
            int MonthlyTAX = AnnualTax / 12;
            results2.setText(Integer.toString(MonthlyTAX));
        } else if (AnnualSAL > 7000000) {
            AnnualTax = (int) (((AnnualSAL - 7000000)) * 0.30) + 1422000;
            results1.setText(Integer.toString(AnnualTax));
            int MonthlyTAX = AnnualTax / 12;
            results2.setText(Integer.toString(MonthlyTAX));
        }

/*
    Button loadNewActivity = (Button) findViewById(R.id.TAXSLABbutton);
    loadNewActivity.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View view)
        {
            Intent intent = new Intent(MainActivity.this, TAXSlabs.class);
            startActivity(intent);
        }
    }

    );
*/



}
}


/*
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        setContentView(R.layout.content_layout_id);

        final Button button = (Button) findViewById(R.id.editText2);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                if( button.getText() == "0" )
                    button.setText(" ");


            }
        });
    }
    */