package asana;

import rx.Observable;

/**
 * @author Pablo
 * @since 17/06/2016
 */
public interface AsanaApi {

    Observable<String> me();

}
