package com.zheng.gittest;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void getDataBy2() {
		System.out.println("我来自dev的修改");
		System.out.println("我来自master的修改");
		System.out.println("我来自dev的第二次修改");
	}

	public void getDataBy1() {
		int i = 1;
		int y = 2;
		int z = i + y;
		int j = 3;
		j = z + i + y;
		System.out.println("z==" + z + "<---->j==" + j);
	}
}
