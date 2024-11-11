package com.example.bookreader.screens.home;

import com.google.firebase.firestore.Query;
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
public final class FireRepository_Factory implements Factory<FireRepository> {
  private final Provider<Query> queryBookProvider;

  public FireRepository_Factory(Provider<Query> queryBookProvider) {
    this.queryBookProvider = queryBookProvider;
  }

  @Override
  public FireRepository get() {
    return newInstance(queryBookProvider.get());
  }

  public static FireRepository_Factory create(Provider<Query> queryBookProvider) {
    return new FireRepository_Factory(queryBookProvider);
  }

  public static FireRepository newInstance(Query queryBook) {
    return new FireRepository(queryBook);
  }
}
