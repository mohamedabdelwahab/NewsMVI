// Generated by Dagger (https://dagger.dev).
package com.mohamed.data.di;

import com.mohamed.data.source.remote.NewsService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class NetworkModule_ProvideDriverApiFactory implements Factory<NewsService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideDriverApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public NewsService get() {
    return provideDriverApi(retrofitProvider.get());
  }

  public static NetworkModule_ProvideDriverApiFactory create(Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideDriverApiFactory(retrofitProvider);
  }

  public static NewsService provideDriverApi(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideDriverApi(retrofit));
  }
}
