
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
object register extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Register],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(regForm: Form[Register]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.27*/("""
    """),_display_(Seq[Any](/*2.6*/main("Регистрация")/*2.25*/ {_display_(Seq[Any](format.raw/*2.27*/("""
        """),_display_(Seq[Any](/*3.10*/if(regForm.hasErrors)/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""
            <div class="alert alert-danger">
                <a class="close" data-dismiss="alert">x</a>
                """),_display_(Seq[Any](/*6.18*/if(regForm.errors.size() > 0)/*6.47*/ {_display_(Seq[Any](format.raw/*6.49*/("""
                    """),_display_(Seq[Any](/*7.22*/for((key, value) <- regForm.errors) yield /*7.57*/ {_display_(Seq[Any](format.raw/*7.59*/("""
                        """),_display_(Seq[Any](/*8.26*/for(err <- value) yield /*8.43*/ {_display_(Seq[Any](format.raw/*8.45*/("""
                            <p>"""),_display_(Seq[Any](/*9.33*/err/*9.36*/.message().toString())),format.raw/*9.57*/("""</p>
                        """)))})),format.raw/*10.26*/("""
                    """)))})),format.raw/*11.22*/("""
                """)))})),format.raw/*12.18*/("""
            </div>
        """)))})),format.raw/*14.10*/("""

        """),_display_(Seq[Any](/*16.10*/helper/*16.16*/.form(routes.Auth.register())/*16.45*/ {_display_(Seq[Any](format.raw/*16.47*/("""
            """),_display_(Seq[Any](/*17.14*/input(regForm("email"), "Email", 'type -> "email"))),format.raw/*17.64*/("""
            """),_display_(Seq[Any](/*18.14*/input(regForm("password"), "Пароль", 'type -> "password"))),format.raw/*18.71*/("""
            """),_display_(Seq[Any](/*19.14*/input(regForm("easyAccess"),"easy access",'type -> "text"))),format.raw/*19.72*/("""
            <div class="form-group">
                <button type="submit" class="btn btn-primary">Зарегистрироваться</button>
            </div>
        """)))})),format.raw/*23.10*/("""
    """)))})))}
    }
    
    def render(regForm:Form[Register]): play.api.templates.HtmlFormat.Appendable = apply(regForm)
    
    def f:((Form[Register]) => play.api.templates.HtmlFormat.Appendable) = (regForm) => apply(regForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 26 11:32:19 IRKT 2017
                    SOURCE: C:/Users/vshir/Documents/play-2.2.6/ProBob-Amazon-Heroku/app/views/register.scala.html
                    HASH: 897fdc39971ee45fbca7cbb419bd209419beefe7
                    MATRIX: 785->1|904->26|945->33|972->52|1011->54|1057->65|1086->86|1125->88|1286->214|1323->243|1362->245|1420->268|1470->303|1509->305|1571->332|1603->349|1642->351|1711->385|1722->388|1764->409|1827->440|1882->463|1933->482|1996->513|2045->526|2060->532|2098->561|2138->563|2189->578|2261->628|2312->643|2391->700|2442->715|2522->773|2714->933
                    LINES: 26->1|29->1|30->2|30->2|30->2|31->3|31->3|31->3|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|39->11|40->12|42->14|44->16|44->16|44->16|44->16|45->17|45->17|46->18|46->18|47->19|47->19|51->23
                    -- GENERATED --
                */
            