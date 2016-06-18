import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

/**
 * @author Pablo
 * @since 17/06/2016
 */
public class Trellana {

    private static final Retrofit.Builder BUILDER = new Retrofit.Builder()
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create());
    private static final String TRELLO_URL = "";
    private static final String ASANA_URL = "";

    public static void main(String args[]) {
        Observable.just(ASANA_URL)
                .map(url -> BUILDER.baseUrl(url).build())
                .subscribe();
    }

}
