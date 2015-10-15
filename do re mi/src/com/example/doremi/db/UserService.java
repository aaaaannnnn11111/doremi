package com.example.doremi.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


public class UserService {
	private DatabaseHelper dbHelper;
	public UserService(Context context){
		dbHelper=new DatabaseHelper(context);
	}
	
	//×¢²áÓÃ
	public boolean register(User user){
		SQLiteDatabase sdb=dbHelper.getReadableDatabase();
		String sql="insert into user(username,password,sex) values(?,?,?)";
		Object obj[]={user.getUsername(),user.getPassword()};
		sdb.execSQL(sql, obj);	
		return true;
	}
}
