package com.example.bookreader.di;

import com.example.bookreader.network.BooksApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class AppModule_ProvideBookApiFactory implements Factory<BooksApi> {
  @Override
  public BooksApi get() {
    return provideBookApi();
  }

  public static AppModule_ProvideBookApiFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static BooksApi provideBookApi() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideBookApi());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideBookApiFactory INSTANCE = new AppModule_ProvideBookApiFactory();
  }
}
