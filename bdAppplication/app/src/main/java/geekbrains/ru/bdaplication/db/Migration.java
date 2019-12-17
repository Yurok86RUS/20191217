package geekbrains.ru.bdaplication.db;

import android.database.sqlite.SQLiteDatabase;

interface Migration {
    boolean migrate(SQLiteDatabase db);
}
