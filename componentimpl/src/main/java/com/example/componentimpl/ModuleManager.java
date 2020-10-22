package com.example.componentimpl;

import androidx.annotation.NonNull;

import java.util.HashMap;
import java.util.Map;

public class ModuleManager {
    /**
     * 单例对象
     */
    private static volatile ModuleManager instance;

    /**
     * 获取单例对象
     *
     * @return
     */
    public static ModuleManager getInstance() {
        if (instance == null) {
            synchronized (ModuleManager.class) {
                if (instance == null) {
                    instance = new ModuleManager();
                }
            }
        }
        return instance;
    }

    private static Map<String, IComponentHostApplication> moduleApplicationMap = new HashMap<>();

    public void register(@NonNull IComponentHostApplication moduleApp) {
        Utils.checkNullPointer(moduleApp);
        if (moduleApplicationMap.containsKey(moduleApp.getHost())) {
        } else {
            moduleApplicationMap.put(moduleApp.getHost(), moduleApp);
            moduleApp.onCreate(Component.getApplication());
        }
    }

    public void register(@NonNull String host) {
        if (moduleApplicationMap.containsKey(host)) {
            return;
        } else {
            IComponentHostApplication moduleApplication = findModuleApplication(host);
            if (moduleApplication == null) {
            } else {
                register(moduleApplication);
            }
        }
    }

    public static IComponentHostApplication findModuleApplication(@NonNull String host) {
        IComponentHostApplication result = null;
        return result;
    }

    public void unregister(@NonNull IComponentHostApplication moduleApp) {
        Utils.checkNullPointer(moduleApp);
        moduleApplicationMap.remove(moduleApp.getHost());
        moduleApp.onDestroy();
    }
}
