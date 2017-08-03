package edu.cnm.bootcamp.kelly.authormate.activities;

import static edu.cnm.bootcamp.kelly.authormate.R.id.editDeadline;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.Dao;
import edu.cnm.bootcamp.kelly.authormate.R;
import edu.cnm.bootcamp.kelly.authormate.entitites.Project;
import edu.cnm.bootcamp.kelly.authormate.helpers.OrmHelper;
import java.sql.Date;
import java.sql.SQLException;

/**
 * Created by kelly on 7/31/17.
 */

public class NewProject extends AppCompatActivity{

  private OrmHelper ormHelper = null;

  private synchronized OrmHelper getOrmHelper() {
    if (ormHelper == null) {
      ormHelper = OpenHelperManager.getHelper(this, OrmHelper.class);
    }
    return ormHelper;
  }

  private synchronized void releaseHelper() {
    if (ormHelper != null) {
      OpenHelperManager.releaseHelper();
      ormHelper = null;
    }
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_newproject);
    Button button = (Button) findViewById(R.id.createButton);
    button.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        try {
          Dao<Project, Integer> dao = getOrmHelper().getProjectDao();
          Project project = new Project();
          EditText editTitle = (EditText) findViewById(R.id.editTitle);
          project.setTitle(editTitle.getText().toString());

          EditText editWordCount = (EditText) findViewById(R.id.editWordCount);
          project.setGoal(Integer.parseInt(editWordCount.getText().toString()));

          EditText editDeadline = (EditText) findViewById(R.id.editDeadline);
          project.setTarget(Date.valueOf(editDeadline.getText().toString()));

          dao.create(project);
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
      }
    });
  }

}
