// Generated by Dagger (https://dagger.dev).
package com.vv.nasapod.di.module;

import com.vv.nasapod.network.NasaApiInterface;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_NewsApiServicesFactory implements Factory<NasaApiInterface> {
  private final ApplicationModule module;

  private final Provider<Retrofit> retrofitProvider;

  public ApplicationModule_NewsApiServicesFactory(ApplicationModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public NasaApiInterface get() {
    return newsApiServices(module, retrofitProvider.get());
  }

  public static ApplicationModule_NewsApiServicesFactory create(ApplicationModule module,
      Provider<Retrofit> retrofitProvider) {
    return new ApplicationModule_NewsApiServicesFactory(module, retrofitProvider);
  }

  public static NasaApiInterface newsApiServices(ApplicationModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNull(instance.newsApiServices(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}