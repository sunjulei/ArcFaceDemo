package com.example.licaitong;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Szbq7 extends Activity
{
  Button btnflagCancelButton;
  Button btnflagSaveButton;
  EditText txtFlag;

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.szbq7);
    this.txtFlag = ((EditText)findViewById(R.id.ee1));
    this.btnflagSaveButton = ((Button)findViewById(R.id.bb1));
    this.btnflagCancelButton = ((Button)findViewById(R.id.bb2));
    this.btnflagSaveButton.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
       String v = Szbq7.this.txtFlag.getText().toString();
        if (!v.isEmpty())
        {
          FlagDAO localFlagDAO = new FlagDAO(Szbq7.this);
          localFlagDAO.add(new Tb_flag(localFlagDAO.getMaxId() + 1, v));
          Toast.makeText(Szbq7.this, "便签数据添加成功", Toast.LENGTH_SHORT).show();
          return;
        }
        Toast.makeText(Szbq7.this, "请输入便签", Toast.LENGTH_SHORT).show();
      }
    });
    this.btnflagCancelButton.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Szbq7.this.txtFlag.setText("");
      }
    });
  }
}