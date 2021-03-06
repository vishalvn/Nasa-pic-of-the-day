// Generated by Dagger (https://dagger.dev).
package com.vv.nasapod.di;

import android.content.Context;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;
import com.vv.nasapod.di.module.ApplicationModule;
import com.vv.nasapod.di.module.ApplicationModule_GsonFactory;
import com.vv.nasapod.di.module.ApplicationModule_NewsApiServicesFactory;
import com.vv.nasapod.di.module.NetworkModule;
import com.vv.nasapod.di.module.NetworkModule_LoggingInterceptorFactory;
import com.vv.nasapod.di.module.NetworkModule_OkHttpClientFactory;
import com.vv.nasapod.di.module.PicassoModule;
import com.vv.nasapod.di.module.PicassoModule_PicassoFactory;
import com.vv.nasapod.di.module.RetrofitModule;
import com.vv.nasapod.di.module.RetrofitModule_RetrofitFactory;
import com.vv.nasapod.network.NasaApiInterface;
import com.vv.nasapod.ui.PhotoViewScreen;
import com.vv.nasapod.ui.PhotoViewScreen_MembersInjector;
import com.vv.nasapod.ui.VideoViewScreen;
import com.vv.nasapod.ui.VideoViewScreen_MembersInjector;
import com.vv.nasapod.ui.npod.NasaPODRepository;
import com.vv.nasapod.ui.npod.NasaPODScreen;
import com.vv.nasapod.ui.npod.NasaPODScreen_MembersInjector;
import com.vv.nasapod.ui.npod.NasaPODViewModelFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerMainComponent implements MainComponent {
  private Provider<HttpLoggingInterceptor> loggingInterceptorProvider;

  private Provider<OkHttpClient> okHttpClientProvider;

  private Provider<Gson> gsonProvider;

  private Provider<Retrofit> retrofitProvider;

  private Provider<NasaApiInterface> newsApiServicesProvider;

  private Provider<Context> contextProvider;

  private Provider<Picasso> picassoProvider;

  private DaggerMainComponent(ApplicationModule applicationModuleParam,
      NetworkModule networkModuleParam, PicassoModule picassoModuleParam,
      RetrofitModule retrofitModuleParam, Context contextParam) {

    initialize(applicationModuleParam, networkModuleParam, picassoModuleParam, retrofitModuleParam, contextParam);
  }

  public static MainComponent.Builder builder() {
    return new Builder();
  }

  private NasaPODRepository getNasaPODRepository() {
    return new NasaPODRepository(newsApiServicesProvider.get());}

  private NasaPODViewModelFactory getNasaPODViewModelFactory() {
    return new NasaPODViewModelFactory(getNasaPODRepository());}

  @SuppressWarnings("unchecked")
  private void initialize(final ApplicationModule applicationModuleParam,
      final NetworkModule networkModuleParam, final PicassoModule picassoModuleParam,
      final RetrofitModule retrofitModuleParam, final Context contextParam) {
    this.loggingInterceptorProvider = DoubleCheck.provider(NetworkModule_LoggingInterceptorFactory.create(networkModuleParam));
    this.okHttpClientProvider = DoubleCheck.provider(NetworkModule_OkHttpClientFactory.create(networkModuleParam, loggingInterceptorProvider));
    this.gsonProvider = DoubleCheck.provider(ApplicationModule_GsonFactory.create(applicationModuleParam));
    this.retrofitProvider = DoubleCheck.provider(RetrofitModule_RetrofitFactory.create(retrofitModuleParam, okHttpClientProvider, gsonProvider));
    this.newsApiServicesProvider = DoubleCheck.provider(ApplicationModule_NewsApiServicesFactory.create(applicationModuleParam, retrofitProvider));
    this.contextProvider = InstanceFactory.create(contextParam);
    this.picassoProvider = DoubleCheck.provider(PicassoModule_PicassoFactory.create(picassoModuleParam, contextProvider));
  }

  @Override
  public void injectApodScreen(NasaPODScreen nasaAPODScreen) {
    injectNasaPODScreen(nasaAPODScreen);}

  @Override
  public void injectPhotoScreen(PhotoViewScreen photoViewScreen) {
    injectPhotoViewScreen(photoViewScreen);}

  @Override
  public void injectVideoScreen(VideoViewScreen videoViewScreen) {
    injectVideoViewScreen(videoViewScreen);}

  private NasaPODScreen injectNasaPODScreen(NasaPODScreen instance) {
    NasaPODScreen_MembersInjector.injectNasaAPODViewModelFactory(instance, getNasaPODViewModelFactory());
    NasaPODScreen_MembersInjector.injectPicasso(instance, picassoProvider.get());
    return instance;
  }

  private PhotoViewScreen injectPhotoViewScreen(PhotoViewScreen instance) {
    PhotoViewScreen_MembersInjector.injectNasaPODViewModelFactory(instance, getNasaPODViewModelFactory());
    PhotoViewScreen_MembersInjector.injectPicasso(instance, picassoProvider.get());
    return instance;
  }

  private VideoViewScreen injectVideoViewScreen(VideoViewScreen instance) {
    VideoViewScreen_MembersInjector.injectNasaAPODViewModelFactory(instance, getNasaPODViewModelFactory());
    VideoViewScreen_MembersInjector.injectPicasso(instance, picassoProvider.get());
    return instance;
  }

  private static final class Builder implements MainComponent.Builder {
    private Context context;

    @Override
    public Builder context(Context context) {
      this.context = Preconditions.checkNotNull(context);
      return this;
    }

    @Override
    public MainComponent build() {
      Preconditions.checkBuilderRequirement(context, Context.class);
      return new DaggerMainComponent(new ApplicationModule(), new NetworkModule(), new PicassoModule(), new RetrofitModule(), context);
    }
  }
}
