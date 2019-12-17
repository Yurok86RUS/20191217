package geekbrains.ru.bdaplication.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.List;

public class DataHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "WeatherHistory.db";
    public static final int DB_VERSION = 1;
    public static final String TABLE_NAME = "WeatherHistory";
    public static final String TABLE_TITLE = "City name";
    public static final String TABLE_ID = "_id";
    public static final String TABLE_DESC = "Temperature";
    public static final String HUMIDITY = "Humidity";
    List<Migration> migrations;

    public DataHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_NAME + " ( " + TABLE_ID +
                " INTEGER PRIMARY KEY AUTOINCREMENT," + TABLE_TITLE + "TEXT," + TABLE_DESC + "REAL );" );

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

        if (oldVersion == 1 && newVersion ==2){
            String upgradeStr= "ALTER TABLE " + TABLE_NAME + " ADD COLUMN " + HUMIDITY + "TEXT DEFAULT Humidity";
            sqLiteDatabase.execSQL(upgradeStr);
        }

    }
}
