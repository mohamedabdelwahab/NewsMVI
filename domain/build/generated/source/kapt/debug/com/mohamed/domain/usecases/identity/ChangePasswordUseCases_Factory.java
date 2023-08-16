// Generated by Dagger (https://dagger.dev).
package com.mohamed.domain.usecases.identity;

import com.mohamed.domain.repositories.IdentityRepository;
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
public final class ChangePasswordUseCases_Factory implements Factory<ChangePasswordUseCases> {
  private final Provider<IdentityRepository> identityRepositoryProvider;

  public ChangePasswordUseCases_Factory(Provider<IdentityRepository> identityRepositoryProvider) {
    this.identityRepositoryProvider = identityRepositoryProvider;
  }

  @Override
  public ChangePasswordUseCases get() {
    return newInstance(identityRepositoryProvider.get());
  }

  public static ChangePasswordUseCases_Factory create(
      Provider<IdentityRepository> identityRepositoryProvider) {
    return new ChangePasswordUseCases_Factory(identityRepositoryProvider);
  }

  public static ChangePasswordUseCases newInstance(IdentityRepository identityRepository) {
    return new ChangePasswordUseCases(identityRepository);
  }
}