// Generated by Dagger (https://dagger.dev).
package com.mohamed.domain.usecases.onboarding_uscases;

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
public final class IsOnboaedingOpenUscase_Factory implements Factory<IsOnboaedingOpenUscase> {
  private final Provider<ISharedPrefrance> iSharedPrefranceProvider;

  public IsOnboaedingOpenUscase_Factory(Provider<ISharedPrefrance> iSharedPrefranceProvider) {
    this.iSharedPrefranceProvider = iSharedPrefranceProvider;
  }

  @Override
  public IsOnboaedingOpenUscase get() {
    return newInstance(iSharedPrefranceProvider.get());
  }

  public static IsOnboaedingOpenUscase_Factory create(
      Provider<ISharedPrefrance> iSharedPrefranceProvider) {
    return new IsOnboaedingOpenUscase_Factory(iSharedPrefranceProvider);
  }

  public static IsOnboaedingOpenUscase newInstance(ISharedPrefrance iSharedPrefrance) {
    return new IsOnboaedingOpenUscase(iSharedPrefrance);
  }
}
