package com.example.doremi.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ApplyDatabaseHelper extends SQLiteOpenHelper {
	static String name="applyuser.db";
	static int dbVersion=1;
	public ApplyDatabaseHelper(Context context) {
		super(context, name, null, dbVersion);
	}
	//只在创建的时候用一次
	public void onCreate(SQLiteDatabase db) {
		String sql="create table applyuser(id integer primary key autoincrement,name varchar(20),phone varchar(20),age varchar(10),sex varchar(2))";
		db.execSQL(sql);
	}
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

	}

}
