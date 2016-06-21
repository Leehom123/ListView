package com.bingxuan.listview;

import java.util.zip.Inflater;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private ListView listview;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        for (int i = 0; i < 10; i++) {
        	setContentView(R.layout.activity_main);
		}
       
        listview = (ListView) findViewById(R.id.lv);
        listview.setAdapter(new MyAdaptor());
    }
	public class MyAdaptor extends BaseAdapter{

		@Override
		public int getCount() {
			return 1000;
		}
		@Override
		public Object getItem(int position) {
			return null;
		}
		@Override
		public long getItemId(int position) {
			return 0;
		}
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			
			View view;
			if (convertView==null) {
				
					
					System.out.println("创建新的tv对象....."+position);
					if ((position+1)%10==0) {
						view=LayoutInflater.from(getApplicationContext()).inflate(R.layout.item,null);
					}
			}else {
				view=LayoutInflater.from(getApplicationContext()).inflate(R.layout.item,null);
				System.out.println("服用历史tv对象....."+position);
			}
			
			view=LayoutInflater.from(getApplicationContext()).inflate(R.layout.item,null);
			return view;
		}
		
	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
