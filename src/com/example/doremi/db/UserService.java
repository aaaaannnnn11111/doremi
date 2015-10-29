package com.example.doremi.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


public class UserService {
	private DatabaseHelper dbHelper;
	private ApplyDatabaseHelper adbHelper;
	public UserService(Context context){
		dbHelper=new DatabaseHelper(context);
		adbHelper=new ApplyDatabaseHelper(context);
	}
	
	//登录用
		public boolean login(String username,String password){
			SQLiteDatabase sdb=dbHelper.getReadableDatabase();
			String sql="select * from user where username=? and password=?";
			Cursor cursor=sdb.rawQuery(sql, new String[]{username,password});		
			if(cursor.moveToFirst()==true){
				cursor.close();
				return true;
			}
			return false;
		}
		
	
	//注册用
	public boolean register(User user){
		SQLiteDatabase sdb=dbHelper.getReadableDatabase();
		String sql="insert into user(username,password,sex) values(?,?,?)";
		Object obj[]={user.getUsername(),user.getPassword()};
		sdb.execSQL(sql, obj);	
		return true;
	}
	//义工报名用
	public boolean apply(ApplyUser applyuser){
		SQLiteDatabase sdb=adbHelper.getReadableDatabase();
		String sql="insert into applyuser(name,phone,age,sex) values(?,?,?,?)";
		Object obj[]={applyuser.getUsername(),applyuser.getPhone()};
		sdb.execSQL(sql, obj);	
		return true;
	}
}
