package edu.cnm.bootcamp.kelly.authormate.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.j256.ormlite.android.apptools.OpenHelperManager;
import edu.cnm.bootcamp.kelly.authormate.R;
import edu.cnm.bootcamp.kelly.authormate.helpers.AndroidDatabaseManager;
import edu.cnm.bootcamp.kelly.authormate.helpers.OrmHelper;

public class NavigationActivity extends AppCompatActivity
    implements NavigationView.OnNavigationItemSelectedListener {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_navigation);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    OrmHelper ormHelper = OpenHelperManager.getHelper(this, OrmHelper.class);
    ormHelper.getWritableDatabase().close();

    FloatingActionButton newprButton = (FloatingActionButton) findViewById(R.id.newprButton);
    newprButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent createIntent = new Intent(NavigationActivity.this, NewProject.class);
        startActivity(createIntent);
      }
    });

    Button databaseButton = (Button) findViewById(R.id.databaseButton);
    databaseButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent testIntent = new Intent(NavigationActivity.this, AndroidDatabaseManager.class);
        startActivity(testIntent);
      }
    });

    Button listButton = (Button) findViewById(R.id.listButton);
    listButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent listActivity = new Intent(NavigationActivity.this, TestActivity.class);
        startActivity(listActivity);
      }
    });

    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
        this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
    drawer.setDrawerListener(toggle);
    toggle.syncState();

    NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
    navigationView.setNavigationItemSelectedListener(this);
  }

  @Override
  public void onBackPressed() {
    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    if (drawer.isDrawerOpen(GravityCompat.START)) {
      drawer.closeDrawer(GravityCompat.START);
    } else {
      super.onBackPressed();
    }
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.activity_navigation_drawer, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
//    if (id == R.id.action_settings) {
//      return true;
//    }

    return super.onOptionsItemSelected(item);
  }

  @SuppressWarnings("StatementWithEmptyBody")
  @Override
  public boolean onNavigationItemSelected(MenuItem item) {
    // Handle navigation view item clicks here.
    int id = item.getItemId();

    if (id == R.id.nav_camera) {
      // Handle the camera action
    } else if (id == R.id.nav_gallery) {

    } else if (id == R.id.nav_slideshow) {

    } else if (id == R.id.nav_manage) {

    } else if (id == R.id.nav_share) {

    } else if (id == R.id.nav_send) {

    }

    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    drawer.closeDrawer(GravityCompat.START);
    return true;
  }
}
