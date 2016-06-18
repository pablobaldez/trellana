package asana;

import retrofit2.Retrofit;

/**
 * @author Pablo
 * @since 17/06/2016
 */
public class AsanaLoader {

    private final Retrofit retrofit;

    public AsanaLoader(Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    public void assign() {
        AsanaApi api = retrofit.create(AsanaApi.class);

    }

    public static void setUp(Retrofit retrofit) {
        //0/8552713987683c871727d8fb77f04261
    }
}
