package com.lzf.activity;

import android.support.v7.app.ActionBarActivity;

import java.util.ArrayList;
import java.util.List;

import com.lzf.adapter.ReusableAdapter;
import com.lzf.bean.GridItem;
import com.lzf.lp.R;

import android.os.Bundle;
import android.view.Window;
import android.widget.GridView;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		GridView gridView = (GridView) findViewById(R.id.gridView);
		gridView.setAdapter(getReusableAdapter());
	}

	@SuppressWarnings("rawtypes")
	private static ReusableAdapter getReusableAdapter() {
		List<GridItem> listData = new ArrayList<GridItem>();
		listData.add(new GridItem(R.drawable.home, "入户采集"));
		listData.add(new GridItem(R.drawable.signin, "日常签到"));
		listData.add(new GridItem(R.drawable.examine, "场所核查"));
		listData.add(new GridItem(R.drawable.business, "业务查询"));
		listData.add(new GridItem(R.drawable.notification, "任务通知"));
		listData.add(new GridItem(R.drawable.log, "工作日志"));
		listData.add(new GridItem(R.drawable.task, "我的任务"));
		listData.add(new GridItem(R.drawable.action, "专项行动"));
		listData.add(new GridItem(R.drawable.group, "特殊人员入户"));
		ReusableAdapter<GridItem> adapter = new ReusableAdapter<GridItem>(listData, R.layout.grid_item) {

			@Override
			public void bindView(ViewHolder holder, GridItem obj) {
				holder.setImageResource(R.id.image, obj.getImage());
				holder.setText(R.id.text, obj.getText());
			}
		};
		return adapter;
	}

}
