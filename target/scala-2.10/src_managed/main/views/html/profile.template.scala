
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
object profile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[ChangePassword],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[ChangePassword]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.30*/("""
    """),_display_(Seq[Any](/*2.6*/main("Профиль")/*2.21*/ {_display_(Seq[Any](format.raw/*2.23*/("""
        """),_display_(Seq[Any](/*3.10*/if(form.hasErrors)/*3.28*/ {_display_(Seq[Any](format.raw/*3.30*/("""
            <div class="alert alert-danger">
                <a class="close" data-dismiss="alert">x</a>
                """),_display_(Seq[Any](/*6.18*/if(form.errors.size() > 0)/*6.44*/ {_display_(Seq[Any](format.raw/*6.46*/("""
                    """),_display_(Seq[Any](/*7.22*/for((key, value) <- form.errors) yield /*7.54*/ {_display_(Seq[Any](format.raw/*7.56*/("""
                        """),_display_(Seq[Any](/*8.26*/for(err <- value) yield /*8.43*/ {_display_(Seq[Any](format.raw/*8.45*/("""
                            <p>"""),_display_(Seq[Any](/*9.33*/err/*9.36*/.message().toString())),format.raw/*9.57*/("""</p>
                        """)))})),format.raw/*10.26*/("""
                    """)))})),format.raw/*11.22*/("""
                """)))})),format.raw/*12.18*/("""
            </div>
        """)))})),format.raw/*14.10*/("""
        <h1>Профиль</h1>
        """),_display_(Seq[Any](/*16.10*/Auth/*16.14*/.currentUserEmail())),format.raw/*16.33*/("""
        <h3>Изменение пароля</h3>
        """),_display_(Seq[Any](/*18.10*/helper/*18.16*/.form(routes.Admin.changePassword())/*18.52*/ {_display_(Seq[Any](format.raw/*18.54*/("""
            """),_display_(Seq[Any](/*19.14*/input(form("password"), "Текущий пароль", 'type -> "password"))),format.raw/*19.76*/("""
            """),_display_(Seq[Any](/*20.14*/input(form("newPassword"), "Новый пароль", 'type -> "password"))),format.raw/*20.77*/("""
            <div class="form-group">
                <button type="submit" class="btn btn-primary">Изменить</button>
            </div>
        """)))})),format.raw/*24.10*/("""
    """)))})))}
    }
    
    def render(form:Form[ChangePassword]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[ChangePassword]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 25 00:57:47 IRKT 2017
                    SOURCE: C:/Users/vshir/Documents/play-2.2.6/ProBob-Amazon-Heroku/app/views/profile.scala.html
                    HASH: 9fb1459a6a52d89a44792e39753fdb619586d310
                    MATRIX: 790->1|912->29|953->36|976->51|1015->53|1061->64|1087->82|1126->84|1287->210|1321->236|1360->238|1418->261|1465->293|1504->295|1566->322|1598->339|1637->341|1706->375|1717->378|1759->399|1822->430|1877->453|1928->472|1991->503|2064->540|2077->544|2118->563|2200->609|2215->615|2260->651|2300->653|2351->668|2435->730|2486->745|2571->808|2753->958
                    LINES: 26->1|29->1|30->2|30->2|30->2|31->3|31->3|31->3|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|39->11|40->12|42->14|44->16|44->16|44->16|46->18|46->18|46->18|46->18|47->19|47->19|48->20|48->20|52->24
                    -- GENERATED --
                */
            