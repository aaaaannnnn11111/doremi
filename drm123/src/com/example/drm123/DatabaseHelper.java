package com.example.drm123;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DatabaseHelper extends SQLiteOpenHelper {
	static String name="user.db";
	static int Version=1;
	public DatabaseHelper(Context context) {
		super(context, name, null, Version);
	}
	public void onCreate(SQLiteDatabase db) {
		String sql="create table user(id integer primary key autoincrement,useremail varchar(20),password varchar(20),name varchar(20),age integer,sex varchar(2),telephone varchar(20) )";
		db.execSQL(sql);
	}
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

	}



}
