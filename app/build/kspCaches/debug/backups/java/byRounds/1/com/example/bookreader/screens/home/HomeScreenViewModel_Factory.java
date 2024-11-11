package com.example.bookreader.screens.home;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation"
})
public final class HomeScreenViewModel_Factory implements Factory<HomeScreenViewModel> {
  private final Provider<FireRepository> repositoryProvider;

  public HomeScreenViewModel_Factory(Provider<FireRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public HomeScreenViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static HomeScreenViewModel_Factory create(Provider<FireRepository> repositoryProvider) {
    return new HomeScreenViewModel_Factory(repositoryProvider);
  }

  public static HomeScreenViewModel newInstance(FireRepository repository) {
    return new HomeScreenViewModel(repository);
  }
}
