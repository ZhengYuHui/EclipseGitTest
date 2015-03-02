package com.zheng.gittest;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	// 123321
	// qqqqqqqqqqq
	// zzzzzz
	// 来自笔记本eclipse的再次提交 -----
	public void getDataBy2() {

	}

	public void getDataBy1() {
		int j = 3;
		int i = 1;
		int y = 2;
		int z = i + y;
		j = z + i + y;
		System.out.println("z==" + z + "<---->j==" + j);
	}
}
