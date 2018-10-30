// Generated by Dagger (https://google.github.io/dagger).
package com.example.admin.accessibilityservicetest.dagger2;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class TestModule_ProvideHostFactory implements Factory<Host> {
  private final TestModule module;

  public TestModule_ProvideHostFactory(TestModule module) {
    this.module = module;
  }

  @Override
  public Host get() {
    return provideInstance(module);
  }

  public static Host provideInstance(TestModule module) {
    return proxyProvideHost(module);
  }

  public static TestModule_ProvideHostFactory create(TestModule module) {
    return new TestModule_ProvideHostFactory(module);
  }

  public static Host proxyProvideHost(TestModule instance) {
    return Preconditions.checkNotNull(
        instance.provideHost(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
