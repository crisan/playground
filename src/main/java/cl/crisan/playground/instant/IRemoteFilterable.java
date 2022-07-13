package cl.crisan.playground.instant;

import javax.mail.search.SearchTerm;

/**
 * interfaz que nos permite filtrar los mensajes en el servidor
 */
public interface IRemoteFilterable {
    SearchTerm getFilter();

}
