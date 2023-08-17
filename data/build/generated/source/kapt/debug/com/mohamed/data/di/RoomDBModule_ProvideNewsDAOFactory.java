// Generated by Dagger (https://dagger.dev).
package com.mohamed.data.di;

import com.mohamed.data.source.local.NewsDao;
import com.mohamed.data.source.local.NewsDatabase;
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
public final class RoomDBModule_ProvideNewsDAOFactory implements Factory<NewsDao> {
  private final Provider<NewsDatabase> productsRoomDBProvider;

  public RoomDBModule_ProvideNewsDAOFactory(Provider<NewsDatabase> productsRoomDBProvider) {
    this.productsRoomDBProvider = productsRoomDBProvider;
  }

  @Override
  public NewsDao get() {
    return provideNewsDAO(productsRoomDBProvider.get());
  }

  public static RoomDBModule_ProvideNewsDAOFactory create(
      Provider<NewsDatabase> productsRoomDBProvider) {
    return new RoomDBModule_ProvideNewsDAOFactory(productsRoomDBProvider);
  }

  public static NewsDao provideNewsDAO(NewsDatabase productsRoomDB) {
    return Preconditions.checkNotNullFromProvides(RoomDBModule.INSTANCE.provideNewsDAO(productsRoomDB));
  }
}