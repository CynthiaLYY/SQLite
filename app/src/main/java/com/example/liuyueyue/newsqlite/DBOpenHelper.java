package com.example.liuyueyue.newsqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by liuyueyue on 2017/8/14.
 */

public class DBOpenHelper extends SQLiteOpenHelper {

    public DBOpenHelper(Context context, String name) {
        super(context, name, null, 1);
    }
    //首次创建数据库的时候调用
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table if not exists stutb(_id integer primary key autoincrement,name text not null)");
        db.execSQL("insert into stutb(name,sex,age)valus('张三','女'，18)");
    }
    //当数据库的版本发生变化的时候自动执行
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
