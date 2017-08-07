package edu.cnm.bootcamp.kelly.authormate.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TabHost;
import android.widget.TabHost.TabContentFactory;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;
import android.widget.TextView;
import edu.cnm.bootcamp.kelly.authormate.R;

public class ProjectActivity extends NavigationActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_project);
    setContentView(R.layout.activity_navigation);

  }

//  private void setupTabs() {
//    TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
//    tabHost.setup();
//    final TabWidget tabWidget = tabHost.getTabWidget();
//    final FrameLayout tabContent = tabHost.getTabContentView();
//    TextView[] textViews = new TextView[tabWidget.getTabCount()];
//    for (int i = 0; i < textViews.length; i++) {
//      textViews[i] = (TextView) tabWidget.getChildTabViewAt(i);
//    }
//    tabWidget.removeAllViews();
//    for (int i = 0; i < tabContent.getChildCount(); i++) {
//      tabContent.getChildAt(i).setVisibility(View.GONE);
//    }
//    for (int i = 0; i <textViews.length; i++) {
//      final TextView tab = textViews[i];
//      final View content = tabContent.getChildAt(i);
//      TabSpec spec = tabHost.newTabSpec((String) tab.getTag());
//      spec.setContent(new TabContentFactory() {
//        @Override
//        public View createTabContent(String tag) {
//          return content;
//        }
//      });
//      spec.setIndicator(tab.getText());
//      tabHost.addTab(spec);
//    }
//    tabHost.setCurrentTab(0);
//
//  }



}
















