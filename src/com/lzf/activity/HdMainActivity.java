package com.lzf.activity;

import java.util.ArrayList;
import java.util.List;

import com.lzf.adapter.ReusableAdapter;
import com.lzf.bean.GridItem;
import com.lzf.bean.ListItem;
import com.lzf.lp.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class HdMainActivity extends Activity {

	private static TextView text, top, edit1Hint, edit2Hint, edit3Hint;
	private static View banner;
	private static EditText edit1, edit2, edit3;
	private static Spinner spinner;
	private static Button hdQuery, hdReset, record;
	private static GridView hdGridRoutine, hdGridSet;
	private static ListView taskList;
	private static RadioGroup task;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hd_activity_main);

		task = (RadioGroup) findViewById(R.id.task);
		taskList = (ListView) findViewById(R.id.taskList);
		spinner = (Spinner) findViewById(R.id.spinner);
		hdQuery = (Button) findViewById(R.id.hdQuery);
		record = (Button) findViewById(R.id.record);
		hdReset = (Button) findViewById(R.id.hdReset);
		edit1Hint = (TextView) findViewById(R.id.edit1Hint);
		edit2Hint = (TextView) findViewById(R.id.edit2Hint);
		edit3Hint = (TextView) findViewById(R.id.edit3Hint);
		edit1 = (EditText) findViewById(R.id.hdedit1);
		edit2 = (EditText) findViewById(R.id.hdedit2);
		edit3 = (EditText) findViewById(R.id.hdedit3);
		banner = findViewById(R.id.hdBanner);
		text = (TextView) findViewById(R.id.hdText);
		top = (TextView) findViewById(R.id.hdTop);
		hdGridRoutine = (GridView) findViewById(R.id.hdGridRoutine);
		hdGridSet = (GridView) findViewById(R.id.hdGridSet);
		final RadioButton hdroutine = (RadioButton) findViewById(R.id.hdroutine);
		final RadioButton hdset = (RadioButton) findViewById(R.id.hdset);
		hdroutine.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				goneAll();
				hdroutine.setChecked(true);
				hdset.setChecked(false);
				banner.setVisibility(View.VISIBLE);
				hdGridRoutine.setVisibility(View.VISIBLE);

				List<GridItem> listData = new ArrayList<GridItem>();
				listData.add(new GridItem(R.drawable.hdsign, "日常签到"));
				listData.add(new GridItem(R.drawable.hdhousehold, "入户采集"));
				listData.add(new GridItem(R.drawable.hdsite, "场所核查"));
				listData.add(new GridItem(R.drawable.hdquery, "业务查询"));
				listData.add(new GridItem(R.drawable.hdnotification, "任务通知"));
				listData.add(new GridItem(R.drawable.hdlog, "工作日志"));
				listData.add(new GridItem(R.drawable.hdtask, "我的任务"));
				listData.add(new GridItem(R.drawable.hdaction, "专项行动"));
				listData.add(new GridItem(R.drawable.hdperson, "特殊人员入户"));
				listData.add(new GridItem(R.drawable.hdcase, "案件管理"));
				hdGridRoutine.setAdapter(getReusableAdapter(listData));
				hdGridRoutine.setOnItemClickListener(new OnItemClickListener() {
					@Override
					public void onItemClick(AdapterView<?> arg0, View view, int sequence, long arg3) {
						switch (sequence) {
						case 1:
							goneAll();
							banner.setVisibility(View.VISIBLE);
							hdGridRoutine.setVisibility(View.VISIBLE);

							List<GridItem> listData = new ArrayList<GridItem>();
							listData.add(new GridItem(R.drawable.hdts, "暂存"));
							listData.add(new GridItem(R.drawable.hdestate, "小区"));
							hdGridRoutine.setAdapter(getReusableAdapter(listData));
							hdGridRoutine.setOnItemClickListener(new OnItemClickListener() {

								@Override
								public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
									switch (arg2) {
									case 0:
										goneAll();
										top.setText("暂存列表");
										top.setVisibility(View.VISIBLE);
										break;

									default:
										break;
									}

								}
							});
							break;
						case 2:
							goneAll();
							banner.setVisibility(View.VISIBLE);
							hdGridRoutine.setVisibility(View.VISIBLE);

							List<GridItem> listData1 = new ArrayList<GridItem>();
							listData1.add(new GridItem(R.drawable.hdts, "暂存"));
							listData1.add(new GridItem(R.drawable.hdscan, "扫描"));
							hdGridRoutine.setAdapter(getReusableAdapter(listData1));
							hdGridRoutine.setOnItemClickListener(new OnItemClickListener() {

								@Override
								public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
									switch (arg2) {
									case 0:
										goneAll();
										top.setText("暂存列表");
										top.setVisibility(View.VISIBLE);
										break;

									default:
										break;
									}

								}
							});
							break;
						case 3:
							goneAll();
							banner.setVisibility(View.VISIBLE);
							hdGridRoutine.setVisibility(View.VISIBLE);

							List<GridItem> listData11 = new ArrayList<GridItem>();
							listData11.add(new GridItem(R.drawable.hdpq, "人口查询"));
							listData11.add(new GridItem(R.drawable.hdsq, "场所查询"));
							listData11.add(new GridItem(R.drawable.hdcq, "小区查询"));
							listData11.add(new GridItem(R.drawable.hdrq, "出租房查询"));
							hdGridRoutine.setAdapter(getReusableAdapter(listData11));
							hdGridRoutine.setOnItemClickListener(new OnItemClickListener() {

								@Override
								public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
									switch (arg2) {
									case 0:
										goneAll();
										top.setText("人口查询列表");
										top.setVisibility(View.VISIBLE);
										edit1.setHint("请输入姓名");
										edit1.getLayoutParams().height = 45;
										edit2.setHint("请输入身份证号");
										edit1.setVisibility(View.VISIBLE);
										edit2.setVisibility(View.VISIBLE);
										edit1Hint.setText("姓        名：");
										edit2Hint.setText("身份证号：");
										edit1Hint.setVisibility(View.VISIBLE);
										edit2Hint.setVisibility(View.VISIBLE);
										hdQuery.setText("查询");
										hdQuery.setVisibility(View.VISIBLE);
										hdReset.setText("重置");
										hdReset.setVisibility(View.VISIBLE);
										break;
									case 1:
										goneAll();
										top.setText("场所查询列表");
										top.setVisibility(View.VISIBLE);
										edit1.setHint("请输入场所名称");
										edit1.getLayoutParams().height = 45;
										edit1.setVisibility(View.VISIBLE);
										spinner.setVisibility(View.VISIBLE);
										edit1Hint.setText("名        称：");
										edit2Hint.setText("场所列表：");
										edit1Hint.setVisibility(View.VISIBLE);
										edit2Hint.setVisibility(View.VISIBLE);
										hdQuery.setText("查询");
										hdQuery.setVisibility(View.VISIBLE);
										hdReset.setText("重置");
										hdReset.setVisibility(View.VISIBLE);
										break;
									case 2:
										goneAll();
										top.setText("小区查询列表");
										top.setVisibility(View.VISIBLE);
										edit1.setHint("请输入小区名称");
										edit1.getLayoutParams().height = 45;
										edit1.setVisibility(View.VISIBLE);
										edit1Hint.setText("名        称：");
										edit1Hint.setVisibility(View.VISIBLE);
										hdQuery.setText("查询");
										hdQuery.setVisibility(View.VISIBLE);
										hdReset.setText("重置");
										hdReset.setVisibility(View.VISIBLE);
										break;
									case 3:
										goneAll();
										top.setText("场所查询列表");
										top.setVisibility(View.VISIBLE);
										edit1.setHint("请输入房东姓名");
										edit1.getLayoutParams().height = 45;
										edit1.setVisibility(View.VISIBLE);
										edit2.setHint("出租房地址");
										edit2.setVisibility(View.VISIBLE);
										edit3.setHint("承租人姓名");
										edit3.setVisibility(View.VISIBLE);
										edit1Hint.setText("房东姓名：");
										edit1Hint.setVisibility(View.VISIBLE);
										edit2Hint.setText("出租房地址：");
										edit2Hint.setVisibility(View.VISIBLE);
										edit3Hint.setText("承租人姓名：");
										edit3Hint.setVisibility(View.VISIBLE);
										hdQuery.setText("查询");
										hdQuery.setVisibility(View.VISIBLE);
										hdReset.setText("重置");
										hdReset.setVisibility(View.VISIBLE);
										break;
									default:
										break;
									}

								}
							});
							break;

						case 4:
							goneAll();
							top.setText("任务通知");
							top.setVisibility(View.VISIBLE);

							List<ListItem> tasks = new ArrayList<ListItem>();
							tasks.add(new ListItem("标题", "发布时间：2016-07-21 \t 10:40", "发布单位：菲达科技"));
							tasks.add(new ListItem("标题", "发布时间：2016-08-01 \t 19:28", "发布单位：菲达科技"));
							tasks.add(new ListItem("标题", "发布时间：2016-09-16 \t 20:51", "发布单位：菲达科技"));
							ReusableAdapter<ListItem> adapter = new ReusableAdapter<ListItem>(tasks,
									R.layout.hd_list_item) {
								@Override
								public void bindView(ViewHolder holder, ListItem obj) {
									holder.setText(R.id.hdTitle, obj.getTitle());
									holder.setText(R.id.hdText1, obj.getText1());
									holder.setText(R.id.hdText2, obj.getText2());
								}

							};
							taskList.setAdapter(adapter);
							taskList.setVisibility(View.VISIBLE);
							break;
						case 5:
							goneAll();
							top.setText("工作日志");
							top.setVisibility(View.VISIBLE);
							edit1.getLayoutParams().height = 250;
							edit1.setHint("请输入工作日志");
							edit1.setVisibility(View.VISIBLE);
							record.setText("录音");
							record.getLayoutParams().height = 60;
							record.setVisibility(View.VISIBLE);
							hdQuery.setText("查询");
							hdQuery.setVisibility(View.VISIBLE);
							hdReset.setText("重置");
							hdReset.setVisibility(View.VISIBLE);
							break;
						case 6:
							goneAll();
							top.setVisibility(View.INVISIBLE);
							task.setVisibility(View.VISIBLE);
							task.setOnCheckedChangeListener(new OnCheckedChangeListener() {

								@Override
								public void onCheckedChanged(RadioGroup arg0, int arg1) {
									switch (arg1) {
									case R.id.mounth:
										List<ListItem> actions = new ArrayList<ListItem>();
										actions.add(new ListItem("任务类型", "总量", "完成量"));
										actions.add(new ListItem("学校及教学机构核查", "2", "1"));
										actions.add(new ListItem("专项行动特性单位核查", "6", "1"));
										actions.add(new ListItem("普通场所核查", "6", "1"));
										actions.add(new ListItem("出租房屋走访", "6", "1"));
										ReusableAdapter<ListItem> adapter1 = new ReusableAdapter<ListItem>(actions,
												R.layout.hd_listitem) {
											@Override
											public void bindView(ViewHolder holder, ListItem obj) {
												holder.setText(R.id.textView1, obj.getTitle());
												holder.setText(R.id.textView2, obj.getText1());
												holder.setText(R.id.textView3, obj.getText2());
											}

										};
										taskList.setAdapter(adapter1);
										taskList.setVisibility(View.VISIBLE);
										break;
									case R.id.quarter:
										List<ListItem> qtasks = new ArrayList<ListItem>();
										qtasks.add(new ListItem("任务类型", "总量", "完成量"));
										qtasks.add(new ListItem("B类特殊人员走访", "2", "1"));
										ReusableAdapter<ListItem> adapterQ = new ReusableAdapter<ListItem>(qtasks,
												R.layout.hd_listitem) {
											@Override
											public void bindView(ViewHolder holder, ListItem obj) {
												holder.setText(R.id.textView1, obj.getTitle());
												holder.setText(R.id.textView2, obj.getText1());
												holder.setText(R.id.textView3, obj.getText2());
											}
										};
										taskList.setAdapter(adapterQ);
										taskList.setVisibility(View.VISIBLE);
										break;
									case R.id.year:
										List<ListItem> ytasks = new ArrayList<ListItem>();
										ytasks.add(new ListItem("任务类型", "总量", "完成量"));
										ytasks.add(new ListItem("B类特殊人员走访", "2", "1"));
										ReusableAdapter<ListItem> adapterY = new ReusableAdapter<ListItem>(ytasks,
												R.layout.hd_listitem) {
											@Override
											public void bindView(ViewHolder holder, ListItem obj) {
												holder.setText(R.id.textView1, obj.getTitle());
												holder.setText(R.id.textView2, obj.getText1());
												holder.setText(R.id.textView3, obj.getText2());
											}
										};
										taskList.setAdapter(adapterY);
										taskList.setVisibility(View.VISIBLE);
										break;

									default:
										break;
									}
								}
							});

							RadioButton mounth = (RadioButton) findViewById(R.id.mounth);
							mounth.setChecked(true);
							break;
						case 7:
							goneAll();
							top.setText("专项行动");
							top.setVisibility(View.VISIBLE);
							List<ListItem> actions = new ArrayList<ListItem>();
							actions.add(new ListItem("标题", "总量", "完成量"));
							actions.add(new ListItem("CS7", "2", "1"));
							actions.add(new ListItem("专项行动", "6", "1"));
							ReusableAdapter<ListItem> adapter1 = new ReusableAdapter<ListItem>(actions,
									R.layout.hd_listitem) {
								@Override
								public void bindView(ViewHolder holder, ListItem obj) {
									holder.setText(R.id.textView1, obj.getTitle());
									holder.setText(R.id.textView2, obj.getText1());
									holder.setText(R.id.textView3, obj.getText2());
								}

							};
							taskList.setAdapter(adapter1);
							taskList.setVisibility(View.VISIBLE);
							break;
						default:
							break;
						}
					}
				});
			}
		});
		hdset.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				goneAll();
				hdroutine.setChecked(false);
				hdset.setChecked(true);
				text.setVisibility(View.VISIBLE);
				banner.setVisibility(View.VISIBLE);
				hdGridSet.setVisibility(View.VISIBLE);
				List<GridItem> listData1 = new ArrayList<GridItem>();
				listData1.add(new GridItem(R.drawable.hdgetdata, "获取数据"));
				listData1.add(new GridItem(R.drawable.modifypw, "修改密码"));
				hdGridSet.setAdapter(getReusableAdapter(listData1));
				hdGridSet.setOnItemClickListener(new OnItemClickListener() {

					@Override
					public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
						switch (arg2) {
						case 1:
							goneAll();
							top.setText("场所查询列表");
							top.setVisibility(View.VISIBLE);
							edit1.setHint("请输入旧密码");
							edit1.getLayoutParams().height = 45;
							edit1.setVisibility(View.VISIBLE);
							edit2.setHint("请输入新密码");
							edit2.setVisibility(View.VISIBLE);
							edit3.setHint("请再次输入新密码");
							edit3.setVisibility(View.VISIBLE);
							record.getLayoutParams().height = 130;
							record.setVisibility(View.INVISIBLE);
							hdQuery.setText("提交");
							hdQuery.setVisibility(View.VISIBLE);
							hdReset.setText("重置");
							hdReset.setVisibility(View.VISIBLE);
							break;

						default:
							break;
						}
					}
				});
			}
		});

		// findViewById(R.id.hdmain).setBackgroundResource(R.drawable.hdloginbg);

		RadioButton set = (RadioButton) findViewById(R.id.hdset);
		set.performClick();
	}

	private static ReusableAdapter<GridItem> getReusableAdapter(List<GridItem> listData) {
		ReusableAdapter<GridItem> adapter = new ReusableAdapter<GridItem>(listData, R.layout.hd_grid_item) {
			@Override
			public void bindView(ViewHolder holder, GridItem obj) {
				holder.setImageResource(R.id.icon, obj.getImage());
				holder.setText(R.id.chinese, obj.getText());
			}
		};
		return adapter;
	}

	private static void goneAll() {
		text.setVisibility(View.GONE);
		top.setVisibility(View.GONE);
		banner.setVisibility(View.GONE);
		edit1.setVisibility(View.GONE);
		edit2.setVisibility(View.GONE);
		hdGridRoutine.setVisibility(View.GONE);
		hdGridSet.setVisibility(View.GONE);
		edit1Hint.setVisibility(View.GONE);
		edit2Hint.setVisibility(View.GONE);
		hdQuery.setVisibility(View.GONE);
		hdReset.setVisibility(View.GONE);
		spinner.setVisibility(View.GONE);
		edit3Hint.setVisibility(View.GONE);
		edit3.setVisibility(View.GONE);
		taskList.setVisibility(View.GONE);
		record.setVisibility(View.GONE);
		task.setVisibility(View.GONE);
	}

}
