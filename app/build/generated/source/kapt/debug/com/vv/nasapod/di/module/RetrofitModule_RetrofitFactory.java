// Generated by Dagger (https://dagger.dev).
package com.vv.nasapod.di.module;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RetrofitModule_RetrofitFactory implements Factory<Retrofit> {
  private final RetrofitModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  private final Provider<Gson> gsonProvider;

  public RetrofitModule_RetrofitFactory(RetrofitModule module,
      Provider<OkHttpClient> okHttpClientProvider, Provider<Gson> gsonProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public Retrofit get() {
    return retrofit(module, okHttpClientProvider.get(), gsonProvider.get());
  }

  public static RetrofitModule_RetrofitFactory create(RetrofitModule module,
      Provider<OkHttpClient> okHttpClientProvider, Provider<Gson> gsonProvider) {
    return new RetrofitModule_RetrofitFactory(module, okHttpClientProvider, gsonProvider);
  }

  public static Retrofit retrofit(RetrofitModule instance, OkHttpClient okHttpClient, Gson gson) {
    return Preconditions.checkNotNull(instance.retrofit(okHttpClient, gson), "Cannot return null from a non-@Nullable @Provides method");
  }
}
