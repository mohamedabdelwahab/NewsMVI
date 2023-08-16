// Generated by Dagger (https://dagger.dev).
package com.mohamed.domain.usecases.identity;

import com.mohamed.domain.repositories.ISharedPrefrance;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class GetTokenUseCase_Factory implements Factory<GetTokenUseCase> {
  private final Provider<ISharedPrefrance> iSharedPrefranceProvider;

  public GetTokenUseCase_Factory(Provider<ISharedPrefrance> iSharedPrefranceProvider) {
    this.iSharedPrefranceProvider = iSharedPrefranceProvider;
  }

  @Override
  public GetTokenUseCase get() {
    return newInstance(iSharedPrefranceProvider.get());
  }

  public static GetTokenUseCase_Factory create(
      Provider<ISharedPrefrance> iSharedPrefranceProvider) {
    return new GetTokenUseCase_Factory(iSharedPrefranceProvider);
  }

  public static GetTokenUseCase newInstance(ISharedPrefrance iSharedPrefrance) {
    return new GetTokenUseCase(iSharedPrefrance);
  }
}