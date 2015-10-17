package com.example.drm123;


import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


public class useUser {
	private static DatabaseHelper dbHelper;
	public useUser(Context context){
		dbHelper=new DatabaseHelper(context);
		}
	//登录 
	public boolean login(String useremail,String password){
		SQLiteDatabase sdb=dbHelper.getReadableDatabase();
		String sql="select * from user where useremail=? and password=?";
		Cursor cursor=sdb.rawQuery(sql, new String[]{useremail,password});		
		if(cursor.moveToFirst()==true){
			cursor.close();
			return true;
		}
		return false;
	}
	
	
	//注册 添加
	public static boolean register(com.example.drm123.User user){
		SQLiteDatabase sdb=dbHelper.getReadableDatabase();
		String sql="insert into user(username,password,age,sex) values(?,?,?,?)";
		Object obj[]={user.getUseremail(),user.getPassword(),user.getName(),user.getAge(),user.getSex(),user.getTelephone()};
		sdb.execSQL(sql, obj);	
		return true;
	}
	
	}
