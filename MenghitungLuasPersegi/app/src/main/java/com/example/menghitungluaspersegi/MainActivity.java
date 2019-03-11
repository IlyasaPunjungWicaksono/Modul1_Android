package com.example.menghitungluaspersegi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private EditText editSisi, editHasil, editkeliling;
    private Button btnOk;
    private TextView txtsisi, txtluas, txtkeliling;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        initEvent();
    }
    private void initUI(){
        txtsisi = (TextView)findViewById(R.id.txtsisi);
        txtluas = (TextView)findViewById(R.id.txtluas);
        txtkeliling = (TextView)findViewById(R.id.txtkeliling);
        editSisi = (EditText)findViewById(R.id.editSisi);
        editHasil = (EditText)findViewById(R.id.edithasil);
        editkeliling = (EditText)findViewById(R.id.editkeliling);
        btnOk = (Button)findViewById(R.id.btnOk);
    }
    private void initEvent(){
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuas();
                hitungKeliling();
            }
        });
    }
    private void hitungLuas(){
        int sisi = Integer.parseInt(editSisi.getText().toString());
        int luas = sisi*sisi;
        editHasil.setText(luas+"");
    }
    private void hitungKeliling(){
        int sisi = Integer.parseInt(editSisi.getText().toString());
        int keliling = 4*sisi;
        editkeliling.setText(keliling+"");
    }
}
