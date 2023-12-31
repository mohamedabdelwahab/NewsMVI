// Generated by Dagger (https://dagger.dev).
package com.mohamed.data.di;

import com.mohamed.data.source.local.NewsDatabase;
import com.mohamed.data.source.local.SearchKeyDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class RoomDBModule_ProvideSearchDAOFactory implements Factory<SearchKeyDao> {
  private final Provider<NewsDatabase> productsRoomDBProvider;

  public RoomDBModule_ProvideSearchDAOFactory(Provider<NewsDatabase> productsRoomDBProvider) {
    this.productsRoomDBProvider = productsRoomDBProvider;
  }

  @Override
  public SearchKeyDao get() {
    return provideSearchDAO(productsRoomDBProvider.get());
  }

  public static RoomDBModule_ProvideSearchDAOFactory create(
      Provider<NewsDatabase> productsRoomDBProvider) {
    return new RoomDBModule_ProvideSearchDAOFactory(productsRoomDBProvider);
  }

  public static SearchKeyDao provideSearchDAO(NewsDatabase productsRoomDB) {
    return Preconditions.checkNotNullFromProvides(RoomDBModule.INSTANCE.provideSearchDAO(productsRoomDB));
  }
}
