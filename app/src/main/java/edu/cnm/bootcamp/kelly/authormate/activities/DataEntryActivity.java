package edu.cnm.bootcamp.kelly.authormate.activities;

import static android.R.attr.button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.Dao;
import edu.cnm.bootcamp.kelly.authormate.R;
import edu.cnm.bootcamp.kelly.authormate.entitites.Project;
import edu.cnm.bootcamp.kelly.authormate.helpers.OrmHelper;
import java.sql.SQLException;

public class DataEntryActivity extends AppCompatActivity {



  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_data_entry);
  }


}
