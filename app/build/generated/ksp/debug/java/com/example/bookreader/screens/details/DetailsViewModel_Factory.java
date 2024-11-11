package com.example.bookreader.screens.details;

import com.example.bookreader.repository.BooksRepository;
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
public final class DetailsViewModel_Factory implements Factory<DetailsViewModel> {
  private final Provider<BooksRepository> repositoryProvider;

  public DetailsViewModel_Factory(Provider<BooksRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public DetailsViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static DetailsViewModel_Factory create(Provider<BooksRepository> repositoryProvider) {
    return new DetailsViewModel_Factory(repositoryProvider);
  }

  public static DetailsViewModel newInstance(BooksRepository repository) {
    return new DetailsViewModel(repository);
  }
}
