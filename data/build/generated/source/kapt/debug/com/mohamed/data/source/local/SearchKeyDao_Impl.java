package com.mohamed.data.source.local;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.mohamed.data.entity.SearchKey;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SearchKeyDao_Impl implements SearchKeyDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SearchKey> __insertionAdapterOfSearchKey;

  public SearchKeyDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSearchKey = new EntityInsertionAdapter<SearchKey>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `search_keys` (`searchQuery`,`nextPageKey`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SearchKey value) {
        if (value.getSearchQuery() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getSearchQuery());
        }
        stmt.bindLong(2, value.getNextPageKey());
      }
    };
  }

  @Override
  public Object insertRemoteKey(final SearchKey remoteKey,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSearchKey.insert(remoteKey);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getRemoteKey(final String searchQuery,
      final Continuation<? super SearchKey> continuation) {
    final String _sql = "SELECT * FROM search_keys WHERE searchQuery = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (searchQuery == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, searchQuery);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<SearchKey>() {
      @Override
      public SearchKey call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfSearchQuery = CursorUtil.getColumnIndexOrThrow(_cursor, "searchQuery");
          final int _cursorIndexOfNextPageKey = CursorUtil.getColumnIndexOrThrow(_cursor, "nextPageKey");
          final SearchKey _result;
          if(_cursor.moveToFirst()) {
            final String _tmpSearchQuery;
            if (_cursor.isNull(_cursorIndexOfSearchQuery)) {
              _tmpSearchQuery = null;
            } else {
              _tmpSearchQuery = _cursor.getString(_cursorIndexOfSearchQuery);
            }
            final int _tmpNextPageKey;
            _tmpNextPageKey = _cursor.getInt(_cursorIndexOfNextPageKey);
            _result = new SearchKey(_tmpSearchQuery,_tmpNextPageKey);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
