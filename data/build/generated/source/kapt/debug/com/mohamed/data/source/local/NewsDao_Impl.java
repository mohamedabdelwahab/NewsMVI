package com.mohamed.data.source.local;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.paging.PagingSource;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetPagingSource;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.mohamed.data.entity.SearchNews;
import com.mohamed.domain.entity.NewsDto;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NewsDao_Impl implements NewsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<NewsDto> __insertionAdapterOfNewsDto;

  private final EntityInsertionAdapter<SearchNews> __insertionAdapterOfSearchNews;

  private final SharedSQLiteStatement __preparedStmtOfDeleteSearchResultsForQuery;

  public NewsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNewsDto = new EntityInsertionAdapter<NewsDto>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `news` (`url`,`publishedAt`,`author`,`urlToImage`,`description`,`title`,`content`,`source`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NewsDto value) {
        if (value.getUrl() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getUrl());
        }
        if (value.getPublishedAt() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPublishedAt());
        }
        if (value.getAuthor() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAuthor());
        }
        if (value.getUrlToImage() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getUrlToImage());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDescription());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTitle());
        }
        if (value.getContent() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getContent());
        }
        if (value.getSource() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getSource());
        }
      }
    };
    this.__insertionAdapterOfSearchNews = new EntityInsertionAdapter<SearchNews>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `search_news` (`searchQuery`,`newsUrl`,`sort`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SearchNews value) {
        if (value.getSearchQuery() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getSearchQuery());
        }
        if (value.getNewsUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNewsUrl());
        }
        stmt.bindLong(3, value.getSort());
      }
    };
    this.__preparedStmtOfDeleteSearchResultsForQuery = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM search_news WHERE searchQuery = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertArticles(final List<NewsDto> articles,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfNewsDto.insert(articles);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insertSearchResults(final List<SearchNews> searchResults,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSearchNews.insert(searchResults);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteSearchResultsForQuery(final String query,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteSearchResultsForQuery.acquire();
        int _argIndex = 1;
        if (query == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, query);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteSearchResultsForQuery.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public PagingSource<Integer, NewsDto> getSearchResultArticlesPaged(final String query) {
    final String _sql = "SELECT `url`, `publishedAt`, `author`, `urlToImage`, `description`, `title`, `content`, `source` FROM (SELECT * FROM search_news INNER JOIN news ON newsUrl = url WHERE searchQuery = ? ORDER BY sort)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    return new LimitOffsetPagingSource<NewsDto>(_statement, __db, "search_news", "news") {
      @Override
      protected List<NewsDto> convertRows(Cursor cursor) {
        final int _cursorIndexOfUrl = 0;
        final int _cursorIndexOfPublishedAt = 1;
        final int _cursorIndexOfAuthor = 2;
        final int _cursorIndexOfUrlToImage = 3;
        final int _cursorIndexOfDescription = 4;
        final int _cursorIndexOfTitle = 5;
        final int _cursorIndexOfContent = 6;
        final int _cursorIndexOfSource = 7;
        final List<NewsDto> _result = new ArrayList<NewsDto>(cursor.getCount());
        while(cursor.moveToNext()) {
          final NewsDto _item;
          final String _tmpUrl;
          if (cursor.isNull(_cursorIndexOfUrl)) {
            _tmpUrl = null;
          } else {
            _tmpUrl = cursor.getString(_cursorIndexOfUrl);
          }
          final String _tmpPublishedAt;
          if (cursor.isNull(_cursorIndexOfPublishedAt)) {
            _tmpPublishedAt = null;
          } else {
            _tmpPublishedAt = cursor.getString(_cursorIndexOfPublishedAt);
          }
          final String _tmpAuthor;
          if (cursor.isNull(_cursorIndexOfAuthor)) {
            _tmpAuthor = null;
          } else {
            _tmpAuthor = cursor.getString(_cursorIndexOfAuthor);
          }
          final String _tmpUrlToImage;
          if (cursor.isNull(_cursorIndexOfUrlToImage)) {
            _tmpUrlToImage = null;
          } else {
            _tmpUrlToImage = cursor.getString(_cursorIndexOfUrlToImage);
          }
          final String _tmpDescription;
          if (cursor.isNull(_cursorIndexOfDescription)) {
            _tmpDescription = null;
          } else {
            _tmpDescription = cursor.getString(_cursorIndexOfDescription);
          }
          final String _tmpTitle;
          if (cursor.isNull(_cursorIndexOfTitle)) {
            _tmpTitle = null;
          } else {
            _tmpTitle = cursor.getString(_cursorIndexOfTitle);
          }
          final String _tmpContent;
          if (cursor.isNull(_cursorIndexOfContent)) {
            _tmpContent = null;
          } else {
            _tmpContent = cursor.getString(_cursorIndexOfContent);
          }
          final String _tmpSource;
          if (cursor.isNull(_cursorIndexOfSource)) {
            _tmpSource = null;
          } else {
            _tmpSource = cursor.getString(_cursorIndexOfSource);
          }
          _item = new NewsDto(_tmpUrl,_tmpPublishedAt,_tmpAuthor,_tmpUrlToImage,_tmpDescription,_tmpTitle,_tmpContent,_tmpSource);
          _result.add(_item);
        }
        return _result;
      }
    };
  }

  @Override
  public Object getLastPosition(final String searchQuery,
      final Continuation<? super Integer> continuation) {
    final String _sql = "SELECT MAX(sort) FROM search_news WHERE searchQuery = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (searchQuery == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, searchQuery);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
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
