package android.support.v4.media;

import android.media.browse.MediaBrowser.MediaItem;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

class ParceledListSliceAdapterApi21 {
    private static Constructor sConstructor;

    static {
        ReflectiveOperationException e;
        try {
            sConstructor = Class.forName("android.content.pm.ParceledListSlice").getConstructor(new Class[]{List.class});
        } catch (ClassNotFoundException e2) {
            e = e2;
            e.printStackTrace();
        } catch (NoSuchMethodException e3) {
            e = e3;
            e.printStackTrace();
        }
    }

    private ParceledListSliceAdapterApi21() {
    }

    static Object newInstance(List<MediaItem> list) {
        ReflectiveOperationException e;
        try {
            return sConstructor.newInstance(new Object[]{list});
        } catch (InstantiationException e2) {
            e = e2;
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e3) {
            e = e3;
            e.printStackTrace();
            return null;
        } catch (InvocationTargetException e4) {
            e = e4;
            e.printStackTrace();
            return null;
        }
    }
}
