package geekbrains.ru.bdaplication.db;

import android.database.sqlite.SQLiteDatabase;

import java.io.Closeable;
import java.io.IOException;

class DataReader implements Closeable {
    public DataReader(SQLiteDatabase database) {
    }

    @Override
    public void close() throws IOException {

    }
}
