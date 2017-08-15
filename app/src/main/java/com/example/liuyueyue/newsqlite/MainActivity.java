package com.example.liuyueyue.newsqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
//private static final String TABLENAME = "stutb";
    private EditText edt;
    private Button but;
    private TextView contentvalue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*getCount():总记录条数
        * isFirst：判断 是否第一条记录
        * isLast:判断是否最后一条记录
        * moveToFirst:移动到第一条记录
        * moveToLast:移动到最后一条记录
        * move(int offset):移动到指定记录
        * moveToNext():移动到下一条记录
        * moveToPrevious():移动到上一条记录
        * getColumnIndexOrThroww(String columnName):根据列名称获列索引
        * getInt(int columnIndex):获得指定列索引的int类型值
        * getString(int columnIndex):获得指定索引的String类型值*/
        //每一个程序都有自己的数据库，默认情况下互不干扰
        //创建一个数据库 并且打开
        /*方法1*/
        //SQLiteDatabase db = openOrCreateDatabase("user.db",MODE_PRIVATE,null);

        /*db.execSQL("create table if not exists user" +
                "(_id integer primary key autoincrement," +
                "name text not null" +
                "age integer not null,
                sex text not null)");*/
        //插入数据
       /* db.execSQL("insert into usertb(name,sex,age)value('张三','女'18)");
        db.execSQL("insert into usertb(name,sex,age)value('李四','女'19)");
        db.execSQL("insert into usertb(name,sex,age)value('王五','女'20)");*/
        //查询数据
       /* Cursor c = db.rawQuery("select * from usertb",null);
        if(c!=null){
            while (c.moveToNext()){
                Log.i("info", "_id" + c.getInt(c.getColumnIndex("_id")));
                Log.i("info", "name" + c.getString(c.getColumnIndex("name")));
                Log.i("info", "age" + c.getInt(c.getColumnIndex("age")));
                Log.i("info", "sex" + c.getString(c.getColumnIndex("sex")));
                Log.i("info","!!!!!!!!!!!!!!!!!!");
            }
            c.close();
        }
        db.close();*/
        /*方法2*/
       /*SQLiteDatabase db = openOrCreateDatabase("stu.db",MODE_PRIVATE,null);
        db.execSQL("create table if not exists stutb" +
                "(_id integer primary key autoincrement," +
                "name text not null" +
                "age integer not null,sex text not null)");
        ContentValues values = new ContentValues();
        values.put("name","张三");
        values.put("sex","男");
        values.put("age","18");
        long rowId = db.insert("stutb",null,values);
        values.clear();
        values.put("name","李四");
        values.put("sex","男");
        values.put("age","20");
        db.insert("stutb",null,values);
        values.clear();
        values.put("name","赵丽");
        values.put("sex","女");
        values.put("age","19");
        db.insert("stutb",null,values);
        values.clear();
        values.put("name","万三");
        values.put("sex","男");
        values.put("age","22");
        db.insert("stutb",null,values);
        values.clear();
        values.put("name","赵红");
        values.put("sex","女");
        values.put("age","21");
        db.insert("stutb",null,values);
        values.put("sex","女");
        db.update("stutb",values,"_id>?",new String[]{"3"});//将id大于3的性别改为女
        db.delete("stutb","name like ?",new String[]{"%丽%"});//删除带有“红”的数据
        Cursor c = db.query("stutb",null,"_id>?",new String[]{"0"},null,null,"name");
        if(c!=null){
            String [] columns = c.getColumnNames();
            while(c.moveToNext()){
                for(String columnName:columns){
                    Log.i("info",c.getString(c.getColumnIndex(columnName)));
                }
                c.close();
            }
            db.close();
        }*/

       /*方法3*/
        /*DBOpenHelper helper = new DBOpenHelper(MainActivity.this,"stu.db");
        //helper.getReadableDatabase();//获取一个只读的数据库 只能查询 不能写入，不能更新
        SQLiteDatabase db = helper.getWritableDatabase();
        Cursor c = db.rawQuery("select * from stutb",null);
        if(c!=null){
            String[] cols = c.getColumnNames();
            while(c.moveToNext()){
                for(String ColumnName : cols){
                    Log.i("info",ColumnName+":"+c.getString(c.getColumnIndex(ColumnName)));

                }
            }
        }*/
        /*方法4文件存储*/
       /* File file = new File("/mnt/sdcard/test");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            Toast.makeText(MainActivity.this, "文件已经存在", Toast.LENGTH_SHORT).show();
        }
        file.delete();*/

       /* File file = this.getFilesDir();//当前程序默认存储目录
        Log.i("info",file.toString());*/

        //File file = this.getCacheDir();
        //默认的缓存文件存放位置
        //把一些不是非常重要的文件在此处创建使用
        //如果手机的存储不足的时候，系统或自动删除APP的cache目录的数据
        //Log.i("info",file.toString());

        //File file = this.getDir("immoc",MODE_PRIVATE);
        // Log.i("info",file.toString());

        /*可以得到外部的存储位置，该位置的数据跟内置的使用是一样的
        * 如果APP卸载了，这里面的数据也会自动清除掉*/
        //File file = this.getExternalCacheDir();
        //Log.i("info",file.toString());

        //如果开发者不遵守这样的规则，卸载之后将会残留很多垃圾
    }
   
}