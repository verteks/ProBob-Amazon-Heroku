
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(loginForm: Form[Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.26*/("""
    """),_display_(Seq[Any](/*2.6*/main("Вход")/*2.18*/ {_display_(Seq[Any](format.raw/*2.20*/("""
        """),_display_(Seq[Any](/*3.10*/if(loginForm.hasErrors)/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""
            <div class="alert alert-danger">
                <a class="close" data-dismiss="alert">x</a>
                """),_display_(Seq[Any](/*6.18*/if(loginForm.errors.size() > 0)/*6.49*/ {_display_(Seq[Any](format.raw/*6.51*/("""
                    """),_display_(Seq[Any](/*7.22*/for((key, value) <- loginForm.errors) yield /*7.59*/ {_display_(Seq[Any](format.raw/*7.61*/("""
                        """),_display_(Seq[Any](/*8.26*/for(err <- value) yield /*8.43*/ {_display_(Seq[Any](format.raw/*8.45*/("""
                            <p>"""),_display_(Seq[Any](/*9.33*/err/*9.36*/.message().toString())),format.raw/*9.57*/("""</p>
                        """)))})),format.raw/*10.26*/("""
                    """)))})),format.raw/*11.22*/("""
                """)))})),format.raw/*12.18*/("""
            </div>
        """)))})),format.raw/*14.10*/("""
        """),_display_(Seq[Any](/*15.10*/helper/*15.16*/.form(routes.Auth.auth())/*15.41*/ {_display_(Seq[Any](format.raw/*15.43*/("""
            <h2 class="form-signin-heading">Вход</h2>
            """),format.raw/*17.96*/("""
            """),_display_(Seq[Any](/*18.14*/input(loginForm("email"), "Email", 'type -> "text"))),format.raw/*18.65*/("""
            """),_display_(Seq[Any](/*19.14*/input(loginForm("password"), "Пароль", 'type -> "password"))),format.raw/*19.73*/("""

            <div class="form-group">
                <button type="submit" class="btn btn-primary">Войти</button> или
                <a href=""""),_display_(Seq[Any](/*23.27*/routes/*23.33*/.Auth.signup())),format.raw/*23.47*/("""" class="btn btn-default">Зарегистрироваться</a>

            </div>
        """)))})),format.raw/*26.10*/("""
    """)))})),format.raw/*27.6*/("""
"""))}
    }
    
    def render(loginForm:Form[Login]): play.api.templates.HtmlFormat.Appendable = apply(loginForm)
    
    def f:((Form[Login]) => play.api.templates.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 19 11:09:17 IRKT 2017
                    SOURCE: C:/playHero/play-2.2.6/play-2.2.6/ProBob-Amazon-Heroku/app/views/login.scala.html
                    HASH: 9725cf83ca5055d1f7ba52fa0d216a13b88842ea
                    MATRIX: 779->1|897->25|938->32|958->44|997->46|1043->57|1074->80|1113->82|1274->208|1313->239|1352->241|1410->264|1462->301|1501->303|1563->330|1595->347|1634->349|1703->383|1714->386|1756->407|1819->438|1874->461|1925->480|1988->511|2035->522|2050->528|2084->553|2124->555|2221->707|2272->722|2345->773|2396->788|2477->847|2663->997|2678->1003|2714->1017|2827->1098|2865->1105
                    LINES: 26->1|29->1|30->2|30->2|30->2|31->3|31->3|31->3|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|39->11|40->12|42->14|43->15|43->15|43->15|43->15|45->17|46->18|46->18|47->19|47->19|51->23|51->23|51->23|54->26|55->27
                    -- GENERATED --
                */
            