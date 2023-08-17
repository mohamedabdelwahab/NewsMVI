package com.mohamed.data.source.local;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NewsDatabase_Impl extends NewsDatabase {
  private volatile NewsDao _newsDao;

  private volatile SearchKeyDao _searchKeyDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `news` (`url` TEXT NOT NULL, `publishedAt` TEXT, `author` TEXT, `urlToImage` TEXT, `description` TEXT, `title` TEXT, `content` TEXT, `source` TEXT, PRIMARY KEY(`url`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `search_news` (`searchQuery` TEXT NOT NULL, `newsUrl` TEXT NOT NULL, `sort` INTEGER NOT NULL, PRIMARY KEY(`searchQuery`, `newsUrl`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `search_keys` (`searchQuery` TEXT NOT NULL, `nextPageKey` INTEGER NOT NULL, PRIMARY KEY(`searchQuery`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '295b10414f359c9749195c4182ed52ae')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `news`");
        _db.execSQL("DROP TABLE IF EXISTS `search_news`");
        _db.execSQL("DROP TABLE IF EXISTS `search_keys`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsNews = new HashMap<String, TableInfo.Column>(8);
        _columnsNews.put("url", new TableInfo.Column("url", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNews.put("publishedAt", new TableInfo.Column("publishedAt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNews.put("author", new TableInfo.Column("author", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNews.put("urlToImage", new TableInfo.Column("urlToImage", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNews.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNews.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNews.put("content", new TableInfo.Column("content", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNews.put("source", new TableInfo.Column("source", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysNews = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesNews = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoNews = new TableInfo("news", _columnsNews, _foreignKeysNews, _indicesNews);
        final TableInfo _existingNews = TableInfo.read(_db, "news");
        if (! _infoNews.equals(_existingNews)) {
          return new RoomOpenHelper.ValidationResult(false, "news(com.mohamed.domain.entity.NewsDto).\n"
                  + " Expected:\n" + _infoNews + "\n"
                  + " Found:\n" + _existingNews);
        }
        final HashMap<String, TableInfo.Column> _columnsSearchNews = new HashMap<String, TableInfo.Column>(3);
        _columnsSearchNews.put("searchQuery", new TableInfo.Column("searchQuery", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSearchNews.put("newsUrl", new TableInfo.Column("newsUrl", "TEXT", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSearchNews.put("sort", new TableInfo.Column("sort", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSearchNews = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSearchNews = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSearchNews = new TableInfo("search_news", _columnsSearchNews, _foreignKeysSearchNews, _indicesSearchNews);
        final TableInfo _existingSearchNews = TableInfo.read(_db, "search_news");
        if (! _infoSearchNews.equals(_existingSearchNews)) {
          return new RoomOpenHelper.ValidationResult(false, "search_news(com.mohamed.data.entity.SearchNews).\n"
                  + " Expected:\n" + _infoSearchNews + "\n"
                  + " Found:\n" + _existingSearchNews);
        }
        final HashMap<String, TableInfo.Column> _columnsSearchKeys = new HashMap<String, TableInfo.Column>(2);
        _columnsSearchKeys.put("searchQuery", new TableInfo.Column("searchQuery", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSearchKeys.put("nextPageKey", new TableInfo.Column("nextPageKey", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSearchKeys = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSearchKeys = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSearchKeys = new TableInfo("search_keys", _columnsSearchKeys, _foreignKeysSearchKeys, _indicesSearchKeys);
        final TableInfo _existingSearchKeys = TableInfo.read(_db, "search_keys");
        if (! _infoSearchKeys.equals(_existingSearchKeys)) {
          return new RoomOpenHelper.ValidationResult(false, "search_keys(com.mohamed.data.entity.SearchKey).\n"
                  + " Expected:\n" + _infoSearchKeys + "\n"
                  + " Found:\n" + _existingSearchKeys);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "295b10414f359c9749195c4182ed52ae", "a26bf261de51df302238a132d808079a");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "news","search_news","search_keys");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `news`");
      _db.execSQL("DELETE FROM `search_news`");
      _db.execSQL("DELETE FROM `search_keys`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(NewsDao.class, NewsDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(SearchKeyDao.class, SearchKeyDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public NewsDao newsDao() {
    if (_newsDao != null) {
      return _newsDao;
    } else {
      synchronized(this) {
        if(_newsDao == null) {
          _newsDao = new NewsDao_Impl(this);
        }
        return _newsDao;
      }
    }
  }

  @Override
  public SearchKeyDao searchQueryRemoteKeyDao() {
    if (_searchKeyDao != null) {
      return _searchKeyDao;
    } else {
      synchronized(this) {
        if(_searchKeyDao == null) {
          _searchKeyDao = new SearchKeyDao_Impl(this);
        }
        return _searchKeyDao;
      }
    }
  }
}
