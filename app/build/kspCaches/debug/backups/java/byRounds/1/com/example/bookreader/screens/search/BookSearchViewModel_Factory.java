package com.example.bookreader.screens.search;

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
public final class BookSearchViewModel_Factory implements Factory<BookSearchViewModel> {
  private final Provider<BooksRepository> repositoryProvider;

  public BookSearchViewModel_Factory(Provider<BooksRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public BookSearchViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static BookSearchViewModel_Factory create(Provider<BooksRepository> repositoryProvider) {
    return new BookSearchViewModel_Factory(repositoryProvider);
  }

  public static BookSearchViewModel newInstance(BooksRepository repository) {
    return new BookSearchViewModel(repository);
  }
}
