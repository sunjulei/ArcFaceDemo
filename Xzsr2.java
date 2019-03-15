package com.example.licaitong;

import android.annotation.TargetApi;
import android.app.DatePickerDialog;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Xzsr2 extends AppCompatActivity{
    private DatePicker datePicker;
    private Calendar calendar;
    private TextView dateView;
    private int year,month,day;
    Button b;

    @TargetApi(Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xzsr2);

        final EditText e1= (EditText) findViewById(R.id.ed1);
        final EditText e2= (EditText) findViewById(R.id.ed2);
        final Spinner sp1= (Spinner) findViewById(R.id.SP3);
        final EditText e4= (EditText) findViewById(R.id.ed4);
        final EditText e5= (EditText) findViewById(R.id.ed5);
        Button bt1= (Button) findViewById(R.id.bt1);
        Button bt2= (Button) findViewById(R.id.bt2);


        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("");
                e2.setText("");
                e4.setText("");
                e5.setText("");
            }
        });

        Spinner spinner = (Spinner) findViewById(R.id.SP3);
        String[] mItems = getResources().getStringArray(R.array.shouru);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, mItems);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner .setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int pos, long id) {
                String[] shouru = getResources().getStringArray(R.array.shouru);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        dateView=(EditText)findViewById(R.id.ed2);
        calendar=Calendar.getInstance();
        year=calendar.get(Calendar.YEAR);
        month=calendar.get(Calendar.MONTH);
        day=calendar.get(Calendar.DAY_OF_MONTH);
        showDate(year,month+1,day);
    }
    @SuppressWarnings("deprecation")
    public void setDate(View v){
        Toast.makeText(getApplicationContext(),"选择时间",Toast.LENGTH_SHORT).show();
        new DatePickerDialog(Xzsr2.this,myDateListener,year,month,day).show();

    }
    private DatePickerDialog.OnDateSetListener myDateListener= new DatePickerDialog.OnDateSetListener() {
        @Override
        public  void onDateSet(DatePicker arg0, int arg1,int arg2,int arg3){
            showDate(arg1,arg2+1,arg3);
        }
    };
    private void showDate(int year,int month,int day) {
        dateView.setText(new StringBuilder().append(year).append("/")
                .append(month).append("/").append(day));
        String aaa= ""+year+"/"+month+"/"+day;
        if(day==day&&month==month&&year==year){/*Toast.makeText(getApplicationContext(),aaa,Toast.LENGTH_LONG).show();*/}
    }



}
