package util;

import play.mvc.Http;
import play.mvc.Http.Context;
import play.mvc.Result;
import play.mvc.Security;

public class Secured extends Security.Authenticator {

    /**
     * Механизм аутентификации
     *
     * @param ctx контекст запроса.
     * @return строку-email для текущего пользователя, хранящуюся в сессии при аутентификации. В случае ее отсутствия возвращает null
     */
    @Override
    public String getUsername(Context ctx) {
        Http.Session session = ctx.session();
        //todo вернуть ключ "email" из сессии
        return session.get("email");
    }

    /**
     * Перенаправление в случае неуспеха аутентификации. Как правило перенаправляет на форму логина
     *
     * @param ctx контекст
     * @return перенаправление на страницу логина
     */
    @Override
    public Result onUnauthorized(Context ctx) {
        Http.Session session = ctx.session();
        if (getUsername(ctx)!= null){
            return null;
        }else{
            return redirect(controllers.routes.Auth.login());
        }

    }

}