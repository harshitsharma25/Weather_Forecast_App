package com.example.bookreader.di;

import com.example.bookreader.network.BooksApi;
import com.example.bookreader.repository.BooksRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvideBookRepositoryFactory implements Factory<BooksRepository> {
  private final Provider<BooksApi> apiProvider;

  public AppModule_ProvideBookRepositoryFactory(Provider<BooksApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public BooksRepository get() {
    return provideBookRepository(apiProvider.get());
  }

  public static AppModule_ProvideBookRepositoryFactory create(Provider<BooksApi> apiProvider) {
    return new AppModule_ProvideBookRepositoryFactory(apiProvider);
  }

  public static BooksRepository provideBookRepository(BooksApi api) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideBookRepository(api));
  }
}
