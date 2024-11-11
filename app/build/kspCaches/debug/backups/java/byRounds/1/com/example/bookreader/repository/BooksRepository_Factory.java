package com.example.bookreader.repository;

import com.example.bookreader.network.BooksApi;
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
public final class BooksRepository_Factory implements Factory<BooksRepository> {
  private final Provider<BooksApi> apiProvider;

  public BooksRepository_Factory(Provider<BooksApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public BooksRepository get() {
    return newInstance(apiProvider.get());
  }

  public static BooksRepository_Factory create(Provider<BooksApi> apiProvider) {
    return new BooksRepository_Factory(apiProvider);
  }

  public static BooksRepository newInstance(BooksApi api) {
    return new BooksRepository(api);
  }
}
