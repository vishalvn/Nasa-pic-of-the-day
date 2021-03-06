// Generated by Dagger (https://dagger.dev).
package com.vv.nasapod.di.module;

import android.content.Context;
import com.vv.nasapod.data.SessionManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_SessionManagerFactory implements Factory<SessionManager> {
  private final ApplicationModule module;

  private final Provider<Context> contextProvider;

  public ApplicationModule_SessionManagerFactory(ApplicationModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public SessionManager get() {
    return sessionManager(module, contextProvider.get());
  }

  public static ApplicationModule_SessionManagerFactory create(ApplicationModule module,
      Provider<Context> contextProvider) {
    return new ApplicationModule_SessionManagerFactory(module, contextProvider);
  }

  public static SessionManager sessionManager(ApplicationModule instance, Context context) {
    return Preconditions.checkNotNull(instance.sessionManager(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
