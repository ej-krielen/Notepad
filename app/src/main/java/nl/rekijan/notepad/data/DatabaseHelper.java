package nl.rekijan.notepad.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static nl.rekijan.notepad.utilities.Constants.*;

/**
 * Helper class for the database
 *
 * @author Erik-Jan Krielen ej.krielen@gmail.com
 * @since 10-7-2016
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "simple_note_app.db";
    private static final int DATABASE_VERSION = 1;


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_NOTE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + NOTES_TABLE);
        onCreate(db);
    }

    private static final String CREATE_TABLE_NOTE = "create table "
            + NOTES_TABLE
            + "("
            + COLUMN_ID + " integer primary key autoincrement, "
            + COLUMN_TITLE + " text not null, "
            + COLUMN_CONTENT + " text not null, "
            + COLUMN_MODIFIED_TIME + " integer not null, "
            + COLUMN_CREATED_TIME + " integer not null" + ")";
}