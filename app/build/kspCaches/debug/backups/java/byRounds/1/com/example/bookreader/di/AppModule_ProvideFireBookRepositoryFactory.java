package com.example.bookreader.di;

import com.example.bookreader.screens.home.FireRepository;
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
public final class AppModule_ProvideFireBookRepositoryFactory implements Factory<FireRepository> {
  @Override
  public FireRepository get() {
    return provideFireBookRepository();
  }

  public static AppModule_ProvideFireBookRepositoryFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FireRepository provideFireBookRepository() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideFireBookRepository());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideFireBookRepositoryFactory INSTANCE = new AppModule_ProvideFireBookRepositoryFactory();
  }
}
