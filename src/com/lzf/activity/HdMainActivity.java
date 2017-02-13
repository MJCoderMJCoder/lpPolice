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
				listData.add(new GridItem(R.drawable.hdsign, "�ճ�ǩ��"));
				listData.add(new GridItem(R.drawable.hdhousehold, "�뻧�ɼ�"));
				listData.add(new GridItem(R.drawable.hdsite, "�����˲�"));
				listData.add(new GridItem(R.drawable.hdquery, "ҵ���ѯ"));
				listData.add(new GridItem(R.drawable.hdnotification, "����֪ͨ"));
				listData.add(new GridItem(R.drawable.hdlog, "������־"));
				listData.add(new GridItem(R.drawable.hdtask, "�ҵ�����"));
				listData.add(new GridItem(R.drawable.hdaction, "ר���ж�"));
				listData.add(new GridItem(R.drawable.hdperson, "������Ա�뻧"));
				listData.add(new GridItem(R.drawable.hdcase, "��������"));
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
							listData.add(new GridItem(R.drawable.hdts, "�ݴ�"));
							listData.add(new GridItem(R.drawable.hdestate, "С��"));
							hdGridRoutine.setAdapter(getReusableAdapter(listData));
							hdGridRoutine.setOnItemClickListener(new OnItemClickListener() {

								@Override
								public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
									switch (arg2) {
									case 0:
										goneAll();
										top.setText("�ݴ��б�");
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
							listData1.add(new GridItem(R.drawable.hdts, "�ݴ�"));
							listData1.add(new GridItem(R.drawable.hdscan, "ɨ��"));
							hdGridRoutine.setAdapter(getReusableAdapter(listData1));
							hdGridRoutine.setOnItemClickListener(new OnItemClickListener() {

								@Override
								public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
									switch (arg2) {
									case 0:
										goneAll();
										top.setText("�ݴ��б�");
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
							listData11.add(new GridItem(R.drawable.hdpq, "�˿ڲ�ѯ"));
							listData11.add(new GridItem(R.drawable.hdsq, "������ѯ"));
							listData11.add(new GridItem(R.drawable.hdcq, "С����ѯ"));
							listData11.add(new GridItem(R.drawable.hdrq, "���ⷿ��ѯ"));
							hdGridRoutine.setAdapter(getReusableAdapter(listData11));
							hdGridRoutine.setOnItemClickListener(new OnItemClickListener() {

								@Override
								public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
									switch (arg2) {
									case 0:
										goneAll();
										top.setText("�˿ڲ�ѯ�б�");
										top.setVisibility(View.VISIBLE);
										edit1.setHint("����������");
										edit1.getLayoutParams().height = 45;
										edit2.setHint("���������֤��");
										edit1.setVisibility(View.VISIBLE);
										edit2.setVisibility(View.VISIBLE);
										edit1Hint.setText("��        ����");
										edit2Hint.setText("���֤�ţ�");
										edit1Hint.setVisibility(View.VISIBLE);
										edit2Hint.setVisibility(View.VISIBLE);
										hdQuery.setText("��ѯ");
										hdQuery.setVisibility(View.VISIBLE);
										hdReset.setText("����");
										hdReset.setVisibility(View.VISIBLE);
										break;
									case 1:
										goneAll();
										top.setText("������ѯ�б�");
										top.setVisibility(View.VISIBLE);
										edit1.setHint("�����볡������");
										edit1.getLayoutParams().height = 45;
										edit1.setVisibility(View.VISIBLE);
										spinner.setVisibility(View.VISIBLE);
										edit1Hint.setText("��        �ƣ�");
										edit2Hint.setText("�����б�");
										edit1Hint.setVisibility(View.VISIBLE);
										edit2Hint.setVisibility(View.VISIBLE);
										hdQuery.setText("��ѯ");
										hdQuery.setVisibility(View.VISIBLE);
										hdReset.setText("����");
										hdReset.setVisibility(View.VISIBLE);
										break;
									case 2:
										goneAll();
										top.setText("С����ѯ�б�");
										top.setVisibility(View.VISIBLE);
										edit1.setHint("������С������");
										edit1.getLayoutParams().height = 45;
										edit1.setVisibility(View.VISIBLE);
										edit1Hint.setText("��        �ƣ�");
										edit1Hint.setVisibility(View.VISIBLE);
										hdQuery.setText("��ѯ");
										hdQuery.setVisibility(View.VISIBLE);
										hdReset.setText("����");
										hdReset.setVisibility(View.VISIBLE);
										break;
									case 3:
										goneAll();
										top.setText("������ѯ�б�");
										top.setVisibility(View.VISIBLE);
										edit1.setHint("�����뷿������");
										edit1.getLayoutParams().height = 45;
										edit1.setVisibility(View.VISIBLE);
										edit2.setHint("���ⷿ��ַ");
										edit2.setVisibility(View.VISIBLE);
										edit3.setHint("����������");
										edit3.setVisibility(View.VISIBLE);
										edit1Hint.setText("����������");
										edit1Hint.setVisibility(View.VISIBLE);
										edit2Hint.setText("���ⷿ��ַ��");
										edit2Hint.setVisibility(View.VISIBLE);
										edit3Hint.setText("������������");
										edit3Hint.setVisibility(View.VISIBLE);
										hdQuery.setText("��ѯ");
										hdQuery.setVisibility(View.VISIBLE);
										hdReset.setText("����");
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
							top.setText("����֪ͨ");
							top.setVisibility(View.VISIBLE);

							List<ListItem> tasks = new ArrayList<ListItem>();
							tasks.add(new ListItem("����", "����ʱ�䣺2016-07-21 \t 10:40", "������λ���ƴ�Ƽ�"));
							tasks.add(new ListItem("����", "����ʱ�䣺2016-08-01 \t 19:28", "������λ���ƴ�Ƽ�"));
							tasks.add(new ListItem("����", "����ʱ�䣺2016-09-16 \t 20:51", "������λ���ƴ�Ƽ�"));
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
							top.setText("������־");
							top.setVisibility(View.VISIBLE);
							edit1.getLayoutParams().height = 250;
							edit1.setHint("�����빤����־");
							edit1.setVisibility(View.VISIBLE);
							record.setText("¼��");
							record.getLayoutParams().height = 60;
							record.setVisibility(View.VISIBLE);
							hdQuery.setText("��ѯ");
							hdQuery.setVisibility(View.VISIBLE);
							hdReset.setText("����");
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
										actions.add(new ListItem("��������", "����", "�����"));
										actions.add(new ListItem("ѧУ����ѧ�����˲�", "2", "1"));
										actions.add(new ListItem("ר���ж����Ե�λ�˲�", "6", "1"));
										actions.add(new ListItem("��ͨ�����˲�", "6", "1"));
										actions.add(new ListItem("���ⷿ���߷�", "6", "1"));
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
										qtasks.add(new ListItem("��������", "����", "�����"));
										qtasks.add(new ListItem("B��������Ա�߷�", "2", "1"));
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
										ytasks.add(new ListItem("��������", "����", "�����"));
										ytasks.add(new ListItem("B��������Ա�߷�", "2", "1"));
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
							top.setText("ר���ж�");
							top.setVisibility(View.VISIBLE);
							List<ListItem> actions = new ArrayList<ListItem>();
							actions.add(new ListItem("����", "����", "�����"));
							actions.add(new ListItem("CS7", "2", "1"));
							actions.add(new ListItem("ר���ж�", "6", "1"));
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
				listData1.add(new GridItem(R.drawable.hdgetdata, "��ȡ����"));
				listData1.add(new GridItem(R.drawable.modifypw, "�޸�����"));
				hdGridSet.setAdapter(getReusableAdapter(listData1));
				hdGridSet.setOnItemClickListener(new OnItemClickListener() {

					@Override
					public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
						switch (arg2) {
						case 1:
							goneAll();
							top.setText("������ѯ�б�");
							top.setVisibility(View.VISIBLE);
							edit1.setHint("�����������");
							edit1.getLayoutParams().height = 45;
							edit1.setVisibility(View.VISIBLE);
							edit2.setHint("������������");
							edit2.setVisibility(View.VISIBLE);
							edit3.setHint("���ٴ�����������");
							edit3.setVisibility(View.VISIBLE);
							record.getLayoutParams().height = 130;
							record.setVisibility(View.INVISIBLE);
							hdQuery.setText("�ύ");
							hdQuery.setVisibility(View.VISIBLE);
							hdReset.setText("����");
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
