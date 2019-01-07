package com.apache.dubbo.freeze.dubbo.Factory;

public interface MyExtensionFactory {
    <T> T getExtension(Class<T> type, String name);
}
