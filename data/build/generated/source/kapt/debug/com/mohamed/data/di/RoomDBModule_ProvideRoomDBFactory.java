// Generated by Dagger (https://dagger.dev).
package com.mohamed.data.di;

import android.content.Context;
import com.mohamed.data.source.local.NewsDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class RoomDBModule_ProvideRoomDBFactory implements Factory<NewsDatabase> {
  private final Provider<Context> appContextProvider;

  public RoomDBModule_ProvideRoomDBFactory(Provider<Context> appContextProvider) {
    this.appContextProvider = appContextProvider;
  }

  @Override
  public NewsDatabase get() {
    return provideRoomDB(appContextProvider.get());
  }

  public static RoomDBModule_ProvideRoomDBFactory create(Provider<Context> appContextProvider) {
    return new RoomDBModule_ProvideRoomDBFactory(appContextProvider);
  }

  public static NewsDatabase provideRoomDB(Context appContext) {
    return Preconditions.checkNotNullFromProvides(RoomDBModule.INSTANCE.provideRoomDB(appContext));
  }
}